function openCode(evt, codeName) {
  // is already active tab -> toggle it
  
  if (evt.currentTarget.classList.contains("active")) {
    evt.currentTarget.classList.remove("active");
    document.getElementById(codeName).style.display = "none";
    return;
  }

  // Declare all variables
  var i, tabcontent, tablinks;

  // Get all elements with class="code-tabcontent" and hide them
  tabcontent = document.getElementsByClassName("code-tabcontent");
  for (i = 0; i < tabcontent.length; i++) {
    tabcontent[i].style.display = "none";
  }

  // Get all elements with class="code-tablinks" and remove the class "active"
  tablinks = document.getElementsByClassName("code-tablinks");
  for (i = 0; i < tablinks.length; i++) {
    tablinks[i].className = tablinks[i].className.replace(" active", "");
  }

  // Show the current tab, and add an "active" class to the button that opened the tab
  document.getElementById(codeName).style.display = "block";
  evt.currentTarget.className += " active";
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