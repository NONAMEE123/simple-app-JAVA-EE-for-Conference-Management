<%-- 
    Document   : logout_auteur
    Created on : 11 janv. 2019, 01:09:22
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
response.sendRedirect("login_auteur.jsp");
%>    </body>
</html>
