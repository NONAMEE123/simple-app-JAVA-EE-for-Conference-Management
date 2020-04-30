package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class submission_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("    <title>ESTE Conference</title>\n");
      out.write("\n");
      out.write("    <!-- css -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"bower_components/bootstrap/dist/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"bower_components/ionicons/css/ionicons.min.css\">\n");
      out.write("     <link href=\"https://fonts.googleapis.com/css?family=Lato:300,400,400i|Montserrat:400,700\" rel=\"stylesheet\">\n");
      out.write("     \n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/main.css\">\n");
      out.write("    \n");
      out.write("        \n");
      out.write("        <style type=\"text/css\">\n");
      out.write(" \t\tbody {\n");
      out.write("    margin:0;\n");
      out.write("    font-family: \"calibri\";\n");
      out.write("    width:100%; \n");
      out.write("    background:url(images/main.jpg) center 0 repeat;\n");
      out.write("    border-top:#000000 5px solid;\n");
      out.write("}\n");
      out.write("\n");
      out.write("header ul {\n");
      out.write("    list-style-type: none;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    font-size: 20px;\n");
      out.write("    overflow: hidden;\n");
      out.write("    background-color: #111;\n");
      out.write("    position: fixed;\n");
      out.write("    top: 0;\n");
      out.write("    width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("header ul li {\n");
      out.write("    float: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("header ul li a {\n");
      out.write("    display: block;\n");
      out.write("    color: white;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 14px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("header ul li a:hover:not(.active) {\n");
      out.write("    background-color: #333;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".active {\n");
      out.write("    background-color: #68abc2;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/*-------------------------------------Register--------------------------------------------------*/\n");
      out.write("\n");
      out.write("form{\n");
      out.write("    margin: 13% 30%;\n");
      out.write("    font-size: 30px;\n");
      out.write("    width: 500px;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form p{\n");
      out.write("    border-top: 2px solid #111;\n");
      out.write("    border-bottom: 2px solid #111;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form legend{\n");
      out.write("    margin: 0 auto;\n");
      out.write("    text-align: center;\n");
      out.write("    color: white;\n");
      out.write("    font-weight: bold;\n");
      out.write("    font-size: 30px;\n");
      out.write("    background-color: #111;\n");
      out.write("    width: 230px;\n");
      out.write("    height: 40px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form fieldset{\n");
      out.write("    border: 2px solid #111;\n");
      out.write("    border-radius: 3px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("button  {\n");
      out.write("    display: block;\n");
      out.write("    padding: 10px;\n");
      out.write("    color: #fff;\n");
      out.write("    font-weight: bold;\n");
      out.write("    font-size: 14px;\n");
      out.write("    background-color: #111;\n");
      out.write("    width: 350px;\n");
      out.write("    margin: 3% auto;\n");
      out.write("    margin-top: 5%;\n");
      out.write("    border-radius: 3px;\n");
      out.write("    border: 1px solid #eee;\n");
      out.write("    cursor: pointer;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("button a{\n");
      out.write("    text-decoration: none;\n");
      out.write("    color: white;\n");
      out.write("    display: block;\n");
      out.write("    margin: 0 auto;\n");
      out.write("    padding: 10px;\n");
      out.write("    color: #fff;\n");
      out.write("    font-weight: bold;\n");
      out.write("    font-size: 30px;\n");
      out.write("    width: 310px;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button :hover {\n");
      out.write("    background-color: #68abc2;\n");
      out.write("}\n");
      out.write(" \t</style>\n");
      out.write("        \n");
      out.write("\n");
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
      out.write("                         Conference 2019\n");
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
      out.write("                    <li><a  href=\"index.jsp\">Home</a></li>\n");
      out.write("                    <li><a  href=\"about.jsp\">About Us</a></li>\n");
      out.write("                    <li><a  href=\"registration.jsp\">Registration</a></li>\n");
      out.write("                    <li><a  href=\"speakrs.jsp\">Speakers</a></li>\n");
      out.write("                    <li><a  href=\"submission.jsp\">login</a></li>\n");
      out.write("                    <li><a  href=\"contact us.jsp\">Contact</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div><!-- /.container -->\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<form>\n");
      out.write("\t<legend>Register</legend>\n");
      out.write("\t<fieldset>\n");
      out.write("\t\t<button ><a href=\"Responsable_inscription.jsp\">Responsable</a></button>\n");
      out.write("\t\t<p>Or</p>\n");
      out.write("\t\t<button ><a href=\"Auteur_inscription.jsp\">Auteur</a></button>\n");
      out.write("                \n");
      out.write("\n");
      out.write("\t</fieldset>\n");
      out.write("\t</form>\n");
      out.write("\n");
      out.write(" <footer class=\"site-footer\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <p class=\"site-info\">Designed and <br> Developed by <a href=\"#\">RAMI, SENBLI</a></p>\n");
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
      out.write("    <!-- script -->\n");
      out.write("    <script src=\"bower_components/jquery/dist/jquery.min.js\"></script>\n");
      out.write("    <script src=\"bower_components/bootstrap/dist/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"bower_components/smooth-scroll/dist/js/smooth-scroll.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/main.js\"></script>\n");
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
