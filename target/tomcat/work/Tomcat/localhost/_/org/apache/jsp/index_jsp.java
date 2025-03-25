/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2025-03-25 10:47:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("   <head>\n");
      out.write("      <meta charset=\"UTF-8\">\n");
      out.write("      <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("      <link rel=\"stylesheet\" href=\"style.css\"> \n");
      out.write("      <title>Site E-Commerce</title>\n");
      out.write("   </head>\n");
      out.write("   <body>\n");
      out.write("      <a href=\"sell.jsp\"><h2 id=\"TextWelcome\">Site E-Commerce Java</h2></a>\n");
      out.write("      \n");
      out.write("      <div class=\"container\" id=\"container\">\n");
      out.write("\n");
      out.write("         <div class=\"form-container sign-up-container\">\n");
      out.write("            <form action=\"/register\" method=\"post\">\n");
      out.write("\n");
      out.write("               <h1 class=\"signup\">Tu veux un compte ?</h1>\n");
      out.write("               <span>ou utilise ton email pour te connecter</span>\n");
      out.write("               <input type=\"text\" placeholder=\"Username\" name=\"username\"  required/>\n");
      out.write("               <input type=\"email\" placeholder=\"Email\"  name=\"email\" required/>\n");
      out.write("               <input type=\"password\" placeholder=\"Password\" id=\"password\" name=\"password\" required>\n");
      out.write("               <input type=\"password\" placeholder=\"Confirm Password\" id=\"confirm_password\" name=\"confirm_password\" required>\n");
      out.write("               <button type=\"submit\">Inscription</button>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("         </div>\n");
      out.write("\n");
      out.write("         <div class=\"form-container sign-in-container\">\n");
      out.write("            <form action=\"/login\" method=\"post\">\n");
      out.write("\n");
      out.write("               <h1>Connexion</h1>\n");
      out.write("               <input type=\"email\" placeholder=\"Email\" name=\"Email\" required/>\n");
      out.write("               <input type=\"password\" placeholder=\"Password\" name=\"Password\" required />\n");
      out.write("               <a id=\"mdp\" href=\"#\"> Mot de passe oublie ?</a>\n");
      out.write("               <button >Connexion</button>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("         </div>\n");
      out.write("\n");
      out.write("         <div class=\"overlay-container\">\n");
      out.write("            <div class=\"overlay\">\n");
      out.write("\n");
      out.write("               <div class=\"overlay-panel overlay-left\">\n");
      out.write("                  <h1>Tu as un compte ?</h1>\n");
      out.write("                  <p>Pour te connecter avec tes identifiants c'est juste ici</p>\n");
      out.write("                  <button class=\"ghost\" id=\"signIn\">Connexion</button>\n");
      out.write("               </div>\n");
      out.write("\n");
      out.write("               <div class=\"overlay-panel overlay-right\">\n");
      out.write("                  <h1>Salut !</h1> \n");
      out.write("                  <p>Si tu veux pouvoir acheter, il te faut un compte c'est par ici !</p>\n");
      out.write("                  <button class=\"ghost\" id=\"signUp\">Inscription</button>\n");
      out.write("               </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <!--  hash le mot de passe -->\n");
      out.write("      <script src=\"https://cdnjs.cloudflare.com/ajax/libs/crypto-js/4.0.0/crypto-js.min.js\"></script>   \n");
      out.write("      <script>\n");
      out.write("         const signUpButton = document.getElementById('signUp');\n");
      out.write("         const signInButton = document.getElementById('signIn');\n");
      out.write("         const container = document.getElementById('container');\n");
      out.write("         \n");
      out.write("         signUpButton.addEventListener('click', () => {\n");
      out.write("         container.classList.add(\"right-panel-active\");\n");
      out.write("         });\n");
      out.write("         \n");
      out.write("         signInButton.addEventListener('click', () => {\n");
      out.write("         container.classList.remove(\"right-panel-active\");\n");
      out.write("         });\n");
      out.write("      </script>\n");
      out.write("      <script>\n");
      out.write("         var password = document.getElementById(\"password\"),\n");
      out.write("             confirm_password = document.getElementById(\"confirm_password\");\n");
      out.write("         \n");
      out.write("         function validatePassword() {\n");
      out.write("            if (password.value != confirm_password.value) {\n");
      out.write("               confirm_password.setCustomValidity(\"Passwords Don't Match\");\n");
      out.write("            } else {\n");
      out.write("               confirm_password.setCustomValidity('');\n");
      out.write("            }\n");
      out.write("         }\n");
      out.write("         \n");
      out.write("         password.onchange = validatePassword;\n");
      out.write("         confirm_password.onkeyup = validatePassword;\n");
      out.write("      </script>\n");
      out.write("   </body>\n");
      out.write("\n");
      out.write("   <!--  hash le mot de passe REGISTER -->\n");
      out.write("   <script>\n");
      out.write("      var signUpForm = document.querySelector(\".sign-up-container form\");\n");
      out.write("      signUpForm.addEventListener(\"submit\", function(event) {\n");
      out.write("         event.preventDefault();\n");
      out.write("      \n");
      out.write("         var passwordField = document.getElementById(\"password\");\n");
      out.write("         var passwordField2 = document.getElementById(\"confirm_password\");\n");
      out.write("         var password = passwordField.value;\n");
      out.write("      \n");
      out.write("         // Hacher le mot de passe avec SHA-256\n");
      out.write("         var hashedPassword = CryptoJS.SHA256(password).toString();\n");
      out.write("      \n");
      out.write("         // Mettre Ã  jour la valeur du champ de mot de passe avec le mot de passe hachÃ©\n");
      out.write("         passwordField.value = hashedPassword;\n");
      out.write("         passwordField2.value = hashedPassword;\n");
      out.write("      \n");
      out.write("      });\n");
      out.write("      </script> \n");
      out.write("\n");
      out.write("      <!--  hash le mot de passe LOGIN -->\n");
      out.write("      <script>\n");
      out.write("         var signUpForm = document.querySelector(\".login-container form\");\n");
      out.write("         signUpForm.addEventListener(\"submit\", function(event) {\n");
      out.write("            event.preventDefault();\n");
      out.write("      \n");
      out.write("            var passwordField = document.getElementById(\"password\");\n");
      out.write("            var password = passwordField.value;\n");
      out.write("      \n");
      out.write("            // Hacher le mot de passe avec SHA-256\n");
      out.write("            var hashedPassword = CryptoJS.SHA256(password).toString();\n");
      out.write("      \n");
      out.write("            // Mettre Ã  jour la valeur du champ de mot de passe avec le mot de passe hachÃ©\n");
      out.write("            passwordField.value = hashedPassword;\n");
      out.write("      \n");
      out.write("            // Soumettre le formulaire d'inscription\n");
      out.write("            \n");
      out.write("         });\n");
      out.write("      </script> \n");
      out.write("</html>\n");
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
