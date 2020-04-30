<%-- 
    Document   : Auteur_inscription
    Created on : 8 janv. 2019, 00:08:54
    Author     : KHALID-RAMI
--%>

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
     <link href="https://fonts.googleapis.com/css?family=Lato:300,400,400i|Montserrat:400,700" rel="stylesheet">
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
<nav id="site-nav" class="navbar navbar-custom" style="background:black">
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
                    <li><a  href="registration.jsp">Registration</a></li>
                    <li><a  href="speakers.jsp">Speakers</a></li>
                    <li><a  href="submission.jsp">Faqs</a></li>
                    <li><a  href="contact us.jsp">Contact</a></li>
                </ul>
            </div>
        </div><!-- /.container -->
    </nav>
   




 <!--========== start register  ==========-->
       
    <section id="registration" class="section registration">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <h3 class="section-title">Create your account now</h3>
                </div>
            </div>
                
            <form action="inscri_auteur.jsp" method="POST">
                    <div class="row">
                       
                        <div class="col-sm-6">
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="First Name"  name="first_name" required>
                            </div>

                           <div class="form-group">
                                <input type="text" class="form-control" placeholder="last Name"  name="last_name" required>
                            </div>
                            <div class="form-group">
                                <input type="email" class="form-control" placeholder="Email"  name="email" >
                            </div>
                            
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Username"  name="username" required>
                            </div>
                            <div class="form-group">
                                <input type="password" class="form-control" placeholder="password"  name="password" required>
                            </div>

                          

                            
                        
                    <div class="text-center mt20"  >
                        <button type="submit" onclick="f()" id='btn' class="btn btn-black">Submit</button>
                    </div>
                </form>
                    <div class="response"></div>

        </div>
    </section>

        <!--========== END register ==========-->


    
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
    <script>
        function f(){
            alert("registration succes");
        }
        </script>
</body>
</html>
