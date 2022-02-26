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

function showTag(tagValue) {
  $('#post-data').empty();
  $('.problem').css('display', 'none');
  $('.tag-'+tagValue).css('display', 'flex');
  $('#tag-dropdown option[value='+tagValue+']').attr('selected', 'selected');
}

$(function() {
  $(".post-link").on("click",function(e) {
    e.preventDefault();
    $('.post-link').removeClass('active');
    $(this).addClass('active');
    $('#post-data').load(this.href);
  });

  $('#tag-dropdown').change(() => {
    const selected = $('#tag-dropdown').val();
    showTag(selected);
  });
});