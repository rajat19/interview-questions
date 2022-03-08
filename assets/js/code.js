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

function showTopic(topicValue) {
  $('#post-data').empty();
  $('.problem').css('display', 'none');
  $('.topic-'+topicValue).css('display', 'flex');
  $('#topic-dropdown option[value='+topicValue+']').attr('selected', 'selected');
}

function filterForTopic() {
  const selected = $('#topic-dropdown').val();
  $('.home-box li').show().filter(`:not(.topic-${selected})`).toggle();
  $('#topic-dropdown option[value='+selected+']').attr('selected', 'selected');
}

function filterForSearchBox() {
  const value = $(this).val().toLowerCase();
  $(".home-box li").filter(function() {
    $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
  });
  // commonFilter();
}

$(function() {
  $(".post-link").on("click",function(e) {
    e.preventDefault();
    $('.post-link').removeClass('active');
    $(this).addClass('active');
    $('#post-data').load(this.href);
  });

  $('#topic-dropdown').change(() => {
    filterForTopic();
    // showTopic(selected);
  });

  $('#search-box').on('keyup', function () {
    filterForSearchBox();
  });
});