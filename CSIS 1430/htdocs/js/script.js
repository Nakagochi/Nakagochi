/*SMOOTH SCROLLING*/
$(document).ready(function() {
    $('.navbar a').on('click', function(event) {
        if (this.hash !== "") {
            event.preventDefault();
            let hash = this.hash;
            $('body, html').animate({ scrollTop: $(hash).offset().top },
                900,
                function() {
                    window.location.hash = hash;
                }
            );
        }
    });
});


/*SLIDE-IN ELEMENTS*/
$(window).scroll(function() {
    $(".slideAnimation").each(function() {
        var pos = $(this).offset().top;
        var winTop = $(window).scrollTop();
        if (pos < winTop + 600) {
            $(this).addClass("slide");
        }
    });
});