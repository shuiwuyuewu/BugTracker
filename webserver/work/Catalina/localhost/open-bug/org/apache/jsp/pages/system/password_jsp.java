/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.29
 * Generated at: 2014-08-30 15:21:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages.system;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class password_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"wrapper\">\r\n");
      out.write("\t\t<div id=\"btnDiv\">\r\n");
      out.write("\t\t\t<button class=\"button button-rounded button-flat-primary\" onclick=\"modifyPwd();\">确认修改</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<table class=\"edit-table\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"left-td\" width=\"80px\">原始密码</td>\r\n");
      out.write("\t\t\t\t<td><input id=\"pwd1\" type=\"password\" class=\"input-text input-require\" /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"left-td\">新密码</td>\r\n");
      out.write("\t\t\t\t<td><input id=\"pwd2\" type=\"password\" class=\"input-text input-require\" /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"left-td\">确认密码</td>\r\n");
      out.write("\t\t\t\t<td><input id=\"pwd3\" type=\"password\" class=\"input-text input-require\" /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t<div id=\"dialog-ok\" class=\"hide\" title=\"修改密码\">\r\n");
      out.write("\t\t<p>修改密码成功！</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction modifyPwd() {\r\n");
      out.write("\t\t\tif(!checkForm())  return;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif($(\"#pwd2\").val() != $(\"#pwd3\").val()) {\r\n");
      out.write("\t\t\t\t$(\"#pwd3\").parent().append(\"<div class='outline validate'>新密码与确认密码不匹配</div>\");\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t_remoteCall(\"user/unlock.do\", {password: $(\"#pwd1\").val()}, function(data) {\r\n");
      out.write("\t\t\t\tif(data == \"Y\") {\r\n");
      out.write("\t\t\t\t\t_remoteCall(\"user/changePwd.do\", {password: $(\"#pwd2\").val()}, function() {\r\n");
      out.write("\t\t\t\t\t\t$( \"#dialog-ok\" ).dialog({\r\n");
      out.write("\t\t\t\t\t\t\tresizable: false,\r\n");
      out.write("\t\t\t\t\t\t    height: 200,\r\n");
      out.write("\t\t\t\t\t\t    modal: true,\r\n");
      out.write("\t\t\t\t\t\t    buttons: {\r\n");
      out.write("\t\t\t\t\t\t        \"确定\": function() {\r\n");
      out.write("\t\t\t\t\t\t        \t$(this).dialog(\"close\");\r\n");
      out.write("\t\t\t\t\t\t        \ttop.location.href = top.basePath + \"user/logout.do\";\r\n");
      out.write("\t\t\t\t\t\t        }\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t$(\"#pwd1, #pwd2, #pwd3\").val(\"\");\r\n");
      out.write("\t\t\t\t\t});\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t$(\"#pwd1\").parent().append(\"<div class='outline validate'>原始密码错误</div>\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
