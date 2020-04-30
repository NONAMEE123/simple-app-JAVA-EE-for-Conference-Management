<%-- 
    Document   : inscri_participant
    Created on : 9 janv. 2019, 11:26:02
    Author     : KHALID-RAMI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<!DOCTYPE html>
<html>
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
                response.sendRedirect("/test_jee/login_participant.jsp");
                %>
    </body>
</html>

