/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.29
 * Generated at: 2014-08-30 15:20:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class userSelectMul_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div id=\"usersModal\" class=\"hide\"><p style=\"padding: 5px;\">\r\n");
      out.write("\t<table id=\"usersTab\" class=\"list-table full-table\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th width=\"40px\" style=\"padding-left: 20px;\"><input id=\"u_all\" name=\"_user\" type=\"checkbox\" /></th>\r\n");
      out.write("\t\t\t<th width=\"350px\">用户名</th>\r\n");
      out.write("\t\t\t<th width=\"150px\">职位</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</p></div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tvar $_us_src;\r\n");
      out.write("\t\r\n");
      out.write("\tppmDialog(\"#usersModal\", \"选择用户\", {\r\n");
      out.write("        \"确认\": function() { selectUsers(); },\r\n");
      out.write("        \"清空\": function() { selectUsers(true); },\r\n");
      out.write("        \"取消\": function() { $(this).dialog(\"close\"); }\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#usersModal\").next().append(\"<span class='chx-container' style='float: left;'><input id='showStructure' type='checkbox' />组织架构</span>\");\r\n");
      out.write("\t\r\n");
      out.write("\tfunction loadUsersData($inp, $tr) {\r\n");
      out.write("\t\t$_us_src = $inp;\r\n");
      out.write("\t\tvar id = $inp.attr(\"val\"), id = id ? id : \"\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(!$(\"#showStructure\").is(\":checked\")) {\r\n");
      out.write("\t\t\t_remoteCall(\"user/getDepartUsers.do\", {}, function(data) {\r\n");
      out.write("\t\t\t\tvar html = \"\", $tab = $(\"#usersTab\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t// remove origin rows\r\n");
      out.write("\t\t\t\t$(\"tr:gt(0)\", $tab).remove();\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tfor(var i in data) {\r\n");
      out.write("\t\t\t\t\thtml += \"<tr id='\" + data[i].id + \"' onclick='clickUsers($(this));'>\";\r\n");
      out.write("\t\t\t\t\thtml += \"<td style='padding-left: 20px;'><input name='_user' type='checkbox' \" + (id.indexOf(data[i].id) >= 0 ? \"checked\" : \"\") + \" /></td>\";\r\n");
      out.write("\t\t\t\t\thtml += \"<td><div>\" + data[i].username + \"</div></td>\";\r\n");
      out.write("\t\t\t\t\thtml += \"<td><div>\" + data[i].positionName + \"</div></td>\";\r\n");
      out.write("\t\t\t\t\thtml += \"</tr>\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$tab.append(html);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t// init check box\r\n");
      out.write("\t\t\t\t$(\"#usersTab input\").not(\"#u_all, #showStructure\").iCheck({checkboxClass: \"icheckbox_square-blue\"});\r\n");
      out.write("\t\t\t}, true);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse {\r\n");
      out.write("\t\t\t_remoteCall(\"user/getStructure.do\", {parentId: $tr ? $tr.attr(\"id\") : \"\"}, function(data) {\r\n");
      out.write("\t\t\t\tvar html = \"\", $tab = $(\"#usersTab\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tfor(var i in data) {\r\n");
      out.write("\t\t\t\t\thtml += \"<tr id='\" + data[i].id + \"' parentId='\" + data[i].parentId + \"' \" + (data[i].isDepart != \"Y\" ? (\"onclick='clickUsers($(this));'\") : \"\") + \">\";\r\n");
      out.write("\t\t\t\t\thtml += \"<td style='padding-left: 20px;'>\";\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tif(data[i].isDepart != \"Y\") {\r\n");
      out.write("\t\t\t\t\t\thtml += \"<input name='_user' type='checkbox' \" + (id.indexOf(data[i].id) >= 0 ? \"checked\" : \"\") + \" />\";\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\thtml += \"</td>\";\r\n");
      out.write("\t\t\t\t\thtml += \"<td><div style='padding-left: \" + data[i].pad + \"px;\" + (data[i].isDepart == \"Y\" ? \"font-weight: bold;\" : \"\") + \"'><i onclick='toggleDepart($(this));' class='icon-plus tree-icon \" + (data[i].hasChild == \"Y\" ? \"\" : \"invisiable\") + \"'></i>\" + (data[i].isDepart == \"Y\" ? data[i].departName : data[i].username) + \"</div></td>\";\r\n");
      out.write("\t\t\t\t\thtml += \"<td><div>\" + (data[i].positionName ? data[i].positionName : \"\") + \"</div></td>\";\r\n");
      out.write("\t\t\t\t\thtml += \"</tr>\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar $trs = $(html);\r\n");
      out.write("\t\t\t\tif($tr) { $tr.after($trs); } else { $(\"tr:gt(0)\", $tab).remove(); $tab.append($trs); }\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t// init check box\r\n");
      out.write("\t\t\t\t$(\"#usersTab input\").not(\"#u_all, #showStructure\").iCheck({checkboxClass: \"icheckbox_square-blue\"});\r\n");
      out.write("\t\t\t}, true);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction toggleDepart($i) {\r\n");
      out.write("\t\tvar $tr = $i.closest(\"tr\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(!$tr.attr(\"hasLoad\")) {\r\n");
      out.write("\t\t\tloadUsersData($_us_src, $tr);\r\n");
      out.write("\t\t\t$tr.attr(\"hasLoad\", \"Y\");\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\t$(\"#usersTab tr[parentId='\" + $tr.attr(\"id\") + \"']\").toggle();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif($i.hasClass(\"icon-plus\")) { $i.removeClass(\"icon-plus\").addClass(\"icon-minus\"); } else { $i.removeClass(\"icon-minus\").addClass(\"icon-plus\"); }\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction clickUsers($tr) {\r\n");
      out.write("\t\t$(\"input\", $tr).iCheck(\"toggle\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction selectUsers(isClear) {\r\n");
      out.write("\t\tif(isClear) {\r\n");
      out.write("\t\t\t$_us_src.attr(\"val\", \"\").val(\"\");\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tvar $sel = $(\"#usersTab input:checkbox:checked\"), $tr, ids = [], names = [];\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$sel.each(function() {\r\n");
      out.write("\t\t\t\t$tr = $(this).closest(\"tr\");\r\n");
      out.write("\t\t\t\tif(!$tr.attr(\"id\"))  return true;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tids.push($tr.attr(\"id\"));\r\n");
      out.write("\t\t\t\tnames.push($(\"td:eq(1)\", $tr).text());\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$_us_src.attr(\"val\", ids.join(\",\")).val(names.join(\", \"));\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// if has filter, call search to refresh table\r\n");
      out.write("\t\tif(typeof(search) == \"function\")  search();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#usersModal\").dialog(\"close\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// init select all\r\n");
      out.write("\t$(\"#u_all\").iCheck({checkboxClass: \"icheckbox_square-blue\"}).on(\"ifChecked\", function() { $(\"#usersModal input\").not(\"#showStructure\").iCheck(\"check\"); }).on(\"ifUnchecked\", function() { $(\"#usersModal input\").not(\"#showStructure\").iCheck(\"uncheck\"); });\r\n");
      out.write("\t\r\n");
      out.write("\t// init show struture users\r\n");
      out.write("\t$(\"#showStructure\").iCheck({checkboxClass: \"icheckbox_square-blue\"}).on(\"ifChecked\", function() { loadUsersData($_us_src); }).on(\"ifUnchecked\", function() { loadUsersData($_us_src); });\r\n");
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
