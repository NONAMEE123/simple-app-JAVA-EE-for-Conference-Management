<%-- 
    Document   : tutoriels_par
    Created on : 10 janv. 2019, 15:21:58
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
    if ((session.getAttribute("username") == null) || (session.getAttribute("username") == "")) {
response.sendRedirect("login_participant.jsp");
%>
You are not logged in<br/>
<a href="login_participant.jsp">Please Login</a>
<%} else {
%>
Welcome <%=session.getAttribute("username")%>
<br>


<%
    }
%>
    <header id="header">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <h1 class="text-center"> Participant Area <small>Tutorials</small></h1>
          </div>
        </div>
      </div>
    </header>

    <section id="main">
      <div class="container">
        <div class="row">
          <div class="col-md-4 col-md-offset-4">
              
          </div>
        </div>
      </div>
    </section>

    <object width="420" height="315"
   data="https://www.youtube.com/v/xZ67modKGuE">
   </object>
      <object width="420" height="315" style=""
data="https://www.youtube.com/v/v9ejT8FO-7I">
</object>
<object width="420" height="315" style="margin-top:-400%"
data="https://www.youtube.com/v/baWfd-vRIqM">
</object>

      <br>
      <object width="420" height="315"
data="https://www.youtube.com/v/c96w1JS28AY&t=262s">
</object>
      <object width="420" height="315" style=""
data="https://www.youtube.com/v/E5RjzSK0fvY">
</object>

      <object width="420" height="315" style="margin-top:-1000%"
data="https://www.youtube.com/v/gH__uVtD2lc&t=11s">
</object>
  
  <footer id="footer">
        <p>Copyright RAMI-SENBLI, &copy; 2019</p>
    </footer>
  <script>
     CKEDITOR.replace( 'editor1' );
 </script>
 <script>
     function fit(){
         alert('operations succes');
     }
     </script>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>
