package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashbord_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Admin | Dashboard</title>\n");
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
      out.write("\n");
      out.write("    <header id=\"header\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-10\">\n");
      out.write("            <h1><span class=\"glyphicon glyphicon-home\" aria-hidden=\"true\"></span> Dashboard <small>Manage Your Site</small></h1>\n");
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
      out.write("              <a href=\"PArticipants.jsp\" class=\"list-group-item\"><span class=\"glyphicon glyphicon-education\" aria-hidden=\"true\"></span> Participants <span class=\"badge\"></span></a>\n");
      out.write("              <a href=\"Admin.jsp\" class=\"list-group-item\"><span class=\"glyphicon glyphicon-user\" aria-hidden=\"true\"></span> Admin <span class=\"badge\"></span></a>\n");
      out.write("              <a href=\"Conference.jsp\" class=\"list-group-item\"><span class=\"glyphicon glyphicon-book\" aria-hidden=\"true\"></span>conference  <span class=\"badge\"></span></a>\n");
      out.write("              <a href=\"Message.jsp\" class=\"list-group-item\"><span class=\"glyphicon glyphicon-envelope\" aria-hidden=\"true\"></span> Message <span class=\"badge\"></span></a>\n");
      out.write("               <a href=\"tutoriels.jsp\" class=\"list-group-item\"><span class=\"glyphicon glyphicon-bookmark\" aria-hidden=\"true\"></span> tutoriels <span class=\"badge\"></span></a>\n");
      out.write("\n");
      out.write("                  <!-- Strart :Calendar -->\n");
      out.write("                                            <div class=\"panel panel-default\" style=\"margin-top: 20px\">\n");
      out.write("                                            <div class=\"panel-heading\">\n");
      out.write("                                                Calendar\n");
      out.write("                                                <ul class=\"pull-right panel-settings panel-button-tab-right\">\n");
      out.write("                                                    <li class=\"dropdown\"><a class=\"pull-right dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                                                        <em class=\"fa fa-cogs\"></em>\n");
      out.write("                                                    </a>\n");
      out.write("                                                        <ul class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("                                                            <li>\n");
      out.write("                                                                <ul class=\"dropdown-settings\">\n");
      out.write("                                                                    <li><a href=\"#\">\n");
      out.write("                                                                        <em class=\"fa fa-cog\"></em> Settings 1\n");
      out.write("                                                                    </a></li>\n");
      out.write("                                                                    <li class=\"divider\"></li>\n");
      out.write("                                                                    <li><a href=\"#\">\n");
      out.write("                                                                        <em class=\"fa fa-cog\"></em> Settings 2\n");
      out.write("                                                                    </a></li>\n");
      out.write("                                                                    <li class=\"divider\"></li>\n");
      out.write("                                                                    <li><a href=\"#\">\n");
      out.write("                                                                        <em class=\"fa fa-cog\"></em> Settings 3\n");
      out.write("                                                                    </a></li>\n");
      out.write("                                                                </ul>\n");
      out.write("                                                            </li>\n");
      out.write("                                                        </ul>\n");
      out.write("                                                    </li>\n");
      out.write("                                                </ul>\n");
      out.write("                                                <span class=\"pull-right clickable panel-toggle panel-button-tab-left\"><em class=\"fa fa-toggle-up\"></em></span></div>\n");
      out.write("                                            <div class=\"panel-body\">\n");
      out.write("                                                <div id=\"calendar\"><div class=\"datepicker datepicker-inline\"><div class=\"datepicker-days\" style=\"display: block;\"><table class=\" table-condensed\"><thead><tr><th class=\"prev\" style=\"visibility: visible;\">«</th><th colspan=\"5\" class=\"datepicker-switch\">March 2018</th><th class=\"next\" style=\"visibility: visible;\">»</th></tr><tr><th class=\"dow\">Su</th><th class=\"dow\">Mo</th><th class=\"dow\">Tu</th><th class=\"dow\">We</th><th class=\"dow\">Th</th><th class=\"dow\">Fr</th><th class=\"dow\">Sa</th></tr></thead><tbody><tr><td class=\"old day\">25</td><td class=\"old day\">26</td><td class=\"old day\">27</td><td class=\"old day\">28</td><td class=\"day\">1</td><td class=\"day\">2</td><td class=\"day\">3</td></tr><tr><td class=\"day\">4</td><td class=\"day\">5</td><td class=\"day\">6</td><td class=\"day\">7</td><td class=\"day\">8</td><td class=\"day\">9</td><td class=\"day\">10</td></tr><tr><td class=\"day\">11</td><td class=\"day\">12</td><td class=\"day\">13</td><td class=\"day\">14</td><td class=\"day\">15</td><td class=\"day\">16</td><td class=\"day\">17</td></tr><tr><td class=\"day\">18</td><td class=\"day\">19</td><td class=\"day\">20</td><td class=\"day\">21</td><td class=\"day\">22</td><td class=\"day\">23</td><td class=\"day\">24</td></tr><tr><td class=\"day\">25</td><td class=\"day\">26</td><td class=\"day\">27</td><td class=\"day\">28</td><td class=\"day\">29</td><td class=\"day\">30</td><td class=\"day\">31</td></tr><tr><td class=\"new day\">1</td><td class=\"new day\">2</td><td class=\"new day\">3</td><td class=\"new day\">4</td><td class=\"new day\">5</td><td class=\"new day\">6</td><td class=\"new day\">7</td></tr></tbody><tfoot><tr><th colspan=\"7\" class=\"today\" style=\"display: none;\">Today</th></tr><tr><th colspan=\"7\" class=\"clear\" style=\"display: none;\">Clear</th></tr></tfoot></table></div><div class=\"datepicker-months\" style=\"display: none;\"><table class=\"table-condensed\"><thead><tr><th class=\"prev\" style=\"visibility: visible;\">«</th><th colspan=\"5\" class=\"datepicker-switch\">2018</th><th class=\"next\" style=\"visibility: visible;\">»</th></tr></thead><tbody><tr><td colspan=\"7\"><span class=\"month\">Jan</span><span class=\"month\">Feb</span><span class=\"month\">Mar</span><span class=\"month\">Apr</span><span class=\"month\">May</span><span class=\"month\">Jun</span><span class=\"month\">Jul</span><span class=\"month\">Aug</span><span class=\"month\">Sep</span><span class=\"month\">Oct</span><span class=\"month\">Nov</span><span class=\"month\">Dec</span></td></tr></tbody><tfoot><tr><th colspan=\"7\" class=\"today\" style=\"display: none;\">Today</th></tr><tr><th colspan=\"7\" class=\"clear\" style=\"display: none;\">Clear</th></tr></tfoot></table></div><div class=\"datepicker-years\" style=\"display: none;\"><table class=\"table-condensed\"><thead><tr><th class=\"prev\" style=\"visibility: visible;\">«</th><th colspan=\"5\" class=\"datepicker-switch\">2010-2019</th><th class=\"next\" style=\"visibility: visible;\">»</th></tr></thead><tbody><tr><td colspan=\"7\"><span class=\"year old\">2009</span><span class=\"year\">2010</span><span class=\"year\">2011</span><span class=\"year\">2012</span><span class=\"year\">2013</span><span class=\"year\">2014</span><span class=\"year\">2015</span><span class=\"year\">2016</span><span class=\"year\">2017</span><span class=\"year\">2018</span><span class=\"year\">2019</span><span class=\"year new\">2020</span></td></tr></tbody><tfoot><tr><th colspan=\"7\" class=\"today\" style=\"display: none;\">Today</th></tr><tr><th colspan=\"7\" class=\"clear\" style=\"display: none;\">Clear</th></tr></tfoot></table></div></div></div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                        <!-- END :Calendar -->          \n");
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
      out.write("              <div class=\"panel panel-default\">\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                  <h3 class=\"panel-title\">Latest Users</h3>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                  <table class=\"table table-striped table-hover\">\n");
      out.write("                      <tr>\n");
      out.write("                        <th>Name</th>\n");
      out.write("                        <th>Email</th>\n");
      out.write("                        <th>Joined</th>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <td>Jill Smith</td>\n");
      out.write("                        <td>jillsmith@gmail.com</td>\n");
      out.write("                        <td>Dec 12, 2016</td>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <td>Eve Jackson</td>\n");
      out.write("                        <td>ejackson@yahoo.com</td>\n");
      out.write("                        <td>Dec 13, 2016</td>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <td>John Doe</td>\n");
      out.write("                        <td>jdoe@gmail.com</td>\n");
      out.write("                        <td>Dec 13, 2016</td>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <td>Stephanie Landon</td>\n");
      out.write("                        <td>landon@yahoo.com</td>\n");
      out.write("                        <td>Dec 14, 2016</td>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <td>Mike Johnson</td>\n");
      out.write("                        <td>mjohnson@gmail.com</td>\n");
      out.write("                        <td>Dec 15, 2016</td>\n");
      out.write("                      </tr>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
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
