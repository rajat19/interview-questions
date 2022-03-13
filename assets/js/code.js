function openCode(evt, codeName) {
  if (evt.currentTarget.classList.contains("active")) {
    evt.currentTarget.classList.remove("active");
    document.getElementById(codeName).classList.remove('active');
    return;
  }
  const tabContents = document.getElementsByClassName("code-tab-content");
  for (let tabContent of tabContents) {
    tabContent.classList.remove('active');
  }
  
  const tabLinks = document.getElementsByClassName("code-tab-link");
  for(let tabLink of tabLinks) {
    tabLink.classList.remove('active');
  }
  
  document.getElementById(codeName).classList.add('active');
  evt.currentTarget.classList.add('active');
}

function clearPostData() {
  const mobileDiv = $('.post-data-only-mobile');
  $('#post-data').empty();
  mobileDiv.removeClass('active');
  mobileDiv.empty();
}

function showTopic(topicValue) {
  clearPostData();
  $('.post-link').removeClass('active');
  $('.home-box li').show().filter(`:not(.topic-${topicValue})`).toggle();
  $('#topic-dropdown option[value='+topicValue+']').attr('selected', 'selected');
  $('.home-post-list').scrollTop;
}

$(function() {
  $(".post-link").on("click",function(e) {
    e.preventDefault();
    $('.post-link').removeClass('active');
    $(this).addClass('active');
    if ($(window).width() >= 800) {
      clearPostData();
      const postData = $('#post-data');
      postData.load(this.href);
      postData.scrollTop;
    } else {
      const sibling = $(this).siblings('.post-data-only-mobile');
      if (sibling.hasClass('active')) {
        sibling.empty();
        sibling.removeClass('active');
        return;
      }
      clearPostData();
      sibling.load(this.href);
      sibling.addClass('active');
      sibling.scrollTop;
    }
  });

  $('#topic-dropdown').change(() => {
    const selected = $('#topic-dropdown').val();
    showTopic(selected);
  });

  $('#search-box').on('keyup', function () {
    clearPostData();
    $('.post-link').removeClass('active');
    const value = $(this).val().toLowerCase();
    $(".home-box li").show().filter(function() {
      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
    });
    $('.home-post-list').scrollTop;
  });
});