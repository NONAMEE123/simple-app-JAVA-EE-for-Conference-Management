package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class auteur_005fpar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Admin Area</title>\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("    <script src=\"http://cdn.ckeditor.com/4.6.1/standard/ckeditor.js\"></script>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("    <nav class=\"navbar navbar-default\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("          </button>\n");
      out.write("          <a class=\"navbar-brand\" href=\"Admin.jsp\">AdminStrap</a>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"navbar\" class=\"collapse navbar-collapse\">\n");
      out.write("\n");
      out.write("        </div><!--/.nav-collapse -->\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("   \n");
      out.write("    <header id=\"header\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-12\">\n");
      out.write("            <h1 class=\"text-center\"> Participation Area <small>Participate now</small></h1>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <section id=\"main\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-4 col-md-offset-4\">\n");
      out.write("              <form  action=\"inscri_participant.jsp\" class=\"well\" method=\"post\">\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                    <label>ID</label>\n");
      out.write("                    <input type=\"text\" name=\"id\" class=\"form-control\" disabled />\n");
      out.write("                  </div>\n");
      out.write("                    <label>FistName</label>\n");
      out.write("                    <input type=\"text\" name=\"name\"class=\"form-control\" placeholder=\"Enter Firstname\"/>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <label>LastName</label>\n");
      out.write("                    <input type=\"text\" name=\"Last_name\" class=\"form-control\" placeholder=\"Enter lastName\" />\n");
      out.write("                  </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Email</label>\n");
      out.write("                    <input type=\"email\" name=\"email\" class=\"form-control\" placeholder=\"Enter Email\" />\n");
      out.write("                   </div>\n");
      out.write("                                  <div class=\"form-group\">\n");
      out.write("                    <label>phone_number</label>\n");
      out.write("                    <input type=\"text\" name=\"phone_number\" class=\"form-control\" placeholder=\"Enter a phone number\" />\n");
      out.write("                   </div>\n");
      out.write("                                  <div class=\"form-group\">\n");
      out.write("                    <label>Adress</label>\n");
      out.write("                    <input type=\"text\" name=\"adress\" class=\"form-control\" placeholder=\"Enter Email\" />\n");
      out.write("                   </div>\n");
      out.write("                  <label>username</label>\n");
      out.write("                    <input type=\"text\" name=\"username\" class=\"form-control\" placeholder=\"Enter a username\" />\n");
      out.write("                   </div>\n");
      out.write("                   <label>pasword</label>\n");
      out.write("                    <input type=\"text\" name=\"password\" class=\"form-control\" placeholder=\"Enter a password\" />\n");
      out.write("                   </div>\n");
      out.write("                   \n");
      out.write("                  <button type=\"submit\" class=\"btn btn-default btn-block\">insert</button>\n");
      out.write("                  <button type=\"reset\" class=\"btn btn-default btn-block\">reset</button>\n");
      out.write("\n");
      out.write("              </form>\n");
      out.write("                  \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <footer id=\"footer\">\n");
      out.write("      <p>Copyright Rami-Senbli, &copy; 2019</p>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("  <script>\n");
      out.write("     CKEDITOR.replace( 'editor1' );\n");
      out.write(" </script>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core JavaScript\n");
      out.write("    ================================================== -->\n");
      out.write("    <!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("  </body>\n");
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
