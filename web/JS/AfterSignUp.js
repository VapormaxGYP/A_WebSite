var t = 5;

function showTimes()
{
    t -= 1;
    document.getElementById('showTimes').innerHTML = t;

    if(t==0)
    {
        window.location = "MainPage.jsp";

    }
    else
    {
        setTimeout("showTimes()", 1000);
    }
}

showTimes();