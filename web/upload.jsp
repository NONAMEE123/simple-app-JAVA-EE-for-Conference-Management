<%-- 
    Document   : upload
    Created on : 7 janv. 2019, 14:10:56
    Author     : KHALID-RAMI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
        
    </style>
    <title>ESTE Conference</title>

    <!-- css -->
    <link rel="stylesheet" href="bower_components/bootstrap/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="bower_components/ionicons/css/ionicons.min.css">
     <link href="https://fonts.googleapis.com/css?family=Lato:300,400,400i|Montserrat:400,700" rel="stylesheet">
    <link rel="stylesheet" href="assets/css/main.css">
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
                        ESTE Conference 2018
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
                    <li><a  href="speakrs.jsp">Speakers</a></li>
                    <li><a  href="submission.jsp">Faqs</a></li>
                    <li><a  href="contact us.jsp">Contact</a></li>
                </ul>
            </div>
        </div><!-- /.container -->
    </nav>
    <!--*********************************
    end navbar
    *********************************-->




<div class="container"> <br />
    <div class="row">

    	<div class="col-md-12">
			<div class="panel panel-default">
				<div class="panel-heading"><strong>Upload file</strong> <small> </small></div>
				<div class="panel-body">
   					
   					 <input type="text" class="form-control" placeholder="Enter File Title" required>
					 <br>

					<div class="input-group image-preview">
						<input placeholder="" type="text" class="form-control image-preview-filename"  id="files-input-upload" disabled="disabled">


						<!-- don't give a name === doesn't send on POST/GET --> 
						<span class="input-group-btn"> 
						<!-- image-preview-clear button -->
						<button type="button" class="btn btn-default image-preview-clear" style="display:none;"> <span class="glyphicon glyphicon-remove"></span> Clear </button>
						<!-- image-preview-input -->
						<div class="btn btn-default image-preview-input" id="fake-file-button-browse"> <span class="glyphicon glyphicon-folder-open"></span> 
							<span class="image-preview-input-title">Browse</span>
							<input type="file" accept="image/png, image/jpeg, image/gif" name="input-file-preview"/>
							<!-- rename it --> 
						</div>
						<button type="submit" class="btn btn-labeled btn-primary"> <span class="btn-label"><i class="glyphicon glyphicon-upload"></i> </span>Upload</button>
						</span> </div>
					<!-- /input-group image-preview [TO HERE]--> 
					
					<br />
					
					<!-- Drop Zone -->
					<div class="upload-drop-zone" id="drop-zone"> Or drag and drop file here </div>
					<br />
					<!-- Progress Bar -->
					<div class="progress">
						<div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%;"> <span class="sr-only">60% Complete</span> </div>
					</div>
					<br />

				</div>
			</div>
		</div>
        
        
        
	</div>
</div>



     <!--*********************************
    start footer
    *********************************-->
    <footer class="site-footer">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <p class="site-info">Designed and <br> Developed by <a href="#">ESSANHAJI, ESSOUBAKI</a></p>
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
    <script type="text/javascript">
    	document.getElementById('fake-file-button-browse').addEventListener('click', function() {
		document.getElementById('files-input-upload').click();
		});

		document.getElementById('files-input-upload').addEventListener('change', function() {
			document.getElementById('fake-file-input-name').value = this.value;
			
			document.getElementById('fake-file-button-upload').removeAttribute('disabled');
		});
    </script>
</body>
</html>
