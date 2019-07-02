/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-07-02 21:23:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MainPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/css/styles.css", Long.valueOf(1561574339295L));
    _jspx_dependants.put("/js/script.js", Long.valueOf(1562101858421L));
  }

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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("        <meta name=\"desctiption\" content=\"Свойства воды и пара IF-97\">\r\n");
      out.write("        <meta name=\"keywords\" content=\"Пар, вода, IF-97\">\r\n");
      out.write("        <meta name=\"author\" content=\"Yakov Alekseev\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\r\n");
      out.write("        <title>Свойства воды-пара</title>\r\n");
      out.write("        <style>");
      out.write("@import url('https://fonts.googleapis.com/css?family=Roboto+Slab:300&amp;subset=cyrillic');\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("    font-family: 'Roboto Slab', serif;\r\n");
      out.write("    font-weight: 300;\r\n");
      out.write("    background: khaki;\r\n");
      out.write("    margin:20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a {\r\n");
      out.write("    letter-spacing: .5px;\r\n");
      out.write("    word-spacing:2px;\r\n");
      out.write("    padding: 10px 10px;\r\n");
      out.write("    text-align:justify;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write(".inserted {\r\n");
      out.write("    margin-left: 20px;\r\n");
      out.write("}");
      out.write("</style>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("    <header>\r\n");
      out.write("        <h1>Определение свойств воды-пара по международной формуляции IF-97</h1>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    <main>\r\n");
      out.write("        <form id=\"calculator\" method=\"get\">\r\n");
      out.write("            <section>\r\n");
      out.write("                <h3>Аргументы функции</h3>\r\n");
      out.write("                <input type=\"radio\" name=\"arg\" value=\"PT\"\r\n");
      out.write("                ");
if (request.getParameter("arg") == null)
                                    out.print("checked");
      out.write("\r\n");
      out.write("                >PT\r\n");
      out.write("\r\n");
      out.write("                <input type=\"radio\" name=\"arg\" value=\"PH\"\r\n");
      out.write("                ");
if (request.getParameter("arg") != null && request.getParameter("arg").equals("PH"))
                                    out.print("checked");
      out.write("\r\n");
      out.write("                >PH\r\n");
      out.write("\r\n");
      out.write("                <input type=\"radio\" name=\"arg\" value=\"PS\"\r\n");
      out.write("                ");
if (request.getParameter("arg") != null && request.getParameter("arg").equals("PS"))
                                    out.print("checked");
      out.write("\r\n");
      out.write("                >PS\r\n");
      out.write("\r\n");
      out.write("                <input type=\"radio\" name=\"arg\" value=\"HS\"\r\n");
      out.write("                ");
if (request.getParameter("arg") != null && request.getParameter("arg").equals("HS"))
                                        out.print("checked");
      out.write("\r\n");
      out.write("                >HS\r\n");
      out.write("            </section>\r\n");
      out.write("            <section>\r\n");
      out.write("                <h3>Параметры</h3>\r\n");
      out.write("                <input name=\"param1\"\r\n");
      out.write("                placeholder=\r\n");
      out.write("                ");
if (request.getParameter("param1") != null)
                            out.print(request.getParameter("param1"));
                    else
                        out.print("Давление");
                
      out.write("\r\n");
      out.write("                class=\"param-input\">\r\n");
      out.write("                <select name=\"param1Units\">\r\n");
      out.write("                    <option value=\"PRESSURE_KGS_SM2_gauge\">кгс/см2(изб)</option>\r\n");
      out.write("                    <option checked value=\"PRESSURE_KGS_SM2_abs\">кгс/см2(абс)</option>\r\n");
      out.write("                    <option value=\"PRESSURE_MPA_abs\">МПа(изб)</option>\r\n");
      out.write("                    <option value=\"PRESSURE_MPA_gauge\">МПа(абс)</option>\r\n");
      out.write("                </select>\r\n");
      out.write("\r\n");
      out.write("                <br/>\r\n");
      out.write("                <input name=\"param2\" placeholder=\r\n");
      out.write("                    ");
if (request.getParameter("param2") != null)
                                                out.print(request.getParameter("param2"));
                        else
                            out.print("Температура");
                    
      out.write("\r\n");
      out.write("                class=\"param-input\">\r\n");
      out.write("                <select name=\"param2Units\">\r\n");
      out.write("                    <option value=\"ENTHALPY_KKAL_KG\">ккал/кг</option>\r\n");
      out.write("                    <option value=\"ENTHALPY_KJ_KG\">кДж/кг</option>\r\n");
      out.write("                </select>\r\n");
      out.write("                <br/>\r\n");
      out.write("                <input type=\"submit\" value=\"Рассчет\">\r\n");
      out.write("            </section>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("        <section>\r\n");
      out.write("            <h3>Значения</h3>\r\n");
      out.write("            <p class=\"inserted\">Давление\r\n");
      out.write("                ");
if (request.getAttribute("pressure") != null)
                    out.print("= " + request.getAttribute("pressure"));
      out.write("\r\n");
      out.write("                    Па\r\n");
      out.write("            </p>\r\n");
      out.write("            <p class=\"inserted\">Температура\r\n");
      out.write("                ");
if (request.getAttribute("temperature") != null)
                    out.print("= " + request.getAttribute("temperature"));
      out.write("\r\n");
      out.write("                                К\r\n");
      out.write("            </p>\r\n");
      out.write("            <p class=\"inserted\">Энтальпия\r\n");
      out.write("                ");
if (request.getAttribute("entalphy") != null)
                    out.print("= " + request.getAttribute("entalphy"));
      out.write("\r\n");
      out.write("                                Дж/кг\r\n");
      out.write("            </p>\r\n");
      out.write("            <p class=\"inserted\">Удельный объем\r\n");
      out.write("                ");
if (request.getAttribute("volume") != null)
                    out.print("= " + request.getAttribute("volume"));
      out.write("\r\n");
      out.write("                                м3/кг\r\n");
      out.write("            </p>\r\n");
      out.write("            <p class=\"inserted\">Энтропия\r\n");
      out.write("                            ");
if (request.getAttribute("entropy") != null)
                                out.print("= " + request.getAttribute("entropy"));
      out.write("\r\n");
      out.write("                                Дж/кг*К\r\n");
      out.write("            </p>\r\n");
      out.write("        </section>\r\n");
      out.write("    </main>\r\n");
      out.write("\r\n");
      out.write("    <footer alig=\"center\">\r\n");
      out.write("        <a href=\"/saturation\">Насыщенный пар/конденсат</a>\r\n");
      out.write("        <a href=\"../img/hs-diagram.jpg\">HS-диаграмма</a>\r\n");
      out.write("    </footer>\r\n");
      out.write("    <script type=\"text/javascript\" pageEncoding=\"UTF-8\">\r\n");
      out.write("        ");
      out.write("var param1Units = document.getElementsByName(\"param1Units\")[0];\n");
      out.write("var param2Units = document.getElementsByName(\"param2Units\")[0];\n");
      out.write("\n");
      out.write("//Добавляем слушатель к radioButton\n");
      out.write("var arguments = document.getElementsByName(\"arg\");\n");
      out.write("    for (var i = 0; i < arguments.length; i++) {\n");
      out.write("        arguments[i].addEventListener(\"change\",changeUnits);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("var param1Input = document.getElementsByName(\"param1\")[0];\n");
      out.write("var param2Input = document.getElementsByName(\"param2\")[0];\n");
      out.write("\n");
      out.write("function changeUnits(){\n");
      out.write("    var inp = document.getElementsByName(\"arg\");\n");
      out.write("    for (var i = 0; i < inp.length; i++) {\n");
      out.write("        if (inp[i].type == \"radio\" && inp[i].checked) {\n");
      out.write("            if (inp[i].value==\"PH\"){\n");
      out.write("                param1Input.placeholder = \"Давление\";\n");
      out.write("                param1Units.innerHTML = \"<option value=\\\"PRESSURE_KGS_SM2_gauge\\\">кгс/см2(изб)</option>\" +\n");
      out.write("                                \"<option value=\\\"PRESSURE_KGS_SM2_abs\\\">кгс/см2(абс)</option>\" +\n");
      out.write("                                \"<option value=\\\"PRESSURE_MPA_abs\\\">МПа(изб)</option>\" +\n");
      out.write("                                \"<option value=\\\"PRESSURE_MPA_gauge\\\">МПа(абс)</option>\";\n");
      out.write("                param2Input.placeholder = \"Энтальпия\";\n");
      out.write("                param2Units.innerHTML = \"<option value=\\\"ENTHALPY_KKAL_KG\\\">ккал/кг</option>\" +\n");
      out.write("                                        \"<option value=\\\"ENTHALPY_KJ_KG\\\">кДж/кг</option>\";\n");
      out.write("            } else if (inp[i].value==\"PS\"){\n");
      out.write("                param1Input.placeholder = \"Давление\";\n");
      out.write("                                param1Units.innerHTML = \"<option value=\\\"PRESSURE_KGS_SM2_gauge\\\">кгс/см2(изб)</option>\" +\n");
      out.write("                                                \"<option value=\\\"PRESSURE_KGS_SM2_abs\\\">кгс/см2(абс)</option>\" +\n");
      out.write("                                                \"<option value=\\\"PRESSURE_MPA_abs\\\">МПа(изб)</option>\" +\n");
      out.write("                                                \"<option value=\\\"PRESSURE_MPA_gauge\\\">МПа(абс)</option>\";\n");
      out.write("                param2Input.placeholder = \"Энтропия\";\n");
      out.write("                param2Units.innerHTML = \"<option value=\\\"ENTROPY_KKAL_KG_C\\\">ккал/кг·°C</option>\" +\n");
      out.write("                                        \"<option value=\\\"ENTROPY_KJ_KG_C\\\">кДж/кг·°C</option>\";\n");
      out.write("            } else if (inp[i].value==\"PT\"){\n");
      out.write("                param1Input.placeholder = \"Давление\";\n");
      out.write("                param1Units.innerHTML = \"<option value=\\\"PRESSURE_KGS_SM2_gauge\\\">кгс/см2(изб)</option>\" +\n");
      out.write("                                        \"<option value=\\\"PRESSURE_KGS_SM2_abs\\\">кгс/см2(абс)</option>\" +\n");
      out.write("                                        \"<option value=\\\"PRESSURE_MPA_abs\\\">МПа(изб)</option>\" +\n");
      out.write("                                        \"<option value=\\\"PRESSURE_MPA_gauge\\\">МПа(абс)</option>\";\n");
      out.write("                param2Input.placeholder = \"Температура\";\n");
      out.write("                param2Units.innerHTML = \"<option value=\\\"TEMPERATURE_K\\\">K</option>\" +\n");
      out.write("                                        \"<option value=\\\"TEMPERATURE_C\\\">°C</option>\";\n");
      out.write("            } else if (inp[i].value==\"HS\"){\n");
      out.write("                param1Input.placeholder = \"Энтальпия\";\n");
      out.write("                param1Units.innerHTML = \"<option value=\\\"ENTHALPY_KKAL_KG\\\">ккал/кг</option>\" +\n");
      out.write("                                        \"<option value=\\\"ENTHALPY_KJ_KG\\\">кДж/кг</option>\";\n");
      out.write("                param2Input.placeholder = \"Энтропия\";\n");
      out.write("                param2Units.innerHTML = \"<option value=\\\"ENTROPY_KKAL_KG_C\\\">ккал/кг·°C</option>\" +\n");
      out.write("                                        \"<option value=\\\"ENTROPY_KJ_KG_C\\\">кДж/кг·°C</option>\";\n");
      out.write("            } else if (inp[i].value==\"P\"){\n");
      out.write("                param1Input.placeholder = \"Давление\";\n");
      out.write("                param1Units.innerHTML = \"<option value=\\\"PRESSURE_KGS_SM2_gauge\\\">кгс/см2(изб)</option>\" +\n");
      out.write("                                        \"<option value=\\\"PRESSURE_KGS_SM2_abs\\\">кгс/см2(абс)</option>\" +\n");
      out.write("                                        \"<option value=\\\"PRESSURE_MPA_abs\\\">МПа(изб)</option>\" +\n");
      out.write("                                        \"<option value=\\\"PRESSURE_MPA_gauge\\\">МПа(абс)</option>\";\n");
      out.write("            } else if (inp[i].value==\"T\"){\n");
      out.write("                param1Input.placeholder = \"Температура\";\n");
      out.write("                param1Units.innerHTML = \"<option value=\\\"TEMPERATURE_K\\\">K</option>\" +\n");
      out.write("                                        \"<option value=\\\"TEMPERATURE_C\\\">°C</option>\";\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("}");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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
