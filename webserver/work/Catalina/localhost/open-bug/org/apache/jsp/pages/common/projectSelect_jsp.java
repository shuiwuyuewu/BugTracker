/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.29
 * Generated at: 2014-08-30 15:21:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class projectSelect_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div id=\"projectModal\" class=\"hide\"><p style=\"padding: 5px;\">\r\n");
      out.write("\t<table id=\"projectTab\" class=\"list-table full-table\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th width=\"80px\"></th>\r\n");
      out.write("\t\t\t<th width=\"310px\">项目名称</th>\r\n");
      out.write("\t\t\t<th width=\"150px\">项目经理</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</p></div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tvar $_p_src;\r\n");
      out.write("\t\r\n");
      out.write("\tppmDialog(\"#projectModal\", \"选择项目\", {\r\n");
      out.write("        \"确认\": function() { selectProject(); },\r\n");
      out.write("        \"清空\": function() { selectProject(true); },\r\n");
      out.write("        \"取消\": function() { $(this).dialog(\"close\"); }\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\tfunction loadProjectData($inp) {\r\n");
      out.write("\t\t$_p_src = $inp;\r\n");
      out.write("\t\tvar id = $inp.attr(\"val\"), id = id ? id : \"\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t_remoteCall(\"project/getProjects.do\", null, function(data) {\r\n");
      out.write("\t\t\tvar d = eval(\"(\" + data + \")\"), info = d.projects, html = \"\", $tab = $(\"#projectTab\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// remove origin rows\r\n");
      out.write("\t\t\t$(\"tr:gt(0)\", $tab).remove();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfor(var i in info) {\r\n");
      out.write("\t\t\t\thtml += \"<tr id='\" + info[i].id + \"' onclick='clickProject($(this));' ondblclick='selectProject();'>\";\r\n");
      out.write("\t\t\t\thtml += \"<td class='sn'><input name='_user' type='radio' \" + (id == info[i].id ? \"checked\" : \"\") + \" /></td>\";\r\n");
      out.write("\t\t\t\thtml += \"<td><div>\" + info[i].name + \"</div></td>\";\r\n");
      out.write("\t\t\t\thtml += \"<td><div>\" + info[i].manager + \"</div></td>\";\r\n");
      out.write("\t\t\t\thtml += \"</tr>\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$tab.append(html);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// init radio box\r\n");
      out.write("\t\t\t$(\"#projectTab input\").iCheck({radioClass: \"iradio_square-blue\"});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction clickProject($tr) {\r\n");
      out.write("\t\t$(\"input\", $tr).iCheck(\"check\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction selectProject(isClear) {\r\n");
      out.write("\t\tif(isClear) {\r\n");
      out.write("\t\t\t$_p_src.attr(\"val\", \"\").val(\"\");\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tvar $sel = $(\"#projectModal input:radio:checked\").closest(\"tr\");\r\n");
      out.write("\t\t\t$_p_src.attr(\"val\", $sel.attr(\"id\")).val($(\"td:eq(1)\", $sel).text());\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// if has filter, call search to refresh table\r\n");
      out.write("\t\tif(typeof(search) == \"function\")  search();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#projectModal\").dialog(\"close\");\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
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
