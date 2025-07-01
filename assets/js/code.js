const openCode = (evt, codeName) => {
  const { currentTarget } = evt;

  if (currentTarget.classList.contains("bg-theme")) {
    currentTarget.classList.remove("bg-theme");
    document.getElementById(codeName).classList.remove('block');
    document.getElementById(codeName).classList.add('hidden');
    return;
  }

  document.querySelectorAll(".code-tab-content, .code-tab-link").forEach((element) => {
    if (element.classList.contains('code-tab-content')) {
      element.classList.remove('block');
      element.classList.add('hidden');
    } else {
      element.classList.remove('bg-theme');
    }
  });

  document.getElementById(codeName).classList.remove('hidden');
  document.getElementById(codeName).classList.add('block');
  currentTarget.classList.add('bg-theme');
};

const clearPostData = () => {
  const mobileDiv = document.querySelector('.post-data-only-mobile');
  document.getElementById('post-data').innerHTML = '';
  mobileDiv.classList.remove('block');
  mobileDiv.classList.add('hidden');
  mobileDiv.innerHTML = '';
};

const showFilter = (filterType, filterValue) => {
  clearPostData();
  document.querySelectorAll('.post-link').forEach((postLink) => {
    postLink.classList.remove('bg-[#1e1e1e]');
  });

  document.querySelectorAll('.home-box li').forEach((li) => {
    li.classList.remove('hidden');
    if (!li.classList.contains(`${filterType}-${filterValue}`)) {
      li.classList.add('hidden');
    }
  });

  const dropdown = document.getElementById(`${filterType}-dropdown`);
  dropdown.value = filterValue;
  document.querySelector('.home-post-list').scrollTop;
};

const showTopic = (topicValue) => showFilter('topic', topicValue);
const showCompany = (companyValue) => showFilter('company', companyValue);
const showDifficulty = (difficultyValue) => showFilter('difficulty', difficultyValue);

document.addEventListener('DOMContentLoaded', () => {
  document.querySelectorAll(".post-link").forEach((postLink) => {
    postLink.addEventListener("click", (e) => {
      e.preventDefault();
      document.querySelectorAll('.post-link').forEach((link) => {
        link.classList.remove('bg-[#1e1e1e]');
      });

      const width = window.innerWidth;
      const postData = document.getElementById('post-data');
      const { href } = postLink;

      if (width >= 800) {
        clearPostData();
        postData.innerHTML = '';
        fetch(href)
            .then(response => response.text())
            .then(data => {
              postData.innerHTML = data;
              postData.scrollTop;
            })
            .catch(error => console.error('Error fetching data:', error));
      } else {
        const sibling = postLink.nextElementSibling;
        if (sibling.classList.contains('block')) {
          sibling.innerHTML = '';
          sibling.classList.remove('block');
          sibling.classList.add('hidden');
          return;
        }

        clearPostData();
        sibling.innerHTML = '';
        fetch(href)
            .then(response => response.text())
            .then(data => {
              sibling.innerHTML = data;
              sibling.classList.remove('hidden');
              sibling.classList.add('block');
              sibling.scrollTop;
            })
            .catch(error => console.error('Error fetching data:', error));
      }
      postLink.classList.add('bg-[#1e1e1e]');
    });
  });

  document.getElementById('topic-dropdown').addEventListener('change', (event) => {
    const selected = event.target.value;
    showTopic(selected);
  });

  document.getElementById('company-dropdown').addEventListener('change', (event) => {
    const selected = event.target.value;
    showCompany(selected);
  });

  document.getElementById('difficulty-dropdown').addEventListener('change', (event) => {
    const selected = event.target.value;
    showDifficulty(selected);
  });

  document.getElementById('search-box').addEventListener('keyup', (event) => {
    clearPostData();
    document.querySelectorAll('.post-link').forEach((link) => {
      link.classList.remove('bg-[#1e1e1e]');
    });

    const value = event.target.value.toLowerCase();
    document.querySelectorAll(".home-box li").forEach((li) => {
      li.classList.remove('hidden');
      if (!li.textContent.toLowerCase().includes(value)) {
        li.classList.add('hidden');
      }
    });

    document.querySelector('.home-post-list').scrollTop;
  });
});
