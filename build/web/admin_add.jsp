<%-- 
    Document   : admin_add
    Created on : 3 janv. 2019, 18:21:07
    Author     : KHALID-RAMI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.entites.Admin"%>
<%@page import="com.dao.Admindao"%>
<%@page import="com.metier.IAdmin"%>



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String first_name = request.getParameter("FirstName");
            String last_name = request.getParameter("LastName");
            String email = request.getParameter("email");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            Admin n = new Admin(0, first_name, last_name, email, username, password);
            Admindao d = new Admindao();
            d.add(n);
            response.sendRedirect("/test_jee/Admin.jsp");
            %>
        
    </body>
</html>
