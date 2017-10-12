function callbackend() {

    $.ajax({
        type: "GET",
        url: "http://localhost:8080/response/",
        crossdomain:true,
        headers: {
            Accept: "text/plain; charset=utf-8",
           "Content-Type": "text/plain; charset=utf-8",
        },
        success: function (data) {
            if (data == 'Success') {
              $("#bottom").hide();
              document.getElementById('img1').src="../images/Success.png";
            } else if (data == 'dream') {
              $("#bottom").hide();
              document.getElementById('img1').src="../images/dream.jpg";
            } else if (data == 'aim') {
              $("#bottom").hide();
              document.getElementById('img1').src="../images/aim.jpg";
            }
        },
        error: function (error) {
              document.getElementById('img1').src="../images/error.jpg";
        }
    });
}