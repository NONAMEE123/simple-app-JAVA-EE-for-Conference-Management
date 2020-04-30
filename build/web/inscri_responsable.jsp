<%-- 
    Document   : inscri_responsable
    Created on : 8 janv. 2019, 21:46:00
    Author     : KHALID-RAMI
--%>

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
        
     
        
         <sql:setDataSource var="dbsource" driver="com.mysql.jdbc.Driver"
                           url="jdbc:mysql://localhost/uml_jee"
                           user="root"  password=""/>
 
 
        <sql:update dataSource="${dbsource}" var="result">
            INSERT INTO responsable(first_name,last_name,email,username,password) VALUES (?,?,?,?,?);
            <sql:param value="${param.first_name}" />
            <sql:param value="${param.last_name}" />
                        <sql:param value="${param.email}" />
                                    <sql:param value="${param.username}" />
              <sql:param value="${param.password}" />


        </sql:update>

            <%
                response.sendRedirect("/test_jee/responsable_login.jsp");
                %>
    </body>
</html>
