/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.64
 * Generated at: 2022-07-04 21:19:30 UTC
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

public final class DeleteCustomerDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"styles/home.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"styles/homeNav.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"styles/dashboard.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"styles/deleteCustomerDetails.css\">\r\n");
      out.write("<title>Delete User Profile</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<header>\r\n");
      out.write("		<a href=\"index.jsp\" class=\"logo\"><img\r\n");
      out.write("			src=\"images/VishwaBankLogo.png\" alt=\"\"></a>\r\n");
      out.write("\r\n");
      out.write("		<ul>\r\n");
      out.write("			<li><a href=\"#\"><img src=\"images/homeNav/person-circle.svg\"\r\n");
      out.write("					alt=\"\"></a></li>\r\n");
      out.write("			<li><a href=\"#\"><img src=\"images/homeNav/bell.svg\" alt=\"\"></a></li>\r\n");
      out.write("			<li><a href=\"#\"><img src=\"images/homeNav/gear.svg\" alt=\"\"></a></li>\r\n");
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
      out.write("\r\n");
      out.write("	<!-- content -->\r\n");
      out.write("\r\n");
      out.write("	<section\r\n");
      out.write("		style=\"background-image: url(images/home/homebg.jpg); height: 800px;\">\r\n");
      out.write("		<div class=\"goback\">\r\n");
      out.write("			<button onclick=\"history.back()\">Go Back</button>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"title\">\r\n");
      out.write("			<h1>Account Details</h1>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<form action=\"DeleteCustomer\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("			<h2>User Name</h2>\r\n");
      out.write("			<input type=\"text\" name=\"username\"\r\n");
      out.write("				value=\"");
      out.print(cusDetails.getUserName());
      out.write("\" readonly><br>\r\n");
      out.write("			<h2>Customer ID</h2>\r\n");
      out.write("			<input type=\"text\" name=\"cusid\"\r\n");
      out.write("				value=\"");
      out.print(cusDetails.getIdCustomer());
      out.write("\" readonly><br>\r\n");
      out.write("			<h3>Name</h3>\r\n");
      out.write("			<input type=\"text\" name=\"name\" value=\"");
      out.print(cusDetails.getName());
      out.write("\"\r\n");
      out.write("				readonly><br>\r\n");
      out.write("			<h3>Email</h3>\r\n");
      out.write("			<input type=\"text\" name=\"email\" value=\"");
      out.print(cusDetails.getEmail());
      out.write("\"\r\n");
      out.write("				readonly><br>\r\n");
      out.write("			<h3>Phone Number</h3>\r\n");
      out.write("			<input type=\"text\" name=\"phone\" value=\"");
      out.print(cusDetails.getPhone());
      out.write("\"\r\n");
      out.write("				readonly><br>\r\n");
      out.write("			<h2>NIC</h2>\r\n");
      out.write("			<input type=\"text\" name=\"nic\" value=\"");
      out.print(cusDetails.getNic());
      out.write("\"\r\n");
      out.write("				readonly><br>\r\n");
      out.write("			<h3>Password</h3>\r\n");
      out.write("			<input type=\"password\" name=\"password\"\r\n");
      out.write("				value=\"");
      out.print(cusDetails.getPassword());
      out.write("\" readonly><br> <input\r\n");
      out.write("				type=\"submit\" name=\"submit\" value=\"Delete My Account\">\r\n");
      out.write("\r\n");
      out.write("		</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	</section>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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