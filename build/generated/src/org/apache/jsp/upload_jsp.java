package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class upload_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <style>\n");
      out.write("        \n");
      out.write("    </style>\n");
      out.write("    <title>ESTE Conference</title>\n");
      out.write("\n");
      out.write("    <!-- css -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"bower_components/bootstrap/dist/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"bower_components/ionicons/css/ionicons.min.css\">\n");
      out.write("     <link href=\"https://fonts.googleapis.com/css?family=Lato:300,400,400i|Montserrat:400,700\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/main.css\">\n");
      out.write("</head>\n");
      out.write("<body data-spy=\"scroll\" data-target=\"#site-nav\">\n");
      out.write("\n");
      out.write("    <!--*********************************\n");
      out.write("    start navbar\n");
      out.write("    *********************************-->\n");
      out.write("    <nav id=\"site-nav\" class=\"navbar navbar-custom\" style=\"background:black\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <!-- start logo -->\n");
      out.write("                <div class=\"site-branding\">\n");
      out.write("                    <a class=\"logo\" href=\"index.html\">\n");
      out.write("                        <img src=\"assets/images/logo.png\" alt=\"Logo\">\n");
      out.write("                        ESTE Conference 2018\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <!-- end logo -->\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar-items\" aria-expanded=\"false\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("            <!--navbar header -->\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbar-items\">\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <!-- navigation menu -->\n");
      out.write("                    <li><a  href=\"index.jsp\">Home</a></li>\n");
      out.write("                    <li><a  href=\"about.jsp\">About Us</a></li>\n");
      out.write("                    <li><a  href=\"registration.jsp\">Registration</a></li>\n");
      out.write("                    <li><a  href=\"speakers.jsp\">Speakers</a></li>\n");
      out.write("                    <li><a  href=\"submissions.jsp\">Faqs</a></li>\n");
      out.write("                    <li><a  href=\"contact us.jsp\">Contact</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div><!-- /.container -->\n");
      out.write("    </nav>\n");
      out.write("    <!--*********************************\n");
      out.write("    end navbar\n");
      out.write("    *********************************-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\"> <br />\n");
      out.write("    <div class=\"row\">\n");
      out.write("\n");
      out.write("    \t<div class=\"col-md-12\">\n");
      out.write("\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t<div class=\"panel-heading\"><strong>Upload file</strong> <small> </small></div>\n");
      out.write("\t\t\t\t<div class=\"panel-body\">\n");
      out.write("   \t\t\t\t\t\n");
      out.write("   \t\t\t\t\t <input type=\"text\" class=\"form-control\" placeholder=\"Enter File Title\" required>\n");
      out.write("\t\t\t\t\t <br>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"input-group image-preview\">\n");
      out.write("\t\t\t\t\t\t<input placeholder=\"\" type=\"text\" class=\"form-control image-preview-filename\"  id=\"files-input-upload\" disabled=\"disabled\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<!-- don't give a name === doesn't send on POST/GET --> \n");
      out.write("\t\t\t\t\t\t<span class=\"input-group-btn\"> \n");
      out.write("\t\t\t\t\t\t<!-- image-preview-clear button -->\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default image-preview-clear\" style=\"display:none;\"> <span class=\"glyphicon glyphicon-remove\"></span> Clear </button>\n");
      out.write("\t\t\t\t\t\t<!-- image-preview-input -->\n");
      out.write("\t\t\t\t\t\t<div class=\"btn btn-default image-preview-input\" id=\"fake-file-button-browse\"> <span class=\"glyphicon glyphicon-folder-open\"></span> \n");
      out.write("\t\t\t\t\t\t\t<span class=\"image-preview-input-title\">Browse</span>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"file\" accept=\"image/png, image/jpeg, image/gif\" name=\"input-file-preview\"/>\n");
      out.write("\t\t\t\t\t\t\t<!-- rename it --> \n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-labeled btn-primary\"> <span class=\"btn-label\"><i class=\"glyphicon glyphicon-upload\"></i> </span>Upload</button>\n");
      out.write("\t\t\t\t\t\t</span> </div>\n");
      out.write("\t\t\t\t\t<!-- /input-group image-preview [TO HERE]--> \n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<br />\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<!-- Drop Zone -->\n");
      out.write("\t\t\t\t\t<div class=\"upload-drop-zone\" id=\"drop-zone\"> Or drag and drop file here </div>\n");
      out.write("\t\t\t\t\t<br />\n");
      out.write("\t\t\t\t\t<!-- Progress Bar -->\n");
      out.write("\t\t\t\t\t<div class=\"progress\">\n");
      out.write("\t\t\t\t\t\t<div class=\"progress-bar\" role=\"progressbar\" aria-valuenow=\"60\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 60%;\"> <span class=\"sr-only\">60% Complete</span> </div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<br />\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("     <!--*********************************\n");
      out.write("    start footer\n");
      out.write("    *********************************-->\n");
      out.write("    <footer class=\"site-footer\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <p class=\"site-info\">Designed and <br> Developed by <a href=\"#\">ESSANHAJI, ESSOUBAKI</a></p>\n");
      out.write("                    <ul class=\"social-block\">\n");
      out.write("                        <li><a href=\"#\"><i class=\"ion-social-twitter\"></i></a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"ion-social-facebook\"></i></a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"ion-social-linkedin-outline\"></i></a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"ion-social-googleplus\"></i></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("    <!--*********************************\n");
      out.write("    end footer\n");
      out.write("    *********************************-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- script -->\n");
      out.write("    <script src=\"bower_components/jquery/dist/jquery.min.js\"></script>\n");
      out.write("    <script src=\"bower_components/bootstrap/dist/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"bower_components/smooth-scroll/dist/js/smooth-scroll.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/main.js\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("    \tdocument.getElementById('fake-file-button-browse').addEventListener('click', function() {\n");
      out.write("\t\tdocument.getElementById('files-input-upload').click();\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\tdocument.getElementById('files-input-upload').addEventListener('change', function() {\n");
      out.write("\t\t\tdocument.getElementById('fake-file-input-name').value = this.value;\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tdocument.getElementById('fake-file-button-upload').removeAttribute('disabled');\n");
      out.write("\t\t});\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
