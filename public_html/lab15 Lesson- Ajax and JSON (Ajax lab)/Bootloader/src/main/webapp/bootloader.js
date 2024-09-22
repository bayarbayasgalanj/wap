var loading = false;

$(function () {
  $("#load").click(fetchBoot);
  createLoadingMesage();
});

function createLoadingMesage() {
  var throbber = $("<img>").attr("src", "loading.gif");
  var div = $("<div>", {
    text: "Loading...",
    id: "loading",
  })
    .append(throbber)
    .hide()
    .ajaxStart(function () {
      $(this).show();
      $("#boot").empty();
    })
    .ajaxStop(function () {
      $(this).hide();
    });

  $("#container").append(div);
}

function fetchBoot() {
  $.get("loader", {
    delay: 1,
  })
    .done(displayBoot)
    .fail(ajaxFailure);
}

function displayBoot(data) {
  $("#boot").append(
    $("<img>").attr(
      "src",
      "https://mumstudents.org/cs472/2016-03-AS-KL/Sections/8/bootloader/" +
        data,
    ),
  );
}

// display a useful error message for debugging purposes (called only if the
// Ajax request did NOT come back successfully)
function ajaxFailure(xhr, status, exception) {
  console.log(xhr, status, exception);
}
