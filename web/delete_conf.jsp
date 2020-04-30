<%-- 
    Document   : delete_conf
    Created on : 4 janv. 2019, 11:49:37
    Author     : KHALID-RAMI
--%>

<%@page import="com.dao.conferencedao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
 <%
try {
     String title = request.getParameter("title");
            conferencedao pi = new conferencedao();
           pi.delete(title);
} catch(NumberFormatException e) {
            response.sendRedirect("Conference.jsp");

}
  
%>    </body>
</html>
