<%-- 
    Document   : deladmin
    Created on : 3 janv. 2019, 22:48:54
    Author     : KHALID-RAMI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<%@page import="com.dao.Admindao" %>
<%@page import="com.entites.Admin" %>


    <%
try {
     String id = request.getParameter("id");
            Admindao pi = new Admindao();
            pi.delete(Integer.parseInt(id));
} catch(NumberFormatException e) {
            response.sendRedirect("Admin.jsp");

}
  
%>
</body>
</html>
