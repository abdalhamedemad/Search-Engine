/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-05-21 23:26:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class New_0020Text_0020Document_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("   <link rel=\"stylesheet\" href=\"css/style.css\"/>\r\n");
      out.write("    <!--<link rel=\"stylesheet\" href=\"css/all.min.css\" />-->\r\n");
      out.write("    <!-- <link rel=\"stylesheet\" href=\"{{ url_for ( 'static' , filename='style.css')}}\" /> -->\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"css/all.min.css\">\r\n");
      out.write("    <title>Search engine</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        body{\r\n");
      out.write("            display: contents;\r\n");
      out.write("        }\r\n");
      out.write("@import url(https://fonts.googleapis.com/css?family=Cabin:400);\r\n");
      out.write("\r\n");
      out.write(".webdesigntuts-workshop {\r\n");
      out.write("	background: #151515;\r\n");
      out.write("	height: 100%;\r\n");
      out.write("	position: absolute;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".webdesigntuts-workshop:before,\r\n");
      out.write(".webdesigntuts-workshop:after {\r\n");
      out.write("	content: '';\r\n");
      out.write("	display: block;	\r\n");
      out.write("	height: 1px;\r\n");
      out.write("	left: 50%;\r\n");
      out.write("	margin: 0 0 0 -400px;\r\n");
      out.write("	position: absolute;\r\n");
      out.write("	width: 800px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".webdesigntuts-workshop:before {\r\n");
      out.write("	background: #444;\r\n");
      out.write("	background: linear-gradient(left, #151515, #444, #151515);\r\n");
      out.write("	top: 192px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".webdesigntuts-workshop:after {\r\n");
      out.write("	background: #000;\r\n");
      out.write("	background: linear-gradient(left, #151515, #000, #151515);	\r\n");
      out.write("	top: 191px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".webdesigntuts-workshop form {\r\n");
      out.write("	background: #111;\r\n");
      out.write("	background: linear-gradient(#1b1b1b, #111);\r\n");
      out.write("	border: 1px solid #000;\r\n");
      out.write("	border-radius: 5px;\r\n");
      out.write("	box-shadow: inset 0 0 0 1px #272727;\r\n");
      out.write("	display: inline-block;\r\n");
      out.write("	font-size: 0px;\r\n");
      out.write("	margin: 150px auto 0;\r\n");
      out.write("	padding: 20px;\r\n");
      out.write("	position: relative;\r\n");
      out.write("	z-index: 1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".webdesigntuts-workshop input {\r\n");
      out.write("	background: #222;	\r\n");
      out.write("	background: linear-gradient(#333, #222);	\r\n");
      out.write("	border: 1px solid #444;\r\n");
      out.write("	border-radius: 5px 0 0 5px;\r\n");
      out.write("	box-shadow: 0 2px 0 #000;\r\n");
      out.write("	color: #888;\r\n");
      out.write("	display: block;\r\n");
      out.write("	float: left;\r\n");
      out.write("	font-family: 'Cabin', helvetica, arial, sans-serif;\r\n");
      out.write("	font-size: 13px;\r\n");
      out.write("	font-weight: 400;\r\n");
      out.write("	height: 40px;\r\n");
      out.write("	margin: 0;\r\n");
      out.write("	padding: 0 10px;\r\n");
      out.write("	text-shadow: 0 -1px 0 #000;\r\n");
      out.write("	width: 200px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".ie .webdesigntuts-workshop input {\r\n");
      out.write("	line-height: 40px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".webdesigntuts-workshop input::-webkit-input-placeholder {\r\n");
      out.write("   color: #888;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".webdesigntuts-workshop input:-moz-placeholder {\r\n");
      out.write("   color: #888;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".webdesigntuts-workshop input:focus {\r\n");
      out.write("	animation: glow 800ms ease-out infinite alternate;\r\n");
      out.write("	background: #222922;\r\n");
      out.write("	background: linear-gradient(#333933, #222922);\r\n");
      out.write("	border-color: #393;\r\n");
      out.write("	box-shadow: 0 0 5px rgba(0,255,0,.2), inset 0 0 5px rgba(0,255,0,.1), 0 2px 0 #000;\r\n");
      out.write("	color: #efe;\r\n");
      out.write("	outline: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".webdesigntuts-workshop input:focus::-webkit-input-placeholder { \r\n");
      out.write("	color: #efe;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".webdesigntuts-workshop input:focus:-moz-placeholder {\r\n");
      out.write("	color: #efe;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".webdesigntuts-workshop button {\r\n");
      out.write("	background: #222;\r\n");
      out.write("	background: linear-gradient(#333, #222);\r\n");
      out.write("	box-sizing: border-box;\r\n");
      out.write("	border: 1px solid #444;\r\n");
      out.write("	border-left-color: #000;\r\n");
      out.write("	border-radius: 0 5px 5px 0;\r\n");
      out.write("	box-shadow: 0 2px 0 #000;\r\n");
      out.write("	color: #fff;\r\n");
      out.write("	display: block;\r\n");
      out.write("	float: left;\r\n");
      out.write("	font-family: 'Cabin', helvetica, arial, sans-serif;\r\n");
      out.write("	font-size: 13px;\r\n");
      out.write("	font-weight: 400;\r\n");
      out.write("	height: 40px;\r\n");
      out.write("	line-height: 40px;\r\n");
      out.write("	margin: 0;\r\n");
      out.write("	padding: 0;\r\n");
      out.write("	position: relative;\r\n");
      out.write("	text-shadow: 0 -1px 0 #000;\r\n");
      out.write("	width: 80px;\r\n");
      out.write("}	\r\n");
      out.write("\r\n");
      out.write(".webdesigntuts-workshop button:hover,\r\n");
      out.write(".webdesigntuts-workshop button:focus {\r\n");
      out.write("	background: #292929;\r\n");
      out.write("	background: linear-gradient(#393939, #292929);\r\n");
      out.write("	color: #5f5;\r\n");
      out.write("	outline: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".webdesigntuts-workshop button:active {\r\n");
      out.write("	background: #292929;\r\n");
      out.write("	background: linear-gradient(#393939, #292929);\r\n");
      out.write("	box-shadow: 0 1px 0 #000, inset 1px 0 1px #222;\r\n");
      out.write("	top: 1px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@keyframes glow {\r\n");
      out.write("    0% {\r\n");
      out.write("		border-color: #393;\r\n");
      out.write("		box-shadow: 0 0 5px rgba(0,255,0,.2), inset 0 0 5px rgba(0,255,0,.1), 0 2px 0 #000;\r\n");
      out.write("    }	\r\n");
      out.write("    100% {\r\n");
      out.write("		border-color: #6f6;\r\n");
      out.write("		box-shadow: 0 0 20px rgba(0,255,0,.6), inset 0 0 10px rgba(0,255,0,.4), 0 2px 0 #000;\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write(".logo{\r\n");
      out.write("	position: relative;\r\n");
      out.write("    left: -50%;\r\n");
      out.write("    \r\n");
      out.write("    z-index: 100;\r\n");
      out.write("	color: aliceblue;\r\n");
      out.write("	top: 95px;\r\n");
      out.write("	font-size: xx-large;\r\n");
      out.write("	animation: glow 800ms ease-out infinite alternate;\r\n");
      out.write("	background: #222922;\r\n");
      out.write("	background: linear-gradient(#333933, #222922);\r\n");
      out.write("	border-color: #393;\r\n");
      out.write("	box-shadow: 0 0 5px rgba(0,255,0,.2), inset 0 0 5px rgba(0,255,0,.1), 0 2px 0 #000;\r\n");
      out.write("	color: #efe;\r\n");
      out.write("	outline: none;\r\n");
      out.write("}\r\n");
      out.write(".webdesigntuts-workshop button.mic {\r\n");
      out.write("    width: auto;\r\n");
      out.write("    padding: revert;\r\n");
      out.write("    border-radius: 0px 0px 0px 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <nav>\r\n");
      out.write("       \r\n");
      out.write("    </nav>\r\n");
      out.write("    <main>\r\n");
      out.write("		<div style=\"position: absolute; left: 50%;\">\r\n");
      out.write("			<div style=\"position: relative; left: -50%; border: dotted red 1px;\" class=\"logo\">\r\n");
      out.write("			 APT <br />\r\n");
      out.write("			  \r\n");
      out.write("			</div>\r\n");
      out.write("		  </div>\r\n");
      out.write("   \r\n");
      out.write(" \r\n");
      out.write("           \r\n");
      out.write("        \r\n");
      out.write("            <section class=\"webdesigntuts-workshop\">\r\n");
      out.write("                <form  action=\"/getQuery\" method=\"get\">\r\n");
      out.write("					<input id=\"kk\" type=\"search\" placeholder=\"What are you looking for?\"name=\"searchquery\">			    \r\n");
      out.write("                	<button class=\"mic\" type=\"button\" onclick=\"runSpeechRecognition()\"><i class=\"fa-solid fa-microphone\"></i></button> &nbsp; <span id=\"action\" hidden></span>\r\n");
      out.write("					<div id=\"output\" class=\"hide\" hidden></div>\r\n");
      out.write("                \r\n");
      out.write("						    	\r\n");
      out.write("                    <button>Search</button>\r\n");
      out.write("				 \r\n");
      out.write("                </form>\r\n");
      out.write("			\r\n");
      out.write("        \r\n");
      out.write("            </section>\r\n");
      out.write("			<input type=\"file\" name=\"file\" id=\"file\"  hidden value=\"a.txt\"/>\r\n");
      out.write("       \r\n");
      out.write("   </main>   \r\n");
      out.write("   <script>\r\n");
      out.write("	// The Function\r\n");
      out.write("	function runSpeechRecognition() {\r\n");
      out.write("		// get output div reference\r\n");
      out.write("		var output = document.getElementById(\"output\");\r\n");
      out.write("		// get action element reference\r\n");
      out.write("		var action = document.getElementById(\"action\");\r\n");
      out.write("		// new speech recognition object\r\n");
      out.write("		var SpeechRecognition = SpeechRecognition || webkitSpeechRecognition;\r\n");
      out.write("		var recognition = new SpeechRecognition();\r\n");
      out.write("		\r\n");
      out.write("	\r\n");
      out.write("		// This runs when the speech recognition service starts\r\n");
      out.write("		recognition.onstart = function() {\r\n");
      out.write("			action.innerHTML = \"<small>I'm listening, please speak...</small>\";\r\n");
      out.write("		};\r\n");
      out.write("		\r\n");
      out.write("		recognition.onspeechend = function() {\r\n");
      out.write("			action.innerHTML = \"<small>stopped listening...</small>\";\r\n");
      out.write("			recognition.stop();\r\n");
      out.write("		}\r\n");
      out.write("	  \r\n");
      out.write("		// This runs when the speech recognition service returns result\r\n");
      out.write("		recognition.onresult = function(event) {\r\n");
      out.write("			var transcript = event.results[0][0].transcript;\r\n");
      out.write("			var confidence = event.results[0][0].confidence;\r\n");
      out.write("			//output.innerHTML = \"<b>Text:</b> \" + transcript + \"<br/> <b>Confidence:</b> \" + confidence*100+\"%\";\r\n");
      out.write("			document.getElementById('kk').value=transcript;\r\n");
      out.write("			document.getElementById('kk').focus();\r\n");
      out.write("\r\n");
      out.write("			output.classList.remove(\"hide\");\r\n");
      out.write("		};\r\n");
      out.write("	  \r\n");
      out.write("		 // start recognition\r\n");
      out.write("		 recognition.start();\r\n");
      out.write("	}\r\n");
      out.write("	var x;\r\n");
      out.write("	$('kk').on('keydown', function(){\r\n");
      out.write("        $.ajax({\r\n");
      out.write("          type: 'get',\r\n");
      out.write("          //make request to this url\r\n");
      out.write("          url: '/search',\r\n");
      out.write("          data: {\"query\": x},\r\n");
      out.write("          //here we receive the results\r\n");
      out.write("          success: function(data){\r\n");
      out.write("           //inject the resulting data to html\r\n");
      out.write("          }\r\n");
      out.write("        });\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("var jsArray = new Array();\r\n");
 for(String element:array){

      out.write(" jsArray[jsArray.length] = ");
 element 
      out.write('\r');
      out.write('\n');
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
}