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
       ps=con.prepareStatement("select * from conference where id="+id);
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
                    <label>title</label>
                    <input type="text" name="title" class="form-control" value="<%= rs.getString("title")%>"/>
                  </div>
                    <label>start date</label>
                    <input type="date" name="start_date"class="form-control" placeholder="Enter Firstname" value="<%= rs.getString("start_date")%>"/>
                  </div>
                  <div class="form-group">
                    <label>End Date</label>
                    <input type="date" name="end_date" class="form-control" placeholder="Enter lastName" value="<%= rs.getString("end_date")%>"/>
                  </div>
                <div class="form-group">
                    <label>date_conf</label>
                    <input type="date" name="date_conf" class="form-control" placeholder="Enter Email" value="<%= rs.getString("date_conf")%>"/>
                   </div>
                   <div class="form-group">
                    <label>location</label>
                    <input type="text" name="location" class="form-control" placeholder="Enter  a location" value="<%= rs.getString("location")%>"/>
                  </div>
                <div class="form-group">
                    <label>description</label>
                    <input type="text" name="description" class="form-control" placeholder="Enter Password" value="<%= rs.getString("description")%>"/>
                  </div>
                  <div class="form-group">
                    <label>date_limite</label>
                    <input type="text" name="date_limite" class="form-control" placeholder="Enter Password" value="<%= rs.getString("date_limite")%>"/>
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
    
    String start_date,end_date,title;
    String  date_conf,location,description,date_limite;
       title=request.getParameter("title");
       start_date=request.getParameter("start_date");
       end_date=request.getParameter("end_date");
       date_conf=request.getParameter("date_conf");
       location=request.getParameter("location");
       description=request.getParameter("description");
       date_limite=request.getParameter("location");
       if( title!=null&& start_date!=null && end_date!=null && date_conf!=null && location!=null && description!=null && date_limite!=null ){
           ps=con.prepareStatement("update conference set title='"+title+"',start_date='"+start_date+"', end_date='"+end_date+"',date_conf='"+date_conf+"',location='"+location+"',description='"+description+"',date_limite='"+date_limite+"'where id="+id);
           ps.executeUpdate();
           response.sendRedirect("Conference.jsp");
       }
%>

