<%-- 
    Document   : logout_par
    Created on : 10 janv. 2019, 16:11:08
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
response.sendRedirect("login_participant.jsp");
%>    </body>
</html>
