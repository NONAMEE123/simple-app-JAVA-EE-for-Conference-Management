package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Conference</title>\n");
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
      out.write("                        Conference 2019\n");
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
      out.write("                    <li><a  href=\"registration.jsp\">Information</a></li>\n");
      out.write("                    <li><a  href=\"speakrs.jsp\">Registration</a></li>\n");
      out.write("                    <li><a  href=\"submission.jsp\">login</a></li>\n");
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
      out.write("     <!--*********************************\n");
      out.write("    start about us\n");
      out.write("    *********************************-->\n");
      out.write("    <section id=\"about\" class=\"section about\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <figure>\n");
      out.write("                        <img alt=\"\" class=\"img-responsive\" src=\"assets/images/about_us.jpg\">\n");
      out.write("                    </figure>\n");
      out.write("                </div><!-- /.col-sm-6 -->\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <h3 class=\"section-title multiple-title\">What is Our Goal?</h3>\n");
      out.write("                    <p>ESTE Conference is a conference management system that is flexible, easy to use, and has many features to make it suitable for various conference models. It is currently probably the most commonly used conference management system.</p>\n");
      out.write("                    <h3 class=\"section-title\">About Us</h3>\n");
      out.write("                    <p>The first version of ESTE Conference was implemented in 2009. It was used by 08 conferences in 2009-2017 and by 2 conferences in 2016. We believe that since 2014 we have become number one conference management system in the number of conferences, users and submissions.</p>\n");
      out.write("                </div><!-- /.col-sm-6 -->\n");
      out.write("                <div><p style=\"margin:0 15px 0 15px\">Version of ESTE Conference was implemented in 2009. It was used by 08 conferences in 2009-2017 and by 2 conferences in 2016. We believe that since 2014 we have become number one conference management system in the number on 2009. It was used by 08 conferences in 2009-2017 and by 2 conferences in 2016. We believe that since 2014 we have become number one conference management system in the number of conference.</p></div>\n");
      out.write("            </div><!-- /.row -->\n");
      out.write("        </div><!-- /.container -->\n");
      out.write("    </section>\n");
      out.write("    <!--*********************************\n");
      out.write("    end about us\n");
      out.write("    *********************************-->\n");
      out.write("\n");
      out.write("<!--*********************************\n");
      out.write("    start sponsore\n");
      out.write("    *********************************-->\n");
      out.write("    <section id=\"partner\" class=\"section partner\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <h3 class=\"section-title\">Event Partner</h3>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <a class=\"partner-box partner-box-1\"></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <a class=\"partner-box partner-box-2\"></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <a class=\"partner-box partner-box-3\"></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <a class=\"partner-box partner-box-4\"></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    </section>\n");
      out.write("    <!--*********************************\n");
      out.write("    end sponsore\n");
      out.write("    *********************************-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("     <!--*********************************\n");
      out.write("    start questions\n");
      out.write("    *********************************-->\n");
      out.write("    <section id=\"faq\" class=\"section faq\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <h3 class=\"section-title\">Event FAQs</h3>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <div class=\"panel-group\" id=\"accordion\" role=\"tablist\" aria-multiselectable=\"true\">\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\" role=\"tab\" id=\"headingOne\">\n");
      out.write("                                <h4 class=\"panel-title\">\n");
      out.write("                                    <a class=\"faq-toggle collapsed\" role=\"button\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseOne\" aria-expanded=\"true\" aria-controls=\"collapseOne\"> What is the price of the ticket ?</a>\n");
      out.write("                                </h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"collapseOne\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"headingOne\">\n");
      out.write("                                <div class=\"panel-body\">\n");
      out.write("                                    <h3>Hello</h3>\n");
      out.write("                                    <p>Lorem Ipsum</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\" role=\"tab\" id=\"headingTwo\">\n");
      out.write("                                <h4 class=\"panel-title\">\n");
      out.write("                                    <a class=\"faq-toggle collapsed\" role=\"button\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseTwo\" aria-expanded=\"false\" aria-controls=\"collapseTwo\"> What is included in my ticket ?</a>\n");
      out.write("                                </h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"collapseTwo\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"headingTwo\">\n");
      out.write("                                <div class=\"panel-body\">Hello</div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\" role=\"tab\" id=\"headingThree\">\n");
      out.write("                                <h4 class=\"panel-title\">\n");
      out.write("                                    <a class=\"faq-toggle collapsed\" role=\"button\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseThree\" aria-expanded=\"false\" aria-controls=\"collapseThree\"> Office address ?</a>\n");
      out.write("                                </h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"collapseThree\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"headingThree\">\n");
      out.write("                                <div class=\"panel-body\">Hello</div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\" role=\"tab\" id=\"headingFour\">\n");
      out.write("                                <h4 class=\"panel-title\">\n");
      out.write("                                    <a class=\"faq-toggle collapsed\" role=\"button\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseFour\" aria-expanded=\"false\" aria-controls=\"collapseFour\"> How should I dress ?</a>\n");
      out.write("                                </h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"collapseFour\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"headingFour\">\n");
      out.write("                                <div class=\"panel-body\">Hello</div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\" role=\"tab\" id=\"headingFive\">\n");
      out.write("                                <h4 class=\"panel-title\">\n");
      out.write("                                    <a class=\"faq-toggle collapsed\" role=\"button\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseFive\" aria-expanded=\"false\" aria-controls=\"collapseFive\"> I have specific questions that are not addressed here. Who can help me ?</a>\n");
      out.write("                                </h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"collapseFive\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"headingFive\">\n");
      out.write("                                <div class=\"panel-body\">Hello</div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    </section>\n");
      out.write("    <!--*********************************\n");
      out.write("    end questions\n");
      out.write("    *********************************-->\n");
      out.write("\n");
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
      out.write("\n");
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
