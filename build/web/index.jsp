<%-- 
    Document   : index
    Created on : 7 janv. 2019, 14:02:59
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

    <title>Conference</title>

    <!-- css -->
    <link rel="stylesheet" href="bower_components/bootstrap/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="bower_components/ionicons/css/ionicons.min.css">
    <link rel="stylesheet" href="assets/css/main.css">
    <style type="text/css">
        .form-control {
          border-radius: 0;
          box-shadow: none;
          height: 48px;
          padding: 10px 12px;
          font-size: 16px;
          line-height: 1.6;
        }
        .form-control:focus {
          box-shadow: none;
          border-color: #ccc;
          background-color: #f8f8f8;
        }
    </style>
</head>
<body data-spy="scroll" data-target="#site-nav">

    <!--*********************************
    start navbar
    *********************************-->
    <nav id="site-nav" class="navbar navbar-fixed-top navbar-custom" style="padding-top:30px">
        <div class="container">
            <div class="navbar-header">
                <!-- start logo -->
                <div class="site-branding">
                    <a class="logo" href="index.html">
                        <img src="assets/images/logo.png" alt="Logo">
                        Conference 2019
                    </a>
                </div>
                <!-- end logo -->
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-items" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
            </div>
            <!--navbar header -->
            <div class="collapse navbar-collapse" id="navbar-items">
                <ul class="nav navbar-nav navbar-right">
                    <!-- navigation menu -->
                   <li><a  href="index.jsp">Home</a></li>
                    <li><a  href="about.jsp">About Us</a></li>
                    <li><a  href="registration.jsp">Information</a></li>
                    <li><a  href="speakrs.jsp">Registration</a></li>
                    <li><a  href="submission.jsp">login</a></li>
                    <li><a  href="contact us.jsp">Contact</a></li>
                </ul>
            </div>
        </div><!-- /.container -->
    </nav>
    <!--*********************************
    end navbar
    *********************************-->

    <!--*********************************
    start center
    *********************************-->
    <header id="site-header" class="site-header valign-center">
        <div class="intro">
            <h2>15 Junary, 2019 / University of Sciences</h2>
            <h1> Conference</h1>
            <p>First &amp; Largest Conference In Ibno Tofail University</p>
            <a href="form_par.jsp" class="btn btn-white"  >Register Now</a>
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
       ps=con.prepareStatement("select * from title");
       rs=ps.executeQuery();
       while(rs.next()){
                         %>
                         <p>  Today Subject is : <%= rs.getString("title")%></p>
            <%}%>
        </div>
    </body>
        </div>
    </header>
    <!--*********************************
    start center
    *********************************-->

    <!--*********************************
    start about us
    *********************************-->
    
    <footer class="site-footer">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <p class="site-info">Designed and <br> Developed by <a href="#">RAMI, SENBLI</a></p>
                    <ul class="social-block">
                        <li><a href="#"><i class="ion-social-twitter"></i></a></li>
                        <li><a href="#"><i class="ion-social-facebook"></i></a></li>
                        <li><a href="#"><i class="ion-social-linkedin-outline"></i></a></li>
                        <li><a href="#"><i class="ion-social-googleplus"></i></a></li>
                    </ul>
                </div>
            </div>
        </div>
    </footer>
    <!--*********************************
    end footer
    *********************************-->

    <!-- script -->
    <script src="bower_components/jquery/dist/jquery.min.js"></script>
    <script src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
    <script src="bower_components/smooth-scroll/dist/js/smooth-scroll.min.js"></script>
    <script src="assets/js/main.js"></script>
</body>
</html>
