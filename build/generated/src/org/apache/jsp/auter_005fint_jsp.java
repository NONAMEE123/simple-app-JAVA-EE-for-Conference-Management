package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class auter_005fint_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Auteur| Dashboard</title>\n");
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
      out.write("          <a class=\"navbar-brand\" href=\"#\">Conference</a>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"navbar\" class=\"collapse navbar-collapse\">\n");
      out.write("          <ul class=\"nav navbar-nav\">\n");
      out.write("            <li class=\"active\"><a href=\"dashbord.jsp\">Dashboard</a></li>\n");
      out.write("            <li><a href=\"Admin.jsp\">Admin</a></li>\n");
      out.write("            <li><a href=\"Conference.jsp\">conference</a></li>\n");
      out.write("            <li><a href=\"Participants.jsp\">Participant</a></li>\n");
      out.write("            <li><a href=\"papier.jsp\">papier</a></li>\n");
      out.write("            <li><a href=\"Message.jsp\">message</a></li>\n");
      out.write("          </ul>\n");
      out.write("          <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("            <li><a href=\"#\">Welcome,</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div><!--/.nav-collapse -->\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("                    ");

    if ((session.getAttribute("username") == null) || (session.getAttribute("username") == "")) {
response.sendRedirect("login_auteur.jsp");

      out.write("\n");
      out.write("You are not logged in<br/>\n");
      out.write("<a href=\"login_auteur.jsp\">Please Login</a>\n");
} else {

      out.write("\n");
      out.write("Welcome ");
      out.print(session.getAttribute("username"));
      out.write("\n");
      out.write("<br>\n");
      out.write("<a href='logout_auteur.jsp'>Log out</a>\n");
      out.write("<a href='edit_auteur.jsp'>Edit Account</a>\n");
      out.write("\n");

    }

      out.write("\n");
      out.write("     \n");
      out.write("    <header id=\"header\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-10\">\n");
      out.write("            <h1><span class=\"glyphicon glyphicon-home\" aria-hidden=\"true\"></span> Dashboard <small> Particpant</small></h1>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-2\">\n");
      out.write("            <div class=\"dropdown create\">\n");
      out.write("              <button class=\"btn btn-default dropdown-toggle\" type=\"button\" id=\"dropdownMenu1\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"true\">\n");
      out.write("                <span class=\"ion-gear-b\" aria-hidden=\"true\">\n");
      out.write("                             <span class=\"glyphicon glyphicon-user\">\n");
      out.write("                            </span> My Account\n");
      out.write("                            <span class=\"caret\"></span>\n");
      out.write("              </button>\n");
      out.write("               <ul class=\"dropdown-menu\" aria-labelledby=\"dropdownMenu1\">\n");
      out.write("                <li><a type=\"button\" data-toggle=\"modal\" data-target=\"#addPage\">Logout</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <section id=\"breadcrumb\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <section id=\"main\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-3\">\n");
      out.write("            <div class=\"list-group\">\n");
      out.write("              <a href=\"dashbord.jsp\" class=\"list-group-item active main-color-bg\">\n");
      out.write("              <span class=\"glyphicon glyphicon-home\" aria-hidden=\"true\"></span> Dashboard\n");
      out.write("              </a>\n");
      out.write("              <a href=\"papier.jsp\" class=\"list-group-item\"><span class=\"glyphicon glyphicon-list-alt\" aria-hidden=\"true\"></span> Papier <span class=\"badge\"></span></a>\n");
      out.write("               <a href=\"papier_par.jsp\" class=\"list-group-item\"><span class=\"glyphicon glyphicon-list-alt\" aria-hidden=\"true\"></span> Submission <span class=\"badge\"></span></a>\n");
      out.write("              <a href=\"inscription_c.jsp\" class=\"list-group-item\"><span class=\"glyphicon glyphicon-book\" aria-hidden=\"true\"></span>Inscription <span class=\"badge\"></span></a>\n");
      out.write("               <a href=\"edit_p_auteur.jsp\" class=\"list-group-item\"><span class=\"glyphicon glyphicon-bookmark\" aria-hidden=\"true\"></span> change yuor profile <span class=\"badge\"></span></a>\n");
      out.write("\n");
      out.write("                           \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("           \n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-9\">\n");
      out.write("            <!-- Website Overview -->\n");
      out.write("            <div class=\"panel panel-default\">\n");
      out.write("              <div class=\"panel-heading main-color-bg\">\n");
      out.write("                <h3 class=\"panel-title\">Dashboard Overview</h3>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"panel-body\">\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                  <div class=\"well dash-box\">\n");
      out.write("                    <h2><span class=\"glyphicon glyphicon-envelope\" aria-hidden=\"true\"></span> 203</h2>\n");
      out.write("                    <h4>Message</h4>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                  <div class=\"well dash-box\">\n");
      out.write("                    <h2><span class=\"glyphicon glyphicon-education\" aria-hidden=\"true\"></span> 12</h2>\n");
      out.write("                    <h4>Participants</h4>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                  <div class=\"well dash-box\">\n");
      out.write("                    <h2><span class=\"glyphicon glyphicon-pencil\" aria-hidden=\"true\"></span> 33</h2>\n");
      out.write("                    <h4>Session</h4>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                  <div class=\"well dash-box\">\n");
      out.write("                    <h2><span class=\"glyphicon glyphicon-stats\" aria-hidden=\"true\"></span> 12,334</h2>\n");
      out.write("                    <h4>Visitors</h4>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <!-- Latest Users -->\n");
      out.write("                \n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <footer id=\"footer\">\n");
      out.write("      <p>Copyright RAMI-SENBLI, &copy; 2019</p>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("    <!-- Modals -->\n");
      out.write("\n");
      out.write("    <!-- Add Page -->\n");
      out.write("    <div class=\"modal fade\" id=\"addPage\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <form>\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("        <h4 class=\"modal-title\" id=\"myModalLabel\">Add Page</h4>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <label>Page Title</label>\n");
      out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"Page Title\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <label>Page Body</label>\n");
      out.write("          <textarea name=\"editor1\" class=\"form-control\" placeholder=\"Page Body\"></textarea>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"checkbox\">\n");
      out.write("          <label>\n");
      out.write("            <input type=\"checkbox\"> Published\n");
      out.write("          </label>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <label>Meta Tags</label>\n");
      out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"Add Some Tags...\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <label>Meta Description</label>\n");
      out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"Add Meta Description...\">\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary\">Save changes</button>\n");
      out.write("      </div>\n");
      out.write("    </form>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
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
