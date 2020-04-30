<%-- 
    Document   : Admin
    Created on : 1 janv. 2019, 19:24:41
    Author     : KHALID-RAMI
--%>
<%@page import="java.util.Collection"%>
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<%@page import="java.util.Collection"%>
<%@page import="com.entites.Admin"%>
<%@page import="com.metier.IAdmin" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/ionicons.min.css">
    <link rel="stylesheet" href="css/jBox.css">
    <link rel="stylesheet" href="css/style.css">
    
 <!--
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>    <link rel="stylesheet" href="css/style.css"/>
 -->
    <title>Admin System</title>
</head>
<body>
    <sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
         url = "jdbc:mysql://localhost/uml_jee"
         user = "root"  password = ""/>
 
      <sql:query dataSource = "${snapshot}" var = "result">
         SELECT * from Admin;
      </sql:query>

        <nav class="navbar navbar-default">
                <div class="container-fluid">
                  <div class="navbar-header">
                  </div>
                  <ul class="nav navbar-nav">
                    <li><a href="dashbord.jsp">Dashboard</a></li>
                    <li><a href="Participants.jsp"> Participants</a></li>
                    <li><a href="papier.jsp"> papier</a></li>
                    <li class="active"><a href="Admin.jsp"> Admins</a></li>
                    <li><a href="Conference.jsp"> Conference</a></li>
                                        <li><a href="Message.jsp"> Messages</a></li>
                                        <li><a href="session.jsp"> Session</a></li>


                      </ul>
                  <div class="navbar-right" style="color:white;margin-top:15px;">
         
                     <%
    if ((session.getAttribute("username") == null) || (session.getAttribute("username") == "")) {
response.sendRedirect("Admin_login.jsp");
%>
You are not logged in<br/>
<a href="Admin_login.jsp">Please Login</a>
<%} else {
%>
Welcome <%=session.getAttribute("username")%>
<br>
<a href='logout_admin.jsp'>Log out</a>
<a href='edit_add.jsp?username=<%=session.getAttribute("username")%>'>Edit Account</a>

<%
    }
%>
                      <span style="margin-right:20px"></span>
                </div>
                </div>
        </nav>

<header id="header">
      <div class="container">
        <div class="row">
          <div class="col-md-10">
            <h1><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Admin <small>Admin Management</small></h1>
          </div>
          <div class="col-md-2">
            <div class="dropdown create">
              
               <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
                <li><a type="button" data-toggle="modal" data-target="#addPage">Logout</a></li>
                                <li><a type="button" data-toggle="modal" data-target="#addPage">Logout</a></li>
                <li><a type="button" data-toggle="modal" data-target="#addPage">Logout</a></li>

                                
              </ul>
            </div>
          </div>
        </div>
      </div>
    </header>


    <section class="breadcrumb">
        <div class="container">
            <ol class="breadcrumb" style="padding:0;margin:0;">
                <li class="active">Dashboard / Admins</li>
            </ol>
        </div>
    </section>

    <div id="main1"></div>
    <section id="main">
        <div class="container">
            <div class="row">
                <div class="col-md-3">
                    <div class="list-group">
                        <a href="dashbord.jsp" class="list-group-item active main-color-bg">
                <span class="glyphicon glyphicon-home" aria-hidden="true"></span> Dashboard
              </a>
              <a href="papier.jsp" class="list-group-item"><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span> Papier <span class="badge"></span></a>
              <a href="Participants.jsp" class="list-group-item"><span class="glyphicon glyphicon-education" aria-hidden="true"></span> Participants <span class="badge"></span></a>
              <a href="Admin.jsp" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Admin <span class="badge"></span></a>
              <a href="Conference.jsp" class="list-group-item"><span class="glyphicon glyphicon-book" aria-hidden="true"></span>conference  <span class="badge"></span></a>
              <a href="Message.jsp" class="list-group-item"><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span> Message <span class="badge"></span></a>
               <a href="tutoriels.jsp" class="list-group-item"><span class="glyphicon glyphicon-bookmark" aria-hidden="true"></span> tutoriels <span class="badge"></span></a>
                <a href="comite.jsp" class="list-group-item"><span class="glyphicon glyphicon-briefcase" aria-hidden="true"></span> Comitte <span class="badge"></span></a>
                <a href="session.jsp" class="list-group-item"><span class="glyphicon glyphicon-duplicate" aria-hidden="true"></span> Session <span class="badge"></span></a>

                    </div>
                </div>






                 <div class="col-md-9">
                    <!-- BUTTONS-->
                    <div class="row">
                            <div class="col-md-12">

                            <ul class="pager" style="margin-top:0;">
                                <li class="previous" style="cursor:pointer">
                                    <a  href="add_admin.jsp" type="button"  data-toggle="modal" data-target=".bd-example-modal-lg"><span class="glyphicon glyphicon-plus"> Add Admin </span></a>
                                </li>
                               
                            </ul>
                            </div>
                    </div>
                <div class="modal fade bd-example-modal-lg add2" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
                  <div class="modal-dialog ">

                    <form action="../controler/A_add_admin.php" method="POST">
                    <div class="modal-content">
                      
                            <div class="modal-header">
                                    <h5 class="modal-title" style="display:inline-block;font-size:20px"><b>Add New Admin</b></h5>
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                            </div>
                            <div class="modal-body">
                            
                                    <div class="form-group">
                                        <input type="text" name="first_name" placeholder="First Name:" required>
                                        <input type="text" name="last_name" placeholder="Last Name:" required style="float:none">
                                        <br>
                                        <input type="text" name="username" placeholder="Username:" required>
                                        <input type="email" name="email" placeholder="Email:" required>
                                        <input type="password" name="password1" placeholder="Password:" required>
                                        <input type="password" name="password2" placeholder="Repeat Password :"><br>
                                    </div>
                            </div>
                            <div class="modal-footer" style="clear:both">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal" >Close</button>
                            <button type="vv@c" name="Admin_submit_inset" class="btn btn-primary" >Add</button>
                            </div>

                    </div>
                  </form>       
                  </div>
                </div>



                <!--LIST OF ADMINS-->
                <div class="panel panel-default ">
                    <div class="panel-heading main-color-bg">
                        </span><h3 class="panel-title"><span class="ion-android-arrow-dropdown" aria-hidden="true"></span> List Of Admins</h3>
                    </div>

                    <div class="panel-body">
                        <div class="row">
                            <div class="col-md-12">
                                <!--input for searching-->
                                <input class="form-control" id="myInput" onkeyup="myFunction()" type="text" placeholder="Filter By Names"/>
                            </div>
                        </div>
                        <br>
                        <table id="myTable" class="table table-striped table-hover">
                            
                                <tr class="header">
                                    <th>Id</th>
                                    <th>First Name</th>
                                    <th>Last Name</th>
                                    <th>Email</th>
                                    <th>Username</th>
                                    <th>operations</th>
                                       
                                </tr>   
                                
                                
                              <c:forEach var = "row" items = "${result.rows}">
            <tr>
                
               <td><c:out value = "${row.id}"/></td>
               <td><c:out value = "${row.first_name}"/></td>
               <td><c:out value = "${row.last_name}"/></td>
               <td><c:out value = "${row.email}"/></td>
               <td><c:out value = "${row.username}"/></td>
           
               <td>
                   <a href="edit_add.jsp?id=${row.id}" type="button" id="sub" class="btn btn-default show_admin" >Edit</button>
                   <a href="deletadmin.jsp?id=${row.id}" type="button" name="delete_admin_btn" class="btn btn-danger" name="id">Delete</button>
                                        
            </td> 
            </tr>
         </c:forEach>
                                   
                                  
                              
                            </table>
                    </div>


                    

                </div>
            </div>
        </div>
    </section>



    <footer id="footer">
        <p>Copyright RAMI-SENBLI, &copy; 2019</p>
    </footer>
    <!-- Optional JavaScript -->
    <script src="js/jquery-3.3.1.min.js"></script>
    <script src="js/jBox.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/ajaxForm.js" ></script>
    <script type="text/javascript">
    var UserId = 3;
    var name;
    
    //Modal of updating
    var modal = new jBox('Modal', {
            width: 450,
            height: 'auto',
            closeButton: 'title',
            animation: false,
            title: 'Edit user',
            ajax: {
                url: 'V_admin_inputs.php',
                data: {
                    id: UserId,
                },
                reload: 'strict',
                setContent: false,
                beforeSend: function() {
                    this.setContent('');
                    this.setTitle('<div class="ajax-sending"><b>Edit user '+name+'</b></div>');
                },
                complete: function(response) {
                },
                success: function(response) {
                    this.setContent('<div class="ajax-success">Response:<tt>' + response + '</tt></div>');
                },
                error: function() {
                    this.setContent('<div class="ajax-error">Oops, something went wrong</div>');
                }
            }
        });
    function getModal(idd,n)
    {
        UserId = idd;
        name = n;
        modal.open();
        modal.ajax({
                url: 'V_admin_inputs.php',
                data: {
                    id: UserId,
                },
                reload: 'strict',
                setContent: false,
                beforeSend: function() {
                    this.setContent('');
                    this.setTitle('<div class="ajax-sending">Edit user '+name+'</div>');
                },
                complete: function(response) {
                },
                success: function(response) {
                    this.setContent('<div class="ajax-success"><tt>' + response + '</tt></div>');
                },
                error: function() {
                    this.setContent('<div class="ajax-error">Oops, something went wrong</div>');
                }
            });
    }
    
    function update_file_badge(){
        document.location.href="update_file_badge.php";
    } 
    function update_participant_badge(){
        document.location.href="update_participant_badge.php";
    }

    
    // searhing
    function myFunction() {
        var input, filter, table, tr, td, i;
        input = document.getElementById("myInput");
        filter = input.value.toUpperCase();
        table = document.getElementById("myTable");
        tr = table.getElementsByTagName("tr");
        for (i = 0; i < tr.length; i++) {
            td = tr[i].getElementsByTagName("td")[1];
            if (td) {
                if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
                    tr[i].style.display = "";
                } else {
                    tr[i].style.display = "none";
                }
            }       
        }
    }



    //Delete an admin
        function delete_admin(data) {
            var conf = confirm("Are you sure that you want to do this operation ?!");
            if (conf == true) {
                var id=data;
                $.ajax({
                    type:"POST", 
                    url:"../controler/A_delete_admin.php",
                    data:{id:+id},
                    success: function(data)
                    {
                        $("#main1").html(data);
                    }
                }) 
                } 
        }



    </script>

</body>
</html>

