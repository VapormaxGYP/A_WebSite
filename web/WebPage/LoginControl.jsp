<%--
  Created by IntelliJ IDEA.
  User: guoyoupeng
  Date: 2020-02-09
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Object user = session.getAttribute("User");
    if(user == null)
    {
        response.sendRedirect("RFID_Login.jsp");
    }
%>