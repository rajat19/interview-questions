const openCode = (evt, codeName) => {
  const { currentTarget } = evt;

  if (currentTarget.classList.contains("active")) {
    currentTarget.classList.remove("active");
    document.getElementById(codeName).classList.remove('active');
    return;
  }

  document.querySelectorAll(".code-tab-content, .code-tab-link").forEach((element) => {
    element.classList.remove('active');
  });

  document.getElementById(codeName).classList.add('active');
  currentTarget.classList.add('active');
};

const clearPostData = () => {
  const mobileDiv = document.querySelector('.post-data-only-mobile');
  document.getElementById('post-data').innerHTML = '';
  mobileDiv.classList.remove('active');
  mobileDiv.innerHTML = '';
};

const showFilter = (filterType, filterValue) => {
  clearPostData();
  document.querySelectorAll('.post-link').forEach((postLink) => {
    postLink.classList.remove('active');
  });

  document.querySelectorAll('.home-box li').forEach((li) => {
    li.style.display = 'block';
    const filterClass = filterType === 'topic' ? 'topic-' : 'company-';
    if (!li.classList.contains(`${filterClass}${filterValue}`)) {
      li.style.display = 'none';
    }
  });

  const dropdown = document.getElementById(`${filterType}-dropdown`);
  dropdown.value = filterValue;
  document.querySelector('.home-post-list').scrollTop;
};

const showTopic = (topicValue) => showFilter('topic', topicValue);
const showCompany = (companyValue) => showFilter('company', companyValue);

document.addEventListener('DOMContentLoaded', () => {
  document.querySelectorAll(".post-link").forEach((postLink) => {
    postLink.addEventListener("click", (e) => {
      e.preventDefault();
      document.querySelectorAll('.post-link').forEach((link) => {
        link.classList.remove('active');
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
        if (sibling.classList.contains('active')) {
          sibling.innerHTML = '';
          sibling.classList.remove('active');
          return;
        }

        clearPostData();
        sibling.innerHTML = '';
        fetch(href)
            .then(response => response.text())
            .then(data => {
              sibling.innerHTML = data;
              sibling.classList.add('active');
              sibling.scrollTop;
            })
            .catch(error => console.error('Error fetching data:', error));
      }
      postLink.classList.add('active');
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

  document.getElementById('search-box').addEventListener('keyup', (event) => {
    clearPostData();
    document.querySelectorAll('.post-link').forEach((link) => {
      link.classList.remove('active');
    });

    const value = event.target.value.toLowerCase();
    document.querySelectorAll(".home-box li").forEach((li) => {
      li.style.display = li.textContent.toLowerCase().includes(value) ? 'block' : 'none';
    });

    document.querySelector('.home-post-list').scrollTop;
  });
});
