<%-- 
    Document   : edit_add
    Created on : 3 janv. 2019, 22:11:11
    Author     : KHALID-RAMI
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.dao.Admindao"%>
<%@page import="com.entites.Admin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Admin Area</title>
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <script src="http://cdn.ckeditor.com/4.6.1/standard/ckeditor.js"></script>
  </head>
  <body>

    <nav class="navbar navbar-default">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="Admin.jsp">AdminStrap</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">

        </div><!--/.nav-collapse -->
      </div>
    </nav>

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
       ResultSet rs;
       String username=request.getParameter("username");
       ps=con.prepareStatement("select * from responsable where username='" + username + "'");
       rs=ps.executeQuery();
       while(rs.next()){
                         %>
    <header id="header">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <h1 class="text-center"> Admin Area <small>Insert a new Admin</small></h1>
          </div>
        </div>
      </div>
    </header>

    <section id="main">
      <div class="container">
        <div class="row">
          <div class="col-md-4 col-md-offset-4">
              <form id="login" action="" class="well" method="post">
                  <div class="form-group">
                      <div class="form-group">
                    <label>ID</label>
                    <input type="text" name="id" class="form-control" disabled value="<%= rs.getInt("id")%>"/>
                  </div>
                    <label>FistName</label>
                    <input type="text" name="FirstName"class="form-control" placeholder="Enter Firstname" value="<%= rs.getString("first_name")%>"/>
                  </div>
                  <div class="form-group">
                    <label>LastName</label>
                    <input type="text" name="LastName" class="form-control" placeholder="Enter lastName" value="<%= rs.getString("last_name")%>"/>
                  </div>
                <div class="form-group">
                    <label>Email</label>
                    <input type="email" name="email" class="form-control" placeholder="Enter Email" value="<%= rs.getString("email")%>"/>
                   </div>
                   <div class="form-group">
                    <label>Username</label>
                    <input type="text" name="username" class="form-control" placeholder="Enter Username" value="<%= rs.getString("username")%>"/>
                  </div>
                <div class="form-group">
                    <label>Password</label>
                    <input type="password" name="password" class="form-control" placeholder="Enter Password" value="<%= rs.getString("password")%>"/>
                  </div>
                  <button type="submit" class="btn btn-default btn-block">Update</button>
              </form>
                  <%}%>
          </div>
        </div>
      </div>
    </section>

    <footer id="footer">
      <p>Copyright Rami-Senbli, &copy; 2019</p>
    </footer>

  <script>
     CKEDITOR.replace( 'editor1' );
 </script>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>
<%
    String first_name, last_name,email,password;
       first_name=request.getParameter("FirstName");
       last_name=request.getParameter("LastName");
       email=request.getParameter("email");
       password=request.getParameter("password");
       if(first_name!=null && last_name!=null && email!=null && username!=null && password!=null ){
           ps=con.prepareStatement("update responsable set first_name='"+first_name+"', last_name='"+last_name+"',email='"+email+"',password='"+password+"'where username='" + username + "'");
           ps.executeUpdate();
           response.sendRedirect("comite_res.jsp");
       }
%>

