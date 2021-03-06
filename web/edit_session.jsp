<%-- 
    Document   : edit_conf
    Created on : 4 janv. 2019, 11:49:27
    Author     : KHALID-RAMI
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
      int id=Integer.parseInt(request.getParameter("id"));
       ps=con.prepareStatement("select * from session where id="+id);
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
                      <div class="form-group">
                    <label>Session Name</label>
                    <input type="text" name="session_name" class="form-control" value="<%= rs.getString("session_name")%>"/>
                  </div>
                    <label>President Name</label>
                    <input type="text" name="president_name"class="form-control" placeholder="" value="<%= rs.getString("president_name")%>"/>
                  </div>
                  <div class="form-group">
                    <label>Comite Name</label>
                    <input type="text" name="comite_name" class="form-control" placeholder="Enter lastName" value="<%= rs.getString("comite_name")%>"/>
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
    
    String  session_name,president_name,comite_name;
       session_name=request.getParameter("session_name");
       president_name=request.getParameter("president_name");
       comite_name=request.getParameter("comite_name");
       
       if( session_name!=null&& president_name!=null && comite_name!=null){
           ps=con.prepareStatement("update session set session_name='"+session_name+"',president_name='"+president_name+"', comite_name='"+comite_name+"'where id="+id);
           ps.executeUpdate();
           response.sendRedirect("session.jsp");
       }
%>

