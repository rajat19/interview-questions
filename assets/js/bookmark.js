const BOOKMARK_CACHE_KEY = "bookmarks_cache_v1";
const db = firebase.firestore();

function getCacheKey(uid) {
    return `${BOOKMARK_CACHE_KEY}_${uid}`;
}

function getBookmarks(uid) {
    try {
        const raw = localStorage.getItem(getCacheKey(uid));
        return raw ? JSON.parse(raw) : {};
    } catch {
        return {};
    }
}

function saveBookmarks(uid, data) {
    localStorage.setItem(getCacheKey(uid), JSON.stringify(data));
}

function isBookmarked(uid, slug) {
    return !!getBookmarks(uid)[slug];
}

function toggleIcon(el, bookmarked) {
    el.classList.toggle("fa-solid", bookmarked);
    el.classList.toggle("fa-regular", !bookmarked);
    el.classList.toggle("bookmarked", bookmarked);
    el.title = bookmarked ? "Remove bookmark" : "Bookmark this post";

    el.classList.remove("animate"); // restart it
    void el.offsetWidth;            // force reflow
    el.classList.add("animate");
}

function toggleBookmark(el, uid) {
    const slug = el.dataset.slug;
    const title = el.dataset.title;
    const cache = getBookmarks(uid);

    const ref = db.collection("users").doc(uid).collection("bookmarks").doc(slug);

    if (cache[slug]) {
        ref.delete().then(() => {
            delete cache[slug];
            saveBookmarks(uid, cache);
            toggleIcon(el, false);
        });
    } else {
        ref.set({
            slug,
            title,
            timestamp: firebase.firestore.FieldValue.serverTimestamp()
        }).then(() => {
            cache[slug] = { title };
            saveBookmarks(uid, cache);
            toggleIcon(el, true);
        });
    }
}

async function loadBookmarks(uid) {
    const snapshot = await db.collection("users").doc(uid).collection("bookmarks").get();
    const all = {};
    snapshot.forEach(doc => {
        all[doc.id] = doc.data();
    });
    saveBookmarks(uid, all);
}

// ✅ Attach handlers to all current .bookmark-icon elements
function attachBookmarkHandlers(uid) {
    const cache = getBookmarks(uid);
    document.querySelectorAll(".bookmark-icon").forEach(el => {
        const slug = el.dataset.slug;
        if (!slug) return;

        const bookmarked = !!cache[slug];
        toggleIcon(el, bookmarked);

        // Avoid double-attaching click
        if (!el.dataset.bound) {
            el.onclick = () => toggleBookmark(el, uid);
            el.dataset.bound = "true"; // mark as bound
        }
    });
}

// ✅ MutationObserver to catch dynamic .bookmark-icon insertions
function watchForDynamicBookmarks(uid) {
    const observer = new MutationObserver(() => {
        attachBookmarkHandlers(uid);
    });

    observer.observe(document.body, {
        childList: true,
        subtree: true
    });
}

function disableAllBookmarkIcons() {
    document.querySelectorAll(".bookmark-icon").forEach(el => {
        el.classList.add("disabled");
        el.title = "Login to bookmark this post";
    });
}

function watchForDynamicBookmarkIconsWhenLoggedOut() {
    const observer = new MutationObserver(() => {
        disableAllBookmarkIcons(); // disable any new icons
    });

    observer.observe(document.body, {
        childList: true,
        subtree: true
    });
}

// ✅ Main logic: auth + load + bind
firebase.auth().onAuthStateChanged(async user => {
    if (!user) {
        disableAllBookmarkIcons(); // once for already-rendered icons
        watchForDynamicBookmarkIconsWhenLoggedOut(); // for future icons
        return;
    }

    const uid = user.uid;
    const existing = getBookmarks(uid);

    if (Object.keys(existing).length === 0) {
        await loadBookmarks(uid);
    }

    attachBookmarkHandlers(uid);
    watchForDynamicBookmarks(uid);
});
