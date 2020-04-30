<%-- 
    Document   : edit_com
    Created on : 6 janv. 2019, 02:19:23
    Author     : KHALID-RAMI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.dao.Admindao"%>
<%@page import="com.entites.Admin"%>
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
       Connection con;
       String url="jdbc:mysql://localhost:3306/uml_jee";
       String Driver="com.mysql.jdbc.Driver";
       String user="root";
       String clave="";
       Class.forName(Driver);
       con=DriverManager.getConnection(url,user,clave);
       PreparedStatement ps;
       ResultSet rs;
       int id=Integer.parseInt(request.getParameter("id"));
       ps=con.prepareStatement("select * from comite where id="+id);
       rs=ps.executeQuery();
       while(rs.next()){
                         %>
    <header id="header">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <h1 class="text-center"> comite Area <small>Insert a comite</small></h1>
          </div>
        </div>
      </div>
    </header>

    <section id="main">
      <div class="container">
        <div class="row">
          <div class="col-md-4 col-md-offset-4">
              <form  action="" class="well" method="post">
                  <div class="form-group">
                      <div class="form-group">
                    <label>ID</label>
                    <input type="text" name="id" class="form-control" disabled value="<%= rs.getInt("id")%>"/>
                  </div>
                    <label>FistName</label>
                    <input type="text" name="first_name"class="form-control" placeholder="Enter Firstname" value="<%= rs.getString("first_name")%>"/>
                  </div>
                  <div class="form-group">
                    <label>LastName</label>
                    <input type="text" name="Last_name" class="form-control" placeholder="Enter lastName" value="<%= rs.getString("last_name")%>"/>
                  </div>
                <div class="form-group">
                    <label>conference_title</label>
                    <input type="text" name="conference_title" class="form-control" placeholder="Enter Email" value="<%= rs.getString("conference_title")%>"/>
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
    String first_name,last_name,conference_title;
       first_name=request.getParameter("first_name");
       last_name=request.getParameter("last_name");
       conference_title=request.getParameter("conference_title");
      
       if(first_name!=null && last_name!=null && conference_title!=null){
           ps=con.prepareStatement("update comite set first_name='"+first_name+"', last_name='"+last_name+"',conference_title='"+conference_title+"' where id="+id);
           ps.executeUpdate();
           response.sendRedirect("comite.jsp");
       }
%>