<%-- 
    Document   : valid_auteur
    Created on : 9 janv. 2019, 11:01:37
    Author     : KHALID-RAMI
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Admin</title>
    </head>
    <body>
<%@ page import ="java.sql.*" %>
<%
    String username = request.getParameter("username");    
    String password = request.getParameter("password");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/uml_jee",
            "root", "");
    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("select * from auteur where username='" + username + "' and password='" + password + "'");
    if (rs.next()) {
        session.setAttribute("username", username);
        //out.println("welcome " + userid);
        //out.println("<a href='logout.jsp'>Log out</a>");
        response.sendRedirect("papier_auteur.jsp");
    } else {
        out.println("Invalid password <a href='login_auteur.jsp'>try again</a>");
    }
%>   </body>
</html>
