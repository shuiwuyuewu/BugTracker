/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.29
 * Generated at: 2014-08-30 15:31:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages.system;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class clean_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/tags/date.tag", Long.valueOf(1377948982280L));
    _jspx_dependants.put("/WEB-INF/tags/time.tag", Long.valueOf(1377948982285L));
    _jspx_dependants.put("/WEB-INF/tags/user.tag", Long.valueOf(1377948982287L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head></head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"wrapper\">\r\n");
      out.write("\t\t<div id=\"btnDiv\">\r\n");
      out.write("\t\t\t<button onclick=\"clean();\" class=\"button button-rounded button-flat-primary\">开始清理</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"alert alert-info\">\r\n");
      out.write("\t\t\t永久删除已关闭项目的所有数据，包括缺陷，操作记录，经验，附件等。\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"listDiv\">\r\n");
      out.write("\t\t\t<table class=\"list-table\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th width=\"60px\">选择</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"350px\">名称</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"150px\">项目经理</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"120px\">起始日期</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"120px\">结束日期</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"150px\">创建时间</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(\"input:checkbox\").iCheck({checkboxClass: \"icheckbox_square-blue\"});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction clean() {\r\n");
      out.write("\t\t\tvar $chxs = $(\"table.list-table input:checkbox:checked\"), ids = [];\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif($chxs.size() == 0) {\r\n");
      out.write("\t\t\t\tppmAlert(\"清理数据\", \"请选择要清理的主项目。\");  return;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tppmConfirm(\"清理数据\", \"确定要彻底删除选中的项目及该项目下的所有缺陷，操作记录，经验，附件么？此操作为不可回滚式彻底删除，请认真考虑后再执行此操作！\", function() {\r\n");
      out.write("\t\t\t\t$chxs.each(function() {\r\n");
      out.write("\t\t\t\t\tids.push($(this).closest(\"tr\").attr(\"id\"));\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t_remoteCall(\"system/cleanData.do\", {projectIds: ids.join(\",\")}, function() {\r\n");
      out.write("\t\t\t\t\tppmAlert(\"清理数据\", \"清理系统数据完成。\", function() { reloadPage(); });\r\n");
      out.write("\t\t\t\t});\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /pages/system/clean.jsp(30,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/pages/system/clean.jsp(30,4) '${projects}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${projects}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /pages/system/clean.jsp(30,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("p");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<tr id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t<td align=\"center\"><input type=\"checkbox\" /></td>\r\n");
          out.write("\t\t\t\t\t<td><div>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</div></td>\r\n");
          out.write("\t\t\t\t\t<td><div>");
          if (_jspx_meth_cloud_005fuser_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("</div></td>\r\n");
          out.write("\t\t\t\t\t<td><div>");
          if (_jspx_meth_cloud_005fdate_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("</div></td>\r\n");
          out.write("\t\t\t\t\t<td><div>");
          if (_jspx_meth_cloud_005fdate_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("</div></td>\r\n");
          out.write("\t\t\t\t\t<td><div>");
          if (_jspx_meth_cloud_005ftime_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("</div></td>\r\n");
          out.write("\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_cloud_005fuser_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  cloud:user
    org.apache.jsp.tag.webuser_tag _jspx_th_cloud_005fuser_005f0 = (new org.apache.jsp.tag.webuser_tag());
    _jsp_instancemanager.newInstance(_jspx_th_cloud_005fuser_005f0);
    _jspx_th_cloud_005fuser_005f0.setJspContext(_jspx_page_context);
    _jspx_th_cloud_005fuser_005f0.setParent(_jspx_th_c_005fforEach_005f0);
    // /pages/system/clean.jsp(34,14) name = userId type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_cloud_005fuser_005f0.setUserId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.managerId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    _jspx_th_cloud_005fuser_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_cloud_005fuser_005f0);
    return false;
  }

  private boolean _jspx_meth_cloud_005fdate_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  cloud:date
    org.apache.jsp.tag.webdate_tag _jspx_th_cloud_005fdate_005f0 = (new org.apache.jsp.tag.webdate_tag());
    _jsp_instancemanager.newInstance(_jspx_th_cloud_005fdate_005f0);
    _jspx_th_cloud_005fdate_005f0.setJspContext(_jspx_page_context);
    _jspx_th_cloud_005fdate_005f0.setParent(_jspx_th_c_005fforEach_005f0);
    // /pages/system/clean.jsp(35,14) name = date type = java.util.Date reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_cloud_005fdate_005f0.setDate((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.startDate}", java.util.Date.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    _jspx_th_cloud_005fdate_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_cloud_005fdate_005f0);
    return false;
  }

  private boolean _jspx_meth_cloud_005fdate_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  cloud:date
    org.apache.jsp.tag.webdate_tag _jspx_th_cloud_005fdate_005f1 = (new org.apache.jsp.tag.webdate_tag());
    _jsp_instancemanager.newInstance(_jspx_th_cloud_005fdate_005f1);
    _jspx_th_cloud_005fdate_005f1.setJspContext(_jspx_page_context);
    _jspx_th_cloud_005fdate_005f1.setParent(_jspx_th_c_005fforEach_005f0);
    // /pages/system/clean.jsp(36,14) name = date type = java.util.Date reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_cloud_005fdate_005f1.setDate((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.endDate}", java.util.Date.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    _jspx_th_cloud_005fdate_005f1.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_cloud_005fdate_005f1);
    return false;
  }

  private boolean _jspx_meth_cloud_005ftime_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  cloud:time
    org.apache.jsp.tag.webtime_tag _jspx_th_cloud_005ftime_005f0 = (new org.apache.jsp.tag.webtime_tag());
    _jsp_instancemanager.newInstance(_jspx_th_cloud_005ftime_005f0);
    _jspx_th_cloud_005ftime_005f0.setJspContext(_jspx_page_context);
    _jspx_th_cloud_005ftime_005f0.setParent(_jspx_th_c_005fforEach_005f0);
    // /pages/system/clean.jsp(37,14) name = date type = java.util.Date reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_cloud_005ftime_005f0.setDate((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.createTime}", java.util.Date.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    _jspx_th_cloud_005ftime_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_cloud_005ftime_005f0);
    return false;
  }
}
