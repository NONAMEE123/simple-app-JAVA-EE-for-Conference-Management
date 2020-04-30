<%-- 
    Document   : conf_add
    Created on : 4 janv. 2019, 12:01:22
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
            INSERT INTO conference(title,start_date,end_date,date_conf,location,description,date_limite) VALUES (?,?,?,?,?,?,?);
            <sql:param value="${param.title}" />
            <sql:param value="${param.start_date}" />
                        <sql:param value="${param.end_date}" />

                                    <sql:param value="${param.date_conf}" />
            <sql:param value="${param.location}" />
            <sql:param value="${param.description}" />
            <sql:param value="${param.date_limite}" />

        </sql:update>

            <%
                response.sendRedirect("/test_jee/Conference.jsp");
                %>
    </body>
</html>

