package com.ecommerce;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UserDAO userDAO = new UserDAO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password"); // ⚠️ Hash le mot de passe ici !

        boolean success = userDAO.registerUser(username, email, password);
        
        if (success) {
            response.sendRedirect("login.html");
        } else {
            response.getWriter().println("Erreur lors de l'inscription.");
        }
    }
}
