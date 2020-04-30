<%-- 
    Document   : edit_par
    Created on : 4 janv. 2019, 22:41:38
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

    <header id="header">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <h1 class="text-center"> Auteur Area <small>registre your self</small></h1>
          </div>
        </div>
      </div>
    </header>

    <section id="main">
      <div class="container">
        <div class="row">
          <div class="col-md-4 col-md-offset-4">
              <form  action="par_add.jsp" class="well" method="post">
                  <div class="form-group">
                      <div class="form-group">
                    <label>ID</label>
                    <input type="text" name="id" class="form-control" disabled value=""/>
                  </div>
                    <label>First_name</label>
                    <input type="text" name="name"class="form-control" placeholder="Enter Firstname" value=""/>
                  </div>
                  <div class="form-group">
                    <label>Last_Name</label>
                    <input type="text" name="last_name" class="form-control" placeholder="Enter lastName" value=""/>
                  </div>
                <div class="form-group">
                    <label>Email</label>
                    <input type="email" name="email" class="form-control" placeholder="Enter Email" value=""/>
                   </div>
                   <div class="form-group">
                    <label>phone_number</label>
                    <input type="text" name="phone_number" class="form-control" placeholder="Enter Email" value=""/>
                   </div>
                   <div class="form-group">
                    <label>adress</label>
                    <input type="text" name="adress" class="form-control" placeholder="Enter Email" value=""/>
                   </div>
                   <div class="form-group">
                    <label>Username</label>
                    <input type="text" name="username" class="form-control" placeholder="Enter Username" value=""/>
                  </div>
                <div class="form-group">
                    <label>Password</label>
                    <input type="password" name="password" class="form-control" placeholder="Enter Password" value=""/>
                  </div>
                  <div class="form-group">
                   
                      <button type="submit" class="btn btn-default btn-block" onclick="myfi()">Registre</button>
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

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script>
        function fi(){
            
        
        alert("Operation Succes");
    }
        </script>
  </body>
</html>
