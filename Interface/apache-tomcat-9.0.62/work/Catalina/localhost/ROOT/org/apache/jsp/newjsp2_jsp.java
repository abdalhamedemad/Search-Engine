/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-05-22 14:50:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp2_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("    <!--<link rel=\"stylesheet\" href=\"css/all.min.css\" />-->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <title>Search engine</title>\n");
      out.write("    <style>\n");
      out.write("    html{\n");
      out.write("    height: 100%;\n");
      out.write("  }\n");
      out.write("  body {\n");
      out.write("     /* height: 100%;*/\n");
      out.write("      box-sizing:border-box;\n");
      out.write("\n");
      out.write("  }\n");
      out.write("  main {\n");
      out.write("    /*height: 100% -50px;*/\n");
      out.write("    display: flex;\n");
      out.write("    padding: 50px 50px;\n");
      out.write("   /* align-items: center;*/\n");
      out.write("   /* align-content: center;*/\n");
      out.write("\n");
      out.write("  }\n");
      out.write("  .urls {\n");
      out.write("\n");
      out.write("    /* width: 350px; */\n");
      out.write("   /* margin-left: auto;\n");
      out.write("    margin-right: auto;*/\n");
      out.write("\n");
      out.write("    display: flex;\n");
      out.write("    /*align-items: center;*/\n");
      out.write("   /* align-content: center;*/\n");
      out.write("    flex-direction: column;\n");
      out.write("    /* margin-bottom: 120px; */\n");
      out.write("\n");
      out.write("}\n");
      out.write(".urls span {\n");
      out.write("  margin-bottom: 20px;\n");
      out.write("}\n");
      out.write(".urls span a {\n");
      out.write("  padding-bottom: 5px;\n");
      out.write("  display: block;\n");
      out.write("  font-size: larger;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("    body{\n");
      out.write("  	/* background: #151515; */\n");
      out.write("	height: 100%;\n");
      out.write("	position: absolute;\n");
      out.write("	text-align: center;\n");
      out.write("	width: 100%;\n");
      out.write("\n");
      out.write("    }\n");
      out.write("    footer{\n");
      out.write("       display: block;\n");
      out.write("   }\n");
      out.write("   ul{\n");
      out.write("       display: flex;\n");
      out.write("       flex-direction:row;\n");
      out.write("       align-content: space-between;\n");
      out.write("       align-items: center;\n");
      out.write("\n");
      out.write("   }\n");
      out.write("   ul li {\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("    padding: 10px;\n");
      out.write("    list-style: none;\n");
      out.write("\n");
      out.write("   }\n");
      out.write("   .urls span {\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("    display: flex;\n");
      out.write("    flex-direction: column;\n");
      out.write("    align-items: flex-start;\n");
      out.write("}\n");
      out.write("main div  span label {\n");
      out.write("  color: black;\n");
      out.write("    overflow: auto;\n");
      out.write("}\n");
      out.write(".autocomplete {\n");
      out.write("      position: relative;\n");
      out.write("      display: inline-block;\n");
      out.write("   }\n");
      out.write("   input {\n");
      out.write("      border: none;\n");
      out.write("      background-color: #f1f1f1;\n");
      out.write("      padding: 10px;\n");
      out.write("      font-size: 16px;\n");
      out.write("      border-radius: 4px;\n");
      out.write("   }\n");
      out.write("   input[type=\"text\"] {\n");
      out.write("      background-color: #e1f6fc;\n");
      out.write("      width: 100%;\n");
      out.write("   }\n");
      out.write("   input[type=\"submit\"] {\n");
      out.write("      background-color: DodgerBlue;\n");
      out.write("      color: #fff;\n");
      out.write("      cursor: pointer;\n");
      out.write("      margin-left: 15px;\n");
      out.write("   }\n");
      out.write("   .autocomplete-items {\n");
      out.write("      position: absolute;\n");
      out.write("      border-bottom: none;\n");
      out.write("      border-top: none;\n");
      out.write("      z-index: 99;\n");
      out.write("      top: 100%;\n");
      out.write("      left: 0;\n");
      out.write("      right: 0;\n");
      out.write("   }\n");
      out.write("   .autocomplete-items div {\n");
      out.write("      padding: 10px;\n");
      out.write("      cursor: pointer;\n");
      out.write("      border: 1px solid #8e26d4;\n");
      out.write("      border-bottom: 1px solid #d4d4d4;\n");
      out.write("      background: white;\n");
      out.write("    z-index: 200;\n");
      out.write("   }\n");
      out.write("   .autocomplete-items div:hover {\n");
      out.write("      background-color: #e9e9e9;\n");
      out.write("   }\n");
      out.write("   .autocomplete-active {\n");
      out.write("      background-color: rgb(30, 255, 169) !important;\n");
      out.write("      color: #ffffff;\n");
      out.write("   }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <nav>\n");
      out.write("\n");
      out.write("    </nav>\n");
      out.write("    <form autocomplete=\"off\" action=\"/getQuery\" method=\"get\">\n");
      out.write("        <div class=\"autocomplete\" style=\"width:300px;\">\n");
      out.write("        <input id=\"searchField\" type=\"text\" name=\"searchquery\" placeholder=\"What are you looking for?\" />\n");
      out.write("        </div>\n");
      out.write("        <input type=\"submit\" value=\"Search\" />\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("        <form action=\"/getQuery2\"method=\"get\">\n");
      out.write("          ");
      out.write("\n");
      out.write("        </form>\n");
      out.write("    <main>\n");
      out.write("\n");
      out.write("\n");
      out.write("           <div class=\"urls\">\n");
      out.write("        ");
      out.write("\n");
      out.write("<!--        {% for url in urls %}\n");
      out.write("        <span>\n");
      out.write("            <a href={{url.ref}} target=\"_blank\">{{url.title}}</a>\n");
      out.write("            <label>{{url.description}}\n");
      out.write("            </label>\n");
      out.write("        </span>\n");
      out.write("        {% endfor %}-->\n");
      out.write("         ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("           </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("   </main>\n");
      out.write("   <footer>\n");
      out.write("    <ul class=\"tag_cloud\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("       </ul>\n");
      out.write("   </footer>\n");
      out.write("   <script>\n");
      out.write("    function autocomplete(searchEle, arr) {\n");
      out.write("       var currentFocus;\n");
      out.write("       searchEle.addEventListener(\"input\", function(e) {\n");
      out.write("          var divCreate,\n");
      out.write("          b,\n");
      out.write("          i,\n");
      out.write("          fieldVal = this.value;\n");
      out.write("          closeAllLists();\n");
      out.write("          if (!fieldVal) {\n");
      out.write("             return false;\n");
      out.write("          }\n");
      out.write("          currentFocus = -1;\n");
      out.write("          divCreate = document.createElement(\"DIV\");\n");
      out.write("          divCreate.setAttribute(\"id\", this.id + \"autocomplete-list\");\n");
      out.write("          divCreate.setAttribute(\"class\", \"autocomplete-items\");\n");
      out.write("          this.parentNode.appendChild(divCreate);\n");
      out.write("          for (i = 0; i <arr.length; i++) {\n");
      out.write("             if ( arr[i].substr(0, fieldVal.length).toUpperCase() == fieldVal.toUpperCase() ) {\n");
      out.write("                b = document.createElement(\"DIV\");\n");
      out.write("                b.innerHTML = \"<strong>\" + arr[i].substr(0, fieldVal.length) + \"</strong>\";\n");
      out.write("                b.innerHTML += arr[i].substr(fieldVal.length);\n");
      out.write("                b.innerHTML += \"<input type='hidden' value='\" + arr[i] + \"'>\";\n");
      out.write("                b.addEventListener(\"click\", function(e) {\n");
      out.write("                   searchEle.value = this.getElementsByTagName(\"input\")[0].value;\n");
      out.write("                   closeAllLists();\n");
      out.write("                });\n");
      out.write("                divCreate.appendChild(b);\n");
      out.write("             }\n");
      out.write("          }\n");
      out.write("       });\n");
      out.write("       searchEle.addEventListener(\"keydown\", function(e) {\n");
      out.write("          var autocompleteList = document.getElementById(\n");
      out.write("             this.id + \"autocomplete-list\"\n");
      out.write("          );\n");
      out.write("          if (autocompleteList)\n");
      out.write("             autocompleteList = autocompleteList.getElementsByTagName(\"div\");\n");
      out.write("          if (e.keyCode == 40) {\n");
      out.write("             currentFocus++;\n");
      out.write("             addActive(autocompleteList);\n");
      out.write("          }\n");
      out.write("          else if (e.keyCode == 38) {\n");
      out.write("             //up\n");
      out.write("             currentFocus--;\n");
      out.write("             addActive(autocompleteList);\n");
      out.write("          }\n");
      out.write("          else if (e.keyCode == 13) {\n");
      out.write("             e.preventDefault();\n");
      out.write("             if (currentFocus > -1) {\n");
      out.write("                if (autocompleteList) autocompleteList[currentFocus].click();\n");
      out.write("             }\n");
      out.write("          }\n");
      out.write("       });\n");
      out.write("       function addActive(autocompleteList) {\n");
      out.write("          if (!autocompleteList) return false;\n");
      out.write("             removeActive(autocompleteList);\n");
      out.write("          if (currentFocus >= autocompleteList.length) currentFocus = 0;\n");
      out.write("          if (currentFocus < 0) currentFocus = autocompleteList.length - 1;\n");
      out.write("          autocompleteList[currentFocus].classList.add(\"autocomplete-active\");\n");
      out.write("       }\n");
      out.write("       function removeActive(autocompleteList) {\n");
      out.write("          for (var i = 0; i < autocompleteList.length; i++) {\n");
      out.write("             autocompleteList[i].classList.remove(\"autocomplete-active\");\n");
      out.write("          }\n");
      out.write("       }\n");
      out.write("       function closeAllLists(elmnt) {\n");
      out.write("          var autocompleteList = document.getElementsByClassName(\n");
      out.write("             \"autocomplete-items\"\n");
      out.write("          );\n");
      out.write("          for (var i = 0; i < autocompleteList.length; i++) {\n");
      out.write("             if (elmnt != autocompleteList[i] && elmnt != searchEle) {\n");
      out.write("                autocompleteList[i].parentNode.removeChild(autocompleteList[i]);\n");
      out.write("             }\n");
      out.write("          }\n");
      out.write("       }\n");
      out.write("       document.addEventListener(\"click\", function(e) {\n");
      out.write("          closeAllLists(e.target);\n");
      out.write("       });\n");
      out.write("    }\n");
      out.write("    // var animals = [\"giraffe\",\"tiger\", \"lion\", \"dog\",\"cow\",\"bull\",\"cat\",\"cheetah\"];\n");
      out.write(" // var fs = require('fs');\n");
      out.write(" var animals = [];\n");
      out.write("  let i=0;\n");
      out.write(" ");
      if (_jspx_meth_c_005fforEach_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    autocomplete(document.getElementById(\"searchField\"), animals);\n");
      out.write(" </script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
      // /newjsp2.jsp(191,9) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/newjsp2.jsp(191,9) '${x2}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${x2}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /newjsp2.jsp(191,9) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("url");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("    <span>\n");
            out.write("          <a href=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url.getname()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write(" target=\"_blank\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url.gettitle()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</a>\n");
            out.write("            <label>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url.getdescription()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\n");
            out.write("            </label>\n");
            out.write("    </span>\n");
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

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f1_reused = false;
    try {
      _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f1.setParent(null);
      // /newjsp2.jsp(207,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/newjsp2.jsp(207,8) '${ss}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${ss}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /newjsp2.jsp(207,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setVar("ss1");
      int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
        if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("            <li><a href=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ss1.url5}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" title=\"\" >");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ss1.pagenum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</a></li>\n");
            out.write("\n");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
      _jspx_th_c_005fforEach_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f2_reused = false;
    try {
      _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f2.setParent(null);
      // /newjsp2.jsp(304,1) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f2.setItems(new org.apache.jasper.el.JspValueExpression("/newjsp2.jsp(304,1) '${ss2}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${ss2}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /newjsp2.jsp(304,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f2.setVar("ss3");
      int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
        if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("     // <li><a href=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ss1.url5}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" title=\"\" >");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ss1.pagenum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</a></li>\n");
            out.write("\n");
            out.write(" animals.push(\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ss3}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\");\n");
            out.write("\n");
            out.write(" ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f2.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f2[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f2.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f2.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
      _jspx_th_c_005fforEach_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f2_reused);
    }
    return false;
  }
}
