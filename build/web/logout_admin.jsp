<%-- 
    Document   : logout_admin
    Created on : 9 janv. 2019, 10:41:26
    Author     : KHALID-RAMI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<%
session.setAttribute("username", null);
session.invalidate();
response.sendRedirect("Admin_login.jsp");
%>    </body>
</html>
