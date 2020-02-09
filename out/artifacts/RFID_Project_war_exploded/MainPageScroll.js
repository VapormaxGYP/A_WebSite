window.onload = function () {
    var scroll = document.getElementsByClassName("scroll")[0];
    var panel = document.getElementsByClassName("panel");

    var clientH = window.innerHeight;
    var clientW = window.innerWidth;
    scroll.style.height = clientH + "px";
    for (var i = 0; i < panel.length; i++) {
        panel[i].style.height = clientH + "px";
        panel[i].style.width = clientW +"px";
    }

}

