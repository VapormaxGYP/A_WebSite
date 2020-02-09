<%--
  Created by IntelliJ IDEA.
  User: guoyoupeng
  Date: 2020-02-06
  Time: 09:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>RFID Timing System</title>
    <link rel="stylesheet" type="text/css" href="../CSS/Login.css">
    <script type="text/javascript" src="../JS/RFID_Login_Js.js"></script>
</head>

<body>
<div class="box">

    <h2 >LOG IN</h2>

    <form action="/login" method="post">

        <div class="inputBox">
            <input id="userID" type="text" name="userID" required="" autocomplete="off">
            <label>UserName</label>
        </div>

        <div class="inputBox">
            <input id="passWord" type="password" name="passWord" required="" autocomplete="off">
            <label>PassWord</label>
        </div>

        <input  class="submit" type="submit" name="" value="GO"  >
        <input class="button" type="button" name="" value="to Sign up" onclick="jumpToSign()">

    </form>

</div>

</body>
</html>