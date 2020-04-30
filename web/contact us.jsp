<%-- 
    Document   : contact us
    Created on : 7 janv. 2019, 14:11:19
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

    <!--*********************************
    start navbar
    *********************************-->
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
    start map
    *********************************-->
    <section id="location" class="section location">
        <div class="container">
            <div class="row">
                <div class="col-sm-3">
                    <h3 class="section-title">Event Location</h3>
                    <address>
                        <p>Km 9, Route Rabat <br>KEnitra Av de l'université<br>Kenitra, Maroc<br>Fs Kenitra</p>
                        <p>+212540132201<br>FsKenitra@gmail.com</p>
                    </address>
                </div>
                <div class="col-sm-9">
                    <iframe src= "https://maps.google.com/maps?q=facult%C3%A9%20des%20Sicence%20Kenitra&t=&z=13&ie=UTF8&iwloc=&output=embed" width="100%" height="450" frameborder="0" style="border:0" allowfullscreen></iframe>
                </div>
            </div>
        </div>
    </section>
    <!--*********************************
    end map
    *********************************-->


    <!--*********************************
    start contact
    *********************************-->
    <section class="section registration">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <h3 class="section-title">Contact Us</h3>
                </div>
            </div>
            <form action="contact_js.jsp">
                <div class="row">
                    <div class="col-md-12"  style="display:none;">
                        <div class="alert"></div>
                    </div>
                    <div class="col-sm-6">
                        
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Full_name"  name="full_name" required>
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Subject"  name="sujet" required>
                        </div>
                        <div class="form-group">
                            <input type="email" class="form-control" placeholder="Email"  name="email" required>
                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="form-group">
                            <textarea class="form-control" rows="8" placeholder="Message"  name="message" required></textarea>
                        </div>
                    </div>
                </div>
                <div class="text-center mt20">
                    <button type="submit" class="btn btn-black"  onclick="myfi()">Send</button>
                </div>
            </form>
        </div>
    </section>
    <!--*********************************
    end contact
    *********************************-->





      <!--*********************************
    start footer
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
    <script>
        function  myfi(){
alert("Operations succes");
        }
        
        </script>
</body>
</html>
