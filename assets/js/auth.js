const firebaseConfig = {
    apiKey: "AIzaSyC7U1Z5-wQO9gC4XLPxFD05Ro78x8r66ME",
    authDomain: "interview-prep-rajat19.firebaseapp.com",
    projectId: "interview-prep-rajat19",
    storageBucket: "interview-prep-rajat19.firebasestorage.app",
    messagingSenderId: "914353254193",
    appId: "1:914353254193:web:e5fc4f1cbd1a7dfd350a10",
    measurementId: "G-ELKGVNWZQK"
};

firebase.initializeApp(firebaseConfig);

const provider = new firebase.auth.GoogleAuthProvider();

document.getElementById('login-btn').addEventListener('click', function () {
    firebase.auth().signInWithPopup(provider)
        .then(result => {
            const user = result.user;
            updateUI(user); // ✅ Show logout, hide login
        })
        .catch(console.error);
});

document.getElementById('logout-btn').addEventListener('click', function () {
    firebase.auth().signOut().then(() => {
        updateUI(null); // ✅ Show login, hide logout
    });
});

firebase.auth().onAuthStateChanged(function(user) {
    updateUI(user); // 🔁 Always update UI based on user state
});

function updateUI(user) {
    if (user) {
        document.getElementById('login-btn').style.display = 'none';
        document.getElementById('user-info').style.display = 'block';
        document.getElementById('user-name').innerText = `Hi, ${user.displayName}`;
        const photo = document.getElementById('user-photo');
        if (user.photoURL) {
            photo.src = user.photoURL;
            photo.style.display = 'inline-block';
        } else {
            photo.style.display = 'none';
        }
    } else {
        document.getElementById('login-btn').style.display = 'inline-block';
        document.getElementById('user-info').style.display = 'none';
    }
}