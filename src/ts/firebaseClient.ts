import { initializeApp } from 'firebase/app'
import { getAuth, GoogleAuthProvider, onAuthStateChanged, signInWithPopup, signOut } from 'firebase/auth'
import { getFirestore, doc, getDocs, setDoc, deleteDoc, collection, serverTimestamp } from 'firebase/firestore'

const firebaseConfig = {
  apiKey: 'AIzaSyC7U1Z5-wQO9gC4XLPxFD05Ro78x8r66ME',
  authDomain: 'interview-prep-rajat19.firebaseapp.com',
  projectId: 'interview-prep-rajat19',
  storageBucket: 'interview-prep-rajat19.firebasestorage.app',
  messagingSenderId: '914353254193',
  appId: '1:914353254193:web:e5fc4f1cbd1a7dfd350a10',
  measurementId: 'G-ELKGVNWZQK'
}

const app = initializeApp(firebaseConfig)
const auth = getAuth(app)
const db = getFirestore(app)
const provider = new GoogleAuthProvider()

function updateUI(user: any) {
  const loginBtn = document.getElementById('login-btn') as HTMLElement | null
  const logoutBtn = document.getElementById('logout-btn') as HTMLElement | null
  const userInfo = document.getElementById('user-info') as HTMLElement | null
  const userName = document.getElementById('user-name') as HTMLElement | null
  const userPhoto = document.getElementById('user-photo') as HTMLImageElement | null
  if (user) {
    if (loginBtn) loginBtn.style.display = 'none'
    if (userInfo) userInfo.style.display = 'block'
    if (userName) userName.innerText = `Hi, ${user.displayName}`
    if (userPhoto) {
      if (user.photoURL) { userPhoto.src = user.photoURL; userPhoto.style.display = 'inline-block' }
      else { userPhoto.style.display = 'none' }
    }
  } else {
    if (loginBtn) loginBtn.style.display = 'inline-block'
    if (userInfo) userInfo.style.display = 'none'
  }
}

document.getElementById('login-btn')?.addEventListener('click', async () => {
  await signInWithPopup(auth, provider)
})
document.getElementById('logout-btn')?.addEventListener('click', async () => {
  await signOut(auth)
})

// bookmarks
const BOOKMARK_CACHE_KEY = 'bookmarks_cache_v1'
const getCacheKey = (uid: string) => `${BOOKMARK_CACHE_KEY}_${uid}`
const getBookmarks = (uid: string) => {
  try { const raw = localStorage.getItem(getCacheKey(uid)); return raw ? JSON.parse(raw) : {} } catch { return {} }
}
const saveBookmarks = (uid: string, data: any) => localStorage.setItem(getCacheKey(uid), JSON.stringify(data))
const toggleIcon = (el: HTMLElement, bookmarked: boolean) => {
  el.classList.toggle('fa-solid', bookmarked)
  el.classList.toggle('fa-regular', !bookmarked)
  el.classList.toggle('bookmarked', bookmarked)
  el.title = bookmarked ? 'Remove bookmark' : 'Bookmark this post'
  el.classList.remove('animate'); void (el as any).offsetWidth; el.classList.add('animate')
}
const disableAllBookmarkIcons = () => {
  document.querySelectorAll('.bookmark-icon').forEach((el) => {
    (el as HTMLElement).classList.add('disabled')
    ;(el as HTMLElement).setAttribute('title','Login to bookmark this post')
  })
}

async function loadBookmarks(uid: string) {
  const snapshot = await getDocs(collection(doc(collection(doc(db, 'users'), uid), 'bookmarks')))
  const all: Record<string, any> = {}
  snapshot.forEach((d: any) => { all[d.id] = d.data() })
  saveBookmarks(uid, all)
}

function attachBookmarkHandlers(uid: string) {
  const cache = getBookmarks(uid)
  document.querySelectorAll('.bookmark-icon').forEach((el) => {
    const slug = (el as HTMLElement).dataset.slug
    const title = (el as HTMLElement).dataset.title
    if (!slug) return
    toggleIcon(el as HTMLElement, !!cache[slug])
    if (!(el as HTMLElement).dataset.bound) {
      ;(el as HTMLElement).onclick = async () => {
        const ref = doc(collection(doc(collection(doc(db, 'users'), uid), 'bookmarks')), slug)
        if (cache[slug]) {
          await deleteDoc(ref)
          delete cache[slug]
          saveBookmarks(uid, cache)
          toggleIcon(el as HTMLElement, false)
        } else {
          await setDoc(ref, { slug, title, timestamp: serverTimestamp() })
          cache[slug] = { title }
          saveBookmarks(uid, cache)
          toggleIcon(el as HTMLElement, true)
        }
      }
      ;(el as HTMLElement).dataset.bound = 'true'
    }
  })
}

function watchForDynamic(selector: string, cb: () => void) {
  const observer = new MutationObserver(cb)
  observer.observe(document.body, { childList: true, subtree: true })
}

onAuthStateChanged(auth, async (user) => {
  updateUI(user)
  if (!user) { disableAllBookmarkIcons(); watchForDynamic('.bookmark-icon', disableAllBookmarkIcons); return }
  const uid = user.uid
  if (Object.keys(getBookmarks(uid)).length === 0) await loadBookmarks(uid)
  attachBookmarkHandlers(uid)
  watchForDynamic('.bookmark-icon', () => attachBookmarkHandlers(uid))
})



