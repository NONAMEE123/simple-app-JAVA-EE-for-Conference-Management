<%-- 
    Document   : auteur_par
    Created on : 11 janv. 2019, 00:02:10
    Author     : KHALID-RAMI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%-- 
    Document   : edit_comite
    Created on : 6 janv. 2019, 02:52:24
    Author     : KHALID-RAMI
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
response.sendRedirect("login_auteur.jsp");
%>
You are not logged in<br/>
<a href="login_auteur.jsp">Please Login</a>
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
            <h1 class="text-center"> Participation Area <small>Participate now</small></h1>
          </div>
        </div>
      </div>
    </header>

    <section id="main">
      <div class="container">
        <div class="row">
          <div class="col-md-4 col-md-offset-4">
              <form  action="inscri_parr.jsp" method="post">
                  <div class="form-group">
                 
                    <label>FistName</label>
                    <input type="text" name="name" class="form-control" placeholder="Enter Firstname"/>
                  </div>
                  <div class="form-group">
                    <label>LastName</label>
                    <input type="text" name="last_name" class="form-control" placeholder="Enter lastName" />
                  </div>
                <div class="form-group">
                    <label>Email</label>
                    <input type="email" name="email" class="form-control" placeholder="Enter Email" />
                   </div>
                    <div class="form-group">
                    <label>phone_number</label>
                    <input type="text" name="phone_number" class="form-control" placeholder="Enter a phone number" />
                   </div>
                    <div class="form-group">
                    <label>Adress</label>
                    <input type="text" name="adress" class="form-control" placeholder="Enter a adress" />
                   </div>
                                      <div class="form-group">

                  <label>username</label>
                    <input type="text" name="username" class="form-control" placeholder="Enter a username" />
                   </div>
                                      <div class="form-group">

                   <label>pasword</label>
                    <input type="password" name="password" class="form-control" placeholder="Enter a password" />
                   </div>
                   
                  <button type="submit" class="btn btn-default btn-block">insert</button>
                  <button type="reset" class="btn btn-default btn-block">reset</button>

              </form>
                  
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
 <script>
     function myfui(){
         alert("Registration succes");
     }
 </script>


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>
