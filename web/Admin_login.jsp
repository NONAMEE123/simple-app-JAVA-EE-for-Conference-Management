<%-- 
    Document   : Admin_login
    Created on : 8 janv. 2019, 20:09:19
    Author     : KHALID-RAMI
--%>

<%-- 
    Document   : login
    Created on : 7 janv. 2019, 23:41:45
    Author     : KHALID-RAMI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- css -->
    <link rel="stylesheet" href="bower_components/bootstrap/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="bower_components/ionicons/css/ionicons.min.css">
     <link href="https://fonts.googleapis.com/css?family=Lato:300,400,400i|Montserrat:400,700" rel="stylesheet">
    <link rel="stylesheet" href="assets/css/main.css">
<style type="text/css">
 		body {
    margin:0;
    font-family: "calibri";
    width:100%; background:url(images/main.jpg) center 0 repeat; border-top:#000000 5px solid;
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

header{
    margin-bottom: 12%;
}
/*-------------------------------------login--------------------------------------------------*/

form{
    margin: 5% auto;
    font-size: 30px;
    width: 500px;
}

form legend{
    margin: 0 auto;
    text-align: center;
    color: white;
    font-weight: bold;
    font-size: 30px;
    background-color: #111;
    width: 210px;
    height: 48 px;
}

form fieldset{
    border: 2px solid #111;
    border-radius: 3px;
}

input[type="text"],input[type="password"]{
    outline: none;
    padding: 0px;
    display: block;
    width: 300px;
    border-radius: 1px;
    border: 1px solid #eee;
    margin: 15px auto;
    padding-top: 10px;
    

}

input[type="submit"]{
    display: block;
    padding: 10px;
    color: #fff;
    font-weight: bold;
    font-size: 14px;
    background-color: #111;
    width: 320px;
    margin: 20px auto;
    margin-top: 0px; 
    border-radius: 3px;
    border: 1px solid #eee;
    cursor: pointer;
}

input[type="submit"]:hover {
    background-color: #68abc2;
}

 	</style>    
    </head>
    <body>
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
                    <li><a  href="registration.jsp">Registration</a></li>
                    <li><a  href="speakrs.jsp">Speakers</a></li>
                    <li><a  href="submission.jsp">login</a></li>
                    <li><a  href="contact us.jsp">Contact</a></li>
                </ul>
            </div>
        </div><!-- /.container -->
    </nav>
<form action="valid_admin.jsp" method="post">
	<legend>Connexion</legend>
	<fieldset>
            <input  type="text" placeholder="Entrer ton compte" name="username" >
		<input type="password" placeholder="Entrer ton mot de passe" name="password">
		<input type="submit" value="Connecter">
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
    <script src="bower_components/jquery/dist/jquery.min.js"></script>
    <script src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
    <script src="bower_components/smooth-scroll/dist/js/smooth-scroll.min.js"></script>
    <script src="assets/js/main.js"></script>
</body>
</html>

    </body>
</html>
