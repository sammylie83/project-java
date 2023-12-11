package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            a{\n");
      out.write("                font: bold 13px Verdana;\n");
      out.write("                padding: 2px;\n");
      out.write("                padding-left: 4px;\n");
      out.write("                display: block;\n");
      out.write("                width: 100px;\n");
      out.write("                color: black;\n");
      out.write("                text-decoration: underline;\n");
      out.write("            }\n");
      out.write("            a:hover{\n");
      out.write("\n");
      out.write("                color: black;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" >\n");
      out.write("            function validate()\n");
      out.write("            {\n");
      out.write("                if(document.frm.username.value==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Please enter username\");\n");
      out.write("                    document.frm.username.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if(document.frm.password.value==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Please enter username\");\n");
      out.write("                    document.frm.password.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("            function trim(stringToTrim) {\n");
      out.write("                return stringToTrim.replace(/^\\s+|\\s+$/g,\"\");\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");


                    String errmsg = "";
                    if (request.getParameter("errmsg") != null && request.getParameter("errmsg") != "") {
                        errmsg = "Invalid username and password";
                    }else{
                        errmsg=" ";
                        }
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form name=\"frm\" onSubmit=\"return validate();\" action=\"checkLogin.jsp\" method=\"post\">\n");
      out.write("            <table border=\"0\" width=\"400px\" align=\"center\" bgcolor=\"#CDFFFF\">\n");
      out.write("                <tr><td colspan=2 align=\"center\" style=\"color:red;\">");
      out.print(errmsg);
      out.write("</td></tr>\n");
      out.write("                <tr><td colspan=2 align=\"center\">&nbsp;</td></tr>\n");
      out.write("                <tr><td colspan=2 align=\"center\"><b>User Login</b></td></tr>\n");
      out.write("                <tr><td>Username : </td><td><input type=\"text\" name=\"txtUsername\" id=\"username\"></td></tr>\n");
      out.write("                <tr><td>Password : </td><td><input type=\"password\" name=\"txtPassword\" id=\"password\"></td></tr>\n");
      out.write("                <tr><td colspan=2 align=\"center\">\n");
      out.write("                        <!--\n");
      out.write("                                       <tr><td colspan=2 align=\"center\"><input type=\"button\" name=\"submit\" value=\"Submit\" onclick=\"login();\"></td></tr>\n");
      out.write("\n");
      out.write("                                             <a href=\"user_register.jsp\">New User</a>-->\n");
      out.write("                        <input type=\"submit\" name=\"sSubmit\" value=\"Submit\" />\n");
      out.write("                    </td></tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
