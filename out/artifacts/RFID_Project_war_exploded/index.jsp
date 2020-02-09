<%@ page import="javax.naming.Context" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.sql.DataSource" %>
<%@ page import="javax.xml.crypto.Data" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="javax.naming.NamingException" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: guoyoupeng
  Date: 2020-01-15
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title> RFID Racing System </title>
</head>
<body>
<h1>Tomcat数据库连接测试</h1>
<%
    try
    {
        Context ctx = new InitialContext();
        Context envContext = (Context)ctx.lookup("java:/comp/env");
        DataSource ds = (DataSource) envContext.lookup("jdbc/mySqlds");
        Connection conn = ds.getConnection();

        out.println("<span style='color:red;'>JNDI测试成功<span>");

    }
    catch(NamingException e)
    {
        e.printStackTrace();
    }
    catch(SQLException e)
    {
        e.printStackTrace();
    }

%>
</body>

</html>
