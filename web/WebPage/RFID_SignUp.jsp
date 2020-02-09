<%--
  Created by IntelliJ IDEA.
  User: guoyoupeng
  Date: 2020-02-08
  Time: 09:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>RFID Timing System</title>
    <link rel="stylesheet" type="text/css" href="../CSS/Register.css">
    <script rel="script" type="text/javascript" src="../JS/Regist_js.js"></script>
</head>

<body>

<div class="box">

    <h2>SIGN UP</h2>

    <form action="/SignUp" method="post">

        <div class="inputBox">
            <input id="UserName" type="text" name="userID" required="" autocomplete="off">
            <label>UserName</label>
        </div>

        <div class="inputBox">
            <input id="PassWord" type="text" name="passWord" required="" autocomplete="off">
            <label>PassWord</label>
        </div>
        <div class="inputBox">
            <input id="EPC" type="text" name="EPC_code" required="" autocomplete="off">
            <label>EPC_Code</label>
        </div>
        <input class="submit" type="submit" name="" value="Sign Up">
        <input class="button" type="button" name="" value="to Log in" onclick="backToLogin()">
    </form>

</div>


</body>
</html>