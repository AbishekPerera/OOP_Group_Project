/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.64
 * Generated at: 2022-07-04 21:21:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.oop.model.*;
import com.oop.util.*;
import com.oop.servlet.*;
import java.util.*;

public final class favFundTransPro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1651691353975L));
    _jspx_dependants.put("jar:file:/D:/SLIIT/Y2%20S1/Z_Group/Workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/online_banking_system/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("com.oop.util");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("com.oop.model");
    _jspx_imports_packages.add("com.oop.servlet");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("\r\n");
      out.write("\r\n");

Customer cusDetails = (Customer) request.getSession().getAttribute("cus");
request.setAttribute("cusDetails", cusDetails);

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"styles/home.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"styles/homeNav.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"styles/dashboard.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"styles/form_Select.css\">\r\n");
      out.write("\r\n");
      out.write("<title>Favorite Transfer</title>\r\n");
      out.write("<!--  <style type=\"text/css\">\r\n");
      out.write(".gridform {\r\n");
      out.write("	display: grid;\r\n");
      out.write("	grid-template-columns: auto auto auto auto;\r\n");
      out.write("	grid-gap: 10px\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#forms {\r\n");
      out.write("	background-color: red;\r\n");
      out.write("	width: 300px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<header>\r\n");
      out.write("		<a href=\"index.jsp\" class=\"logo\"><img\r\n");
      out.write("			src=\"images/VishwaBankLogo.png\" alt=\"\"></a>\r\n");
      out.write("\r\n");
      out.write("		<ul>\r\n");
      out.write("			<li><a href=\"updateCustomerDetails.jsp\"><img\r\n");
      out.write("					src=\"images/homeNav/person-circle.svg\" alt=\"\"></a></li>\r\n");
      out.write("			<li><a href=\"#\"><img src=\"images/homeNav/bell.svg\" alt=\"\"></a></li>\r\n");
      out.write("			<li><a href=\"DeleteCustomerDetails.jsp\"><img\r\n");
      out.write("					src=\"images/homeNav/gear.svg\" alt=\"\"></a></li>\r\n");
      out.write("			<li><a href=\"index.jsp\"><img src=\"images/homeNav/exit.svg\"\r\n");
      out.write("					alt=\"\"></a></li>\r\n");
      out.write("\r\n");
      out.write("		</ul>\r\n");
      out.write("	</header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<input type=\"checkbox\" name=\"\" id=\"sidebarcheck\">\r\n");
      out.write("	<label for=\"sidebarcheck\"> <img src=\"images/homeNav/list.svg\"\r\n");
      out.write("		alt=\"\" id=\"btn\"> <img src=\"images/homeNav/x.svg\" alt=\"\" id=\"x\">\r\n");
      out.write("\r\n");
      out.write("	</label>\r\n");
      out.write("	<div class=\"sidebar\">\r\n");
      out.write("\r\n");
      out.write("		<div class=\"sideheader\">Vishwa Bank</div>\r\n");
      out.write("\r\n");
      out.write("		<ul>\r\n");
      out.write("			<li><a href=\"dashboard1.jsp\">Dashboard</a></li>\r\n");
      out.write("			<li><a href=\"accounts.jsp\">Accounts</a></li>\r\n");
      out.write("			<li><a href=\"fund_transfer.jsp\">Fund transfer</a></li>\r\n");
      out.write("			<li><a href=\"#\">Bill payments</a></li>\r\n");
      out.write("			<li><a href=\"#\">Inquiries</a></li>\r\n");
      out.write("			<li><a href=\"#\">Loans</a></li>\r\n");
      out.write("\r\n");
      out.write("		</ul>\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("	<section id=\"form_Selectid\">\r\n");
      out.write("		<div class=\"goback\">\r\n");
      out.write("			<button onclick=\"history.back()\">Go Back</button>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<div class=\"form_Select\">\r\n");
      out.write("			<div class=\"title\">Favorite Transaction</div>\r\n");
      out.write("			<div class=\"subtitle\">Faster and safe!</div>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"gridform\">\r\n");
      out.write("\r\n");
      out.write("				");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      boolean _jspx_th_c_005fforEach_005f0_reused = false;
      try {
        _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
        _jspx_th_c_005fforEach_005f0.setParent(null);
        // /favFundTransPro.jsp(94,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f0.setVar("ben");
        // /favFundTransPro.jsp(94,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/favFundTransPro.jsp(94,4) '${benDetails}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${benDetails}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
        int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
        try {
          int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
          if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("					<div id=forms>\r\n");
              out.write("\r\n");
              out.write("						<form action=\"favFundTransProFinal\" method=\"post\">\r\n");
              out.write("\r\n");
              out.write("							<h2>Account Number</h2>\r\n");
              out.write("							<input type=\"text\" name=\"acc_no\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ben.receiver_acc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("\"\r\n");
              out.write("								readonly><br>\r\n");
              out.write("\r\n");
              out.write("							<h2>Beneficiary Name</h2>\r\n");
              out.write("							<input type=\"text\" name=\"ben_name\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ben.receiver_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("\"\r\n");
              out.write("								readonly><br>\r\n");
              out.write("\r\n");
              out.write("							<h2>User Account</h2>\r\n");
              out.write("							<input type=\"text\" name=\"userid\"\r\n");
              out.write("								value=\"");
              out.print(cusDetails.getIdCustomer());
              out.write("\" readonly><br>\r\n");
              out.write("\r\n");
              out.write("							<h2>Favpayeeid</h2>\r\n");
              out.write("							<input type=\"text\" name=\"favpayeeid\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ben.favpayeeid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("\"\r\n");
              out.write("								readonly><br>\r\n");
              out.write("\r\n");
              out.write("							<button type=\"submit\" class=\"submit\">Send</button>\r\n");
              out.write("						</form>\r\n");
              out.write("					</div>\r\n");
              out.write("				");
              int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            return;
          }
        } catch (java.lang.Throwable _jspx_exception) {
          while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
            out = _jspx_page_context.popBody();
          _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
        } finally {
          _jspx_th_c_005fforEach_005f0.doFinally();
        }
        _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
        _jspx_th_c_005fforEach_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	</section>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
