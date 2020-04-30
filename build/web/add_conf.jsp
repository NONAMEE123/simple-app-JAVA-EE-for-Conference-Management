<%--
    Document   : add_conf
    Created on : 4 janv. 2019, 11:57:25
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
              <form id="login" action="conf_add.jsp" class="well" method="post">
                  <div class="form-group">
                    <label>title</label>
                    <input type="text" name="title"class="form-control" placeholder="Enter title">
                  </div>
                  <div class="form-group">
                    <label>start_date</label>
                    <input type="date" name="start_date" class="form-control" placeholder="Enter startdate">
                  </div>
                <div class="form-group">
                    <label>end_date</label>
                    <input type="date" name="end_date" class="form-control" placeholder="Enter enddate">
                   </div>
                   <div class="form-group">
                    <label>date_conf</label>
                    <input type="date" name="date_conf" class="form-control" placeholder="Enter dateconf">
                  </div>
                <div class="form-group">
                    <label>location</label>
                    <input type="text" name="location" class="form-control" placeholder="Enter location">
                  </div
                  <div class="form-group">
                    <label>description</label>
                    <input type="text" name="description" class="form-control" placeholder="Enter a description" size="50" style="height:100px;">
                      <label>date_limite</label>
                    <input type="date" name="date_limite" class="form-control" placeholder="Enter a ddate_limit">
                    <button onclick="myFunction()" type="submit" class="btn btn-default btn-block" >Insert</button>
                    <button type="reset" class="btn btn-default btn-block" onclick="">reset</button>
                  </div>
                   
              </form>
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
    <script>
function myFunction() {
  alert("Operation succées");
}
</script>
  </body>
</html

