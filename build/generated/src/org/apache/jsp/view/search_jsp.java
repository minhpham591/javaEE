package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.mess;
import java.util.ArrayList;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/CSS.css\">\n");
      out.write("        <title>SEARCH MESSENGER BETA</title>\n");
      out.write("         ");
 ArrayList<mess> messs = 
            (ArrayList<mess>) request.getAttribute("data"); 
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wrap\">\n");
      out.write("   <div class=\"search\">\n");
      out.write("      <form method=\"POST\" action=\"\">\n");
      out.write("          <input type=\"text\" class=\"searchTerm\" placeholder=\"Username\"></br>\n");
      out.write("          <input type=\"date\" class=\"searchTerm\" placeholder=\"From\"></br>\n");
      out.write("          <input type=\"date\" class=\"searchTerm\" placeholder=\"To\"></br>\n");
      out.write("      <button type=\"submit\" class=\"searchButton\">SEARCH\n");
      out.write("      </button>\n");
      out.write("      </form>\n");
      out.write("       <section> \n");
      out.write("        <h1>SEARCH</h1>\n");
      out.write("        <div class=\"tbl-header\" >\n");
      out.write("            <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <th>USERNAME</th>\n");
      out.write("                <th>MESSENGER</th>\n");
      out.write("                <th>TIME</th>\n");
      out.write("            </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"tbl-content\">\n");
      out.write("        <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n");
      out.write("            ");
for(mess h : messs) {
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(h.getUsername());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(h.getMess());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(h.getDate());
      out.write(" &nbsp; ");
      out.print(h.getTime());
      out.write(" </td>\n");
      out.write("            </tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </table> \n");
      out.write("        </div>\n");
      out.write("         <a href=\"../view/all\">GO CHAT</a>\n");
      out.write("        <form method=\"POST\" action=\"logout\">\n");
      out.write("            <button> LOGOUT</button>\n");
      out.write("        </form>\n");
      out.write("        </section>\n");
      out.write("   </div>\n");
      out.write("</div>\n");
      out.write("    </body>\n");
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
