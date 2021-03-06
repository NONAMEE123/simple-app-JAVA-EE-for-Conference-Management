package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Ajout_005fadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/ionicons.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/jBox.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    \n");
      out.write(" <!--\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>    <link rel=\"stylesheet\" href=\"css/style.css\"/>\n");
      out.write(" -->\n");
      out.write("    <title>Admin System</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-default\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                  <div class=\"navbar-header\">\n");
      out.write("                  </div>\n");
      out.write("                  <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li><a href=\"dashbord.jsp\">Dashboard</a></li>\n");
      out.write("                    <li><a href=\"Participants.jsp\"> Participants</a></li>\n");
      out.write("                    <li><a href=\"papier.jsp\"> papier</a></li>\n");
      out.write("                    <li class=\"active\"><a href=\"Admin.jsp\"> Admins</a></li>\n");
      out.write("                    <li><a href=\"Conference.jsp\"> Conference</a></li>\n");
      out.write("                                        <li><a href=\"Message.jsp\"> Messages</a></li>\n");
      out.write("\n");
      out.write("                      </ul>\n");
      out.write("                  <div class=\"navbar-right\" style=\"color:white;margin-top:15px;\">\n");
      out.write("          \t\t\t  <span style=\"margin-right:20px\">Welcome, </span>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("<header id=\"header\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-10\">\n");
      out.write("                            <h1><span class=\"ion-android-person-add\" aria-hidden=\"true\">\n");
      out.write("                                 <span class=\"glyphicon glyphicon-user\">\n");
      out.write("                        </span> Admin <small> Admins Management </small></h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-2\">\n");
      out.write("                    <div class=\"dropdown create\">\n");
      out.write("                        <button class=\"btn btn-default dropdown-toggle\" type=\"button\" id=\"dropdownMenu1\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"true\">\n");
      out.write("                            \n");
      out.write("                            <span class=\"ion-gear-b\" aria-hidden=\"true\">\n");
      out.write("                             <span class=\"glyphicon glyphicon-user\">\n");
      out.write("                            </span> My Account\n");
      out.write("                            <span class=\"caret\"></span>\n");
      out.write("                            \n");
      out.write("                        </button>\n");
      out.write("                        \n");
      out.write("                        <ul class=\"dropdown-menu\" aria-labelledby=\"dropdownMenu1\">\n");
      out.write("                               \n");
      out.write("                         </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <section class=\"breadcrumb\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <ol class=\"breadcrumb\" style=\"padding:0;margin:0;\">\n");
      out.write("                <li class=\"active\">Dashboard / Admins</li>\n");
      out.write("            </ol>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <div id=\"main1\"></div>\n");
      out.write("    <section id=\"main\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <div class=\"list-group\">\n");
      out.write("                        <a href=\"dashbord.jsp\" class=\"list-group-item active main-color-bg\">\n");
      out.write("                <span class=\"glyphicon glyphicon-home\" aria-hidden=\"true\"></span> Dashboard\n");
      out.write("              </a>\n");
      out.write("              <a href=\"papier.jsp\" class=\"list-group-item\"><span class=\"glyphicon glyphicon-list-alt\" aria-hidden=\"true\"></span> Papier <span class=\"badge\"></span></a>\n");
      out.write("              <a href=\"Participants.jsp\" class=\"list-group-item\"><span class=\"glyphicon glyphicon-education\" aria-hidden=\"true\"></span> Participants <span class=\"badge\"></span></a>\n");
      out.write("              <a href=\"Admin.jsp\" class=\"list-group-item\"><span class=\"glyphicon glyphicon-user\" aria-hidden=\"true\"></span> Admin <span class=\"badge\"></span></a>\n");
      out.write("              <a href=\"Conference.jsp\" class=\"list-group-item\"><span class=\"glyphicon glyphicon-book\" aria-hidden=\"true\"></span>conference  <span class=\"badge\"></span></a>\n");
      out.write("              <a href=\"Message.jsp\" class=\"list-group-item\"><span class=\"glyphicon glyphicon-envelope\" aria-hidden=\"true\"></span> Message <span class=\"badge\"></span></a>\n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                 <!--    PANEL  -->\n");
      out.write("                 <div class=\"col-md-9\">\n");
      out.write("                    <!-- BUTTONS-->\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                                <div class=\"ds-btn\">\n");
      out.write("                                        <button type=\"button\" class=\"btn main-color-bg btn-block\" data-toggle=\"modal\" data-target=\".bd-example-modal-lg\">                             <span> <i class=\"glyphicon glyphicon-plus-sign\t\n");
      out.write("\"></i>\n");
      out.write(" Add Admin<br></span>\n");
      out.write("                                        </button>\n");
      out.write("                                </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                <div class=\"modal fade bd-example-modal-lg add2\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myLargeModalLabel\" aria-hidden=\"true\">\n");
      out.write("                  <div class=\"modal-dialog \">\n");
      out.write("\n");
      out.write("                    <form action=\"../controler/A_add_admin.php\" method=\"POST\">\n");
      out.write("                    <div class=\"modal-content\">\n");
      out.write("                      \n");
      out.write("                            <div class=\"modal-header\">\n");
      out.write("                                    <h5 class=\"modal-title\" style=\"display:inline-block;font-size:20px\"><b>Add New Admin</b></h5>\n");
      out.write("                                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                                <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                            </button>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"modal-body\">\n");
      out.write("                            \n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"text\" name=\"first_name\" placeholder=\"First Name:\" required>\n");
      out.write("                                        <input type=\"text\" name=\"last_name\" placeholder=\"Last Name:\" required style=\"float:none\">\n");
      out.write("                                        <br>\n");
      out.write("                                        <input type=\"text\" name=\"username\" placeholder=\"Username:\" required>\n");
      out.write("                                        <input type=\"email\" name=\"email\" placeholder=\"Email:\" required>\n");
      out.write("                                        <input type=\"password\" name=\"password1\" placeholder=\"Password:\" required>\n");
      out.write("                                        <input type=\"password\" name=\"password2\" placeholder=\"Repeat Password :\"><br>\n");
      out.write("                                    </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"modal-footer\" style=\"clear:both\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\" >Close</button>\n");
      out.write("                            <button type=\"vv@c\" name=\"Admin_submit_inset\" class=\"btn btn-primary\" >Add</button>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                  </form>       \n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!--LIST OF ADMINS-->\n");
      out.write("                <div class=\"panel panel-default \">\n");
      out.write("                    <div class=\"panel-heading main-color-bg\">\n");
      out.write("                        </span><h3 class=\"panel-title\"><span class=\"ion-android-arrow-dropdown\" aria-hidden=\"true\"></span> List Of Admins</h3>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <!--input for searching-->\n");
      out.write("                                <input class=\"form-control\" id=\"myInput\" onkeyup=\"myFunction()\" type=\"text\" placeholder=\"Filter By Names\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                        <table id=\"myTable\" class=\"table table-striped table-hover\">\n");
      out.write("                            \n");
      out.write("                                <tr class=\"header\">\n");
      out.write("                                    <th>Id</th>\n");
      out.write("                                    <th>First Name</th>\n");
      out.write("                                    <th>Last Name</th>\n");
      out.write("                                    <th>Email</th>\n");
      out.write("                                    <th>Username</th>\n");
      out.write("                                    <th>Pasword</th>\n");
      out.write("                                     <td>\n");
      out.write("                                            <button type=\"button\" id=\"sub\" class=\"btn btn-default show_admin\" onClick=\"\" >Edit</button>\n");
      out.write("                                            <button  onclick=\"\"  type=\"submit\" name=\"delete_admin_btn\" class=\"btn btn-danger\" id=\"\">Delete</button>\n");
      out.write("                                        </td>   \n");
      out.write("                                </tr>    \n");
      out.write("                                \n");
      out.write("                                   \n");
      out.write("                                  \n");
      out.write("                              \n");
      out.write("                            </table>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    \n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <footer id=\"footer\">\n");
      out.write("        <p>Copyright RAMI-SENBLI, &copy; 2019</p>\n");
      out.write("    </footer>\n");
      out.write("    <!-- Optional JavaScript -->\n");
      out.write("    <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("    <script src=\"js/jBox.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/ajaxForm.js\" ></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("    var UserId = 3;\n");
      out.write("    var name;\n");
      out.write("    \n");
      out.write("    //Modal of updating\n");
      out.write("    var modal = new jBox('Modal', {\n");
      out.write("            width: 450,\n");
      out.write("            height: 'auto',\n");
      out.write("            closeButton: 'title',\n");
      out.write("            animation: false,\n");
      out.write("            title: 'Edit user',\n");
      out.write("            ajax: {\n");
      out.write("                url: 'V_admin_inputs.php',\n");
      out.write("                data: {\n");
      out.write("                    id: UserId,\n");
      out.write("                },\n");
      out.write("                reload: 'strict',\n");
      out.write("                setContent: false,\n");
      out.write("                beforeSend: function() {\n");
      out.write("                    this.setContent('');\n");
      out.write("                    this.setTitle('<div class=\"ajax-sending\"><b>Edit user '+name+'</b></div>');\n");
      out.write("                },\n");
      out.write("                complete: function(response) {\n");
      out.write("                },\n");
      out.write("                success: function(response) {\n");
      out.write("                    this.setContent('<div class=\"ajax-success\">Response:<tt>' + response + '</tt></div>');\n");
      out.write("                },\n");
      out.write("                error: function() {\n");
      out.write("                    this.setContent('<div class=\"ajax-error\">Oops, something went wrong</div>');\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    function getModal(idd,n)\n");
      out.write("    {\n");
      out.write("        UserId = idd;\n");
      out.write("        name = n;\n");
      out.write("        modal.open();\n");
      out.write("        modal.ajax({\n");
      out.write("                url: 'V_admin_inputs.php',\n");
      out.write("                data: {\n");
      out.write("                    id: UserId,\n");
      out.write("                },\n");
      out.write("                reload: 'strict',\n");
      out.write("                setContent: false,\n");
      out.write("                beforeSend: function() {\n");
      out.write("                    this.setContent('');\n");
      out.write("                    this.setTitle('<div class=\"ajax-sending\">Edit user '+name+'</div>');\n");
      out.write("                },\n");
      out.write("                complete: function(response) {\n");
      out.write("                },\n");
      out.write("                success: function(response) {\n");
      out.write("                    this.setContent('<div class=\"ajax-success\"><tt>' + response + '</tt></div>');\n");
      out.write("                },\n");
      out.write("                error: function() {\n");
      out.write("                    this.setContent('<div class=\"ajax-error\">Oops, something went wrong</div>');\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    function update_file_badge(){\n");
      out.write("        document.location.href=\"update_file_badge.php\";\n");
      out.write("    } \n");
      out.write("    function update_participant_badge(){\n");
      out.write("        document.location.href=\"update_participant_badge.php\";\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    \n");
      out.write("    // searhing\n");
      out.write("    function myFunction() {\n");
      out.write("        var input, filter, table, tr, td, i;\n");
      out.write("        input = document.getElementById(\"myInput\");\n");
      out.write("        filter = input.value.toUpperCase();\n");
      out.write("        table = document.getElementById(\"myTable\");\n");
      out.write("        tr = table.getElementsByTagName(\"tr\");\n");
      out.write("        for (i = 0; i < tr.length; i++) {\n");
      out.write("            td = tr[i].getElementsByTagName(\"td\")[1];\n");
      out.write("            if (td) {\n");
      out.write("                if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {\n");
      out.write("                    tr[i].style.display = \"\";\n");
      out.write("                } else {\n");
      out.write("                    tr[i].style.display = \"none\";\n");
      out.write("                }\n");
      out.write("            }       \n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    //Delete an admin\n");
      out.write("        function delete_admin(data) {\n");
      out.write("            var conf = confirm(\"Are you sure that you want to do this operation ?!\");\n");
      out.write("            if (conf == true) {\n");
      out.write("                var id=data;\n");
      out.write("                $.ajax({\n");
      out.write("                    type:\"POST\", \n");
      out.write("                    url:\"../controler/A_delete_admin.php\",\n");
      out.write("                    data:{id:+id},\n");
      out.write("                    success: function(data)\n");
      out.write("                    {\n");
      out.write("                        $(\"#main1\").html(data);\n");
      out.write("                    }\n");
      out.write("                }) \n");
      out.write("                } \n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
