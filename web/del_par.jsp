<%-- 
    Document   : del_par
    Created on : 4 janv. 2019, 22:41:49
    Author     : KHALID-RAMI
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
       //CONECTANOD A LA BASE DE DATOS:
       Connection con;       
       String url="jdbc:mysql://localhost:3306/uml_jee";
       String Driver="com.mysql.jdbc.Driver";
       String user="root";
       String clave="";
       Class.forName(Driver);
       con=DriverManager.getConnection(url,user,clave);
       //Emnpezamos Listando los Datos de la Tabla Usuario pero de la fila seleccionada
       PreparedStatement ps;       
       int id=Integer.parseInt(request.getParameter("id"));
       ps=con.prepareStatement("delete from participant where id="+id);
       ps.executeUpdate();
       response.sendRedirect("Participants.jsp");
       
       %>
    </body>
</html>
