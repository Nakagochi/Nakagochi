$(document).ready(function() {
    $('[data-toggle="tooltip"]').tooltip();
    // Add smooth scrolling to all links in navbar + footer link
    $(".navbar a, footer a[href='#myPage']").on('click', function(event) {

        // Make sure this.hash has a value before overriding default behavior
        if (this.hash !== "") {

            // Prevent default anchor click behavior
            event.preventDefault();

            // Store hash
            var hash = this.hash;

            // Using jQuery's animate() method to add smooth page scroll
            // The optional number (900) specifies the number of milliseconds it takes to scroll to the specified area
            $('html, body').animate({
                scrollTop: $(hash).offset().top
            }, 1000, function() {

                // Add hash (#) to URL when done scrolling (default click behavior)
                window.location.hash = hash;
            });
        } // End if
    });
})

function goHome() {


    document.getElementById("home-page-nav-thing").click();

}

function colapse(open) {
    switch (open) {
        case 1:
            $('#demo2').collapse("hide");
            $('#demo3').collapse("hide");

            break;
        case 2:
            $('#demo').collapse("hide");
            $('#demo3').collapse("hide");
            break;
        case 3:
            $('#demo').collapse("hide");
            $('#demo2').collapse("hide");
            break;
    }
}