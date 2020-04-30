<%-- 
    Document   : submission
    Created on : 7 janv. 2019, 14:10:22
    Author     : KHALID-RAMI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title> Conference</title>

    <!-- css -->
    <link rel="stylesheet" href="bower_components/bootstrap/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="bower_components/ionicons/css/ionicons.min.css">
     <link href="https://fonts.googleapis.com/css?family=Lato:300,400,400i|Montserrat:400,700" rel="stylesheet">
     
    <link rel="stylesheet" href="assets/css/main.css">
    
        
        <style type="text/css">
 		body {
    margin:0;
    font-family: "calibri";
    width:100%; 
    background:url(images/main.jpg) center 0 repeat;
    border-top:#000000 5px solid;
}

header ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    font-size: 20px;
    overflow: hidden;
    background-color: #111;
    position: fixed;
    top: 0;
    width: 100%;
}

header ul li {
    float: left;
}

header ul li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

header ul li a:hover:not(.active) {
    background-color: #333;
}

.active {
    background-color: #68abc2;
}

/*-------------------------------------Register--------------------------------------------------*/

form{
    margin: 13% 30%;
    font-size: 30px;
    width: 500px;
    text-align: center;
}

form p{
    border-top: 2px solid #111;
    border-bottom: 2px solid #111;
}

form legend{
    margin: 0 auto;
    text-align: center;
    color: white;
    font-weight: bold;
    font-size: 30px;
    background-color: #111;
    width: 230px;
    height: 40px;
}

form fieldset{
    border: 2px solid #111;
    border-radius: 3px;
}


button  {
    display: block;
    padding: 10px;
    color: #fff;
    font-weight: bold;
    font-size: 14px;
    background-color: #111;
    width: 350px;
    margin: 3% auto;
    margin-top: 5%;
    border-radius: 3px;
    border: 1px solid #eee;
    cursor: pointer;

}

button a{
    text-decoration: none;
    color: white;
    display: block;
    margin: 0 auto;
    padding: 10px;
    color: #fff;
    font-weight: bold;
    font-size: 30px;
    width: 310px;
    cursor: pointer;
}

button :hover {
    background-color: #68abc2;
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



</div>

<form>
	<legend>Log In</legend>
	<fieldset>
		<button ><a href="login_res.jsp">Responsable</a></button>
		<p>Or</p>
		<button ><a href="login_auteur.jsp">Auteur</a></button>
                <p>Or</p>
		<button ><a href="Admin_login.jsp">Admin</a></button>
                <p>Or</p>
		<button ><a href="login_participant.jsp">Participant</a></button>

	</fieldset>
	</form>

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
