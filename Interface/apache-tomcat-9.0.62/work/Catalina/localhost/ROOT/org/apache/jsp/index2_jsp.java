/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-05-21 23:59:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/medoa/Desktop/apache-tomcat-9.0.62-windows-x64/apache-tomcat-9.0.62/lib/javax.servlet.jsp.jstl-1.2.1.jar!/META-INF/c.tld", Long.valueOf(1323251178000L));
    _jspx_dependants.put("file:/C:/Users/medoa/Desktop/apache-tomcat-9.0.62-windows-x64/apache-tomcat-9.0.62/lib/javax.servlet.jsp.jstl-1.2.1.jar", Long.valueOf(1381935944000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("<style>\r\n");
      out.write("   * {\r\n");
      out.write("      box-sizing: border-box;\r\n");
      out.write("   }\r\n");
      out.write("   body {\r\n");
      out.write("      margin: 10px;\r\n");
      out.write("      padding: 0px;\r\n");
      out.write("      font-family: \"Segoe UI\", Tahoma, Geneva, Verdana, sans-serif;\r\n");
      out.write("   }\r\n");
      out.write("   .autocomplete {\r\n");
      out.write("      position: relative;\r\n");
      out.write("      display: inline-block;\r\n");
      out.write("   }\r\n");
      out.write("   input {\r\n");
      out.write("      border: none;\r\n");
      out.write("      background-color: #f1f1f1;\r\n");
      out.write("      padding: 10px;\r\n");
      out.write("      font-size: 16px;\r\n");
      out.write("      border-radius: 4px;\r\n");
      out.write("   }\r\n");
      out.write("   input[type=\"text\"] {\r\n");
      out.write("      background-color: #e1f6fc;\r\n");
      out.write("      width: 100%;\r\n");
      out.write("   }\r\n");
      out.write("   input[type=\"submit\"] {\r\n");
      out.write("      background-color: DodgerBlue;\r\n");
      out.write("      color: #fff;\r\n");
      out.write("      cursor: pointer;\r\n");
      out.write("   }\r\n");
      out.write("   .autocomplete-items {\r\n");
      out.write("      position: absolute;\r\n");
      out.write("      border-bottom: none;\r\n");
      out.write("      border-top: none;\r\n");
      out.write("      z-index: 99;\r\n");
      out.write("      top: 100%;\r\n");
      out.write("      left: 0;\r\n");
      out.write("      right: 0;\r\n");
      out.write("   }\r\n");
      out.write("   .autocomplete-items div {\r\n");
      out.write("      padding: 10px;\r\n");
      out.write("      cursor: pointer;\r\n");
      out.write("      border: 1px solid #8e26d4;\r\n");
      out.write("      border-bottom: 1px solid #d4d4d4;\r\n");
      out.write("   }\r\n");
      out.write("   .autocomplete-items div:hover {\r\n");
      out.write("      background-color: #e9e9e9;\r\n");
      out.write("   }\r\n");
      out.write("   .autocomplete-active {\r\n");
      out.write("      background-color: rgb(30, 255, 169) !important;\r\n");
      out.write("      color: #ffffff;\r\n");
      out.write("   }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h1>Autocomplete Example</h1>\r\n");
      out.write("<form autocomplete=\"off\">\r\n");
      out.write("<div class=\"autocomplete\" style=\"width:300px;\">\r\n");
      out.write("<input id=\"searchField\" type=\"text\" name=\"animal\" placeholder=\"Animals\" />\r\n");
      out.write("</div>\r\n");
      out.write("<input type=\"submit\" />\r\n");
      out.write("</form>\r\n");
      out.write("<script>\r\n");
      out.write("   function autocomplete(searchEle, arr) {\r\n");
      out.write("      var currentFocus;\r\n");
      out.write("      searchEle.addEventListener(\"input\", function(e) {\r\n");
      out.write("         var divCreate,\r\n");
      out.write("         b,\r\n");
      out.write("         i,\r\n");
      out.write("         fieldVal = this.value;\r\n");
      out.write("         closeAllLists();\r\n");
      out.write("         if (!fieldVal) {\r\n");
      out.write("            return false;\r\n");
      out.write("         }\r\n");
      out.write("         currentFocus = -1;\r\n");
      out.write("         divCreate = document.createElement(\"DIV\");\r\n");
      out.write("         divCreate.setAttribute(\"id\", this.id + \"autocomplete-list\");\r\n");
      out.write("         divCreate.setAttribute(\"class\", \"autocomplete-items\");\r\n");
      out.write("         this.parentNode.appendChild(divCreate);\r\n");
      out.write("         for (i = 0; i <arr.length; i++) {\r\n");
      out.write("            if ( arr[i].substr(0, fieldVal.length).toUpperCase() == fieldVal.toUpperCase() ) {\r\n");
      out.write("               b = document.createElement(\"DIV\");\r\n");
      out.write("               b.innerHTML = \"<strong>\" + arr[i].substr(0, fieldVal.length) + \"</strong>\";\r\n");
      out.write("               b.innerHTML += arr[i].substr(fieldVal.length);\r\n");
      out.write("               b.innerHTML += \"<input type='hidden' value='\" + arr[i] + \"'>\";\r\n");
      out.write("               b.addEventListener(\"click\", function(e) {\r\n");
      out.write("                  searchEle.value = this.getElementsByTagName(\"input\")[0].value;\r\n");
      out.write("                  closeAllLists();\r\n");
      out.write("               });\r\n");
      out.write("               divCreate.appendChild(b);\r\n");
      out.write("            }\r\n");
      out.write("         }\r\n");
      out.write("      });\r\n");
      out.write("      searchEle.addEventListener(\"keydown\", function(e) {\r\n");
      out.write("         var autocompleteList = document.getElementById(\r\n");
      out.write("            this.id + \"autocomplete-list\"\r\n");
      out.write("         );\r\n");
      out.write("         if (autocompleteList)\r\n");
      out.write("            autocompleteList = autocompleteList.getElementsByTagName(\"div\");\r\n");
      out.write("         if (e.keyCode == 40) {\r\n");
      out.write("            currentFocus++;\r\n");
      out.write("            addActive(autocompleteList);\r\n");
      out.write("         }\r\n");
      out.write("         else if (e.keyCode == 38) {\r\n");
      out.write("            //up\r\n");
      out.write("            currentFocus--;\r\n");
      out.write("            addActive(autocompleteList);\r\n");
      out.write("         }\r\n");
      out.write("         else if (e.keyCode == 13) {\r\n");
      out.write("            e.preventDefault();\r\n");
      out.write("            if (currentFocus > -1) {\r\n");
      out.write("               if (autocompleteList) autocompleteList[currentFocus].click();\r\n");
      out.write("            }\r\n");
      out.write("         }\r\n");
      out.write("      });\r\n");
      out.write("      function addActive(autocompleteList) {\r\n");
      out.write("         if (!autocompleteList) return false;\r\n");
      out.write("            removeActive(autocompleteList);\r\n");
      out.write("         if (currentFocus >= autocompleteList.length) currentFocus = 0;\r\n");
      out.write("         if (currentFocus < 0) currentFocus = autocompleteList.length - 1;\r\n");
      out.write("         autocompleteList[currentFocus].classList.add(\"autocomplete-active\");\r\n");
      out.write("      }\r\n");
      out.write("      function removeActive(autocompleteList) {\r\n");
      out.write("         for (var i = 0; i < autocompleteList.length; i++) {\r\n");
      out.write("            autocompleteList[i].classList.remove(\"autocomplete-active\");\r\n");
      out.write("         }\r\n");
      out.write("      }\r\n");
      out.write("      function closeAllLists(elmnt) {\r\n");
      out.write("         var autocompleteList = document.getElementsByClassName(\r\n");
      out.write("            \"autocomplete-items\"\r\n");
      out.write("         );\r\n");
      out.write("         for (var i = 0; i < autocompleteList.length; i++) {\r\n");
      out.write("            if (elmnt != autocompleteList[i] && elmnt != searchEle) {\r\n");
      out.write("               autocompleteList[i].parentNode.removeChild(autocompleteList[i]);\r\n");
      out.write("            }\r\n");
      out.write("         }\r\n");
      out.write("      }\r\n");
      out.write("      document.addEventListener(\"click\", function(e) {\r\n");
      out.write("         closeAllLists(e.target);\r\n");
      out.write("      });\r\n");
      out.write("   }\r\n");
      out.write("   // var animals = [\"giraffe\",\"tiger\", \"lion\", \"dog\",\"cow\",\"bull\",\"cat\",\"cheetah\"];\r\n");
      out.write("// var fs = require('fs');\r\n");
      out.write("\r\n");
      out.write("var animals = new Array();\r\n");
      out.write("var x=0;\r\n");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   autocomplete(document.getElementById(\"searchField\"), animals);\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /index2.jsp(155,0) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/index2.jsp(155,0) '${ss}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${ss}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /index2.jsp(155,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("ss1");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\r\n");
            out.write("  animals[x] =\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ss1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\";\r\n");
            out.write("  x++;\r\n");
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
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}