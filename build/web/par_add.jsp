<%-- 
    Document   : par_add
    Created on : 4 janv. 2019, 23:08:29
    Author     : KHALID-RAMI
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="javax.swing.JOptionPane"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.entites.Conference"%>
<%@page import="com.dao.conferencedao"%>
<%@page import="com.metier.IAdmin"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
 


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
     
        <sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
         url = "jdbc:mysql://localhost/uml_jee"
         user = "root"  password = ""/>
         <sql:setDataSource var="dbsource" driver="com.mysql.jdbc.Driver"
                           url="jdbc:mysql://localhost/uml_jee"
                           user="root"  password=""/>
 
 
        <sql:update dataSource="${dbsource}" var="result">
            INSERT INTO participant(name,last_name,email,phone_number,adress,username,password) VALUES (?,?,?,?,?,?,?);
            <sql:param value="${param.name}" />
            <sql:param value="${param.last_name}" />
                        <sql:param value="${param.email}" />

                                    <sql:param value="${param.phone_number}" />
            <sql:param value="${param.adress}" />
            <sql:param value="${param.username}" />
            <sql:param value="${param.password}" />


        </sql:update>

            <%
                response.sendRedirect("/test_jee/auter_int.jsp");
                %>
    </body>
</html>
