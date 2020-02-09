

    var currentIndex = 0;
    var container = $("#container");
    var sumCount = $(".section").length;
    var $window = $(window);

    var duration = 500;
    var animationTime = 0;

    var scrollFunc = function(e){

        if(new Date().getTime() < animationTime + duration)
        {
            return;
        }

        e = e || window.event;

        var t  = 0 ;

        if(e.wheelDelta)
        {
            t = e.wheelDelta;

            if(t > 0 && currentIndex > 0)
            {
                moveUp();
            }

            else if(t < 0 && currentIndex < sumCount - 1)
            {
                moveDown();
            }

        }
    };

    function moveUp()
    {
        animationTime = new Date().getTime(); // Get the time when the animation will begin

        container.css("transform", "translate3D(0, -" + (--currentIndex) * $window.height() + "px, 0)");
    }

    function moveDown()
    {
        animationTime = new Date().getTime();
        container.css("transform", "translate3D(0, -" + (++currentIndex) * $window.height() + "px, 0)");
    }

    function init(){

        if (document.addEventListener) {
            document.addEventListener('DOMMouseScroll', scrollFunc, false);
        }
        window.onmousewheel = document.onmousewheel = scrollFunc;//IE/Opera/Chrome

        container.css({
            "transition": "all 0.5s",
            "-moz-transition": "all 0.5s",
            "-webkit-transition": "all 0.5s"
        });
    }

    init();



