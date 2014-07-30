package com.iegor.authenticatinServlet;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
* Created by Iegor on 27.07.2014.
 * ServletFilter class checks name and password
*/
public class ServletFilter implements Filter {
    private final String name = "Iegor";
    private final String password = "123";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        if(request.getParameter("name").equals(name) && request.getParameter("password").equals(password)){
            filterChain.doFilter(request, response);
        }
        else {response.sendRedirect("index.jsp");}
    }

    @Override
    public void destroy() {

    }

}
