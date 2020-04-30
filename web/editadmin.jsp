<%-- 
    Document   : editadmin
    Created on : 3 janv. 2019, 15:17:00
    Author     : KHALID-RAMI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
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

      <%@page import="com.dao.Admindao"%>
<%@page import="com.entites.Admin"%>     
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
            <h1 class="text-center"> Admin Area <small>Insert a new Admin</small></h1>
          </div>
        </div>
      </div>
    </header>

    <section id="main">
      <div class="container">
        <div class="row">
          <div class="col-md-4 col-md-offset-4">
              <c:forEach
                  items="${getadminbyid}" var="e">
                  
              <form id="login" action="editadmin.jsp" class="well" method="post">
                  <input type="hidden" value="${e.id}">
                  
                  <div class="form-group">
                    <label>FistName</label>
                    <input type="text" value="${e.FirstName}" name="FirstName"class="form-control" placeholder="Enter Firstname">
                  </div>
                  <div class="form-group">
                    <label>LastName</label>
                    <input type="text"value="${e.LastName}" name="LastName" class="form-control" placeholder="Enter lastName">
                  </div>
                <div class="form-group">
                    <label>Email</label>
                    <input type="email" value="${e.email}" name="email" class="form-control" placeholder="Enter Email">
                   </div>
                   <div class="form-group">
                    <label>Username</label>
                    <input type="text" value="${e.username}" name="username" class="form-control" placeholder="Enter Username">
                  </div>
                <div class="form-group">
                    <label>Password</label>
                    <input type="password" value="${e.password}" name="password" class="form-control" placeholder="Enter Password">
                  </div>


                  <button type="submit" class="btn btn-default btn-block">Insert</button>
                  <button type="reset" class="btn btn-default btn-block">reset</button>
              </form>
                  </c:forEach>
          </div>
        </div>
      </div>
    </section>

    <footer id="footer">
      <p>Copyright AdminStrap, &copy; 2017</p>
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

