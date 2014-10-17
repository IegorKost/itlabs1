package com.iegor.authenticatinServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Created by Iegor on 27.07.2014.
 * AuthenticationServlet class returns greetings with username and date
 * after successful checking in ServletFilter
 *
 */
@WebServlet("/com.iegor.authenticatinServlet.AuthenticationServlet")
public class AuthenticationServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("response.jsp");
    }
}
