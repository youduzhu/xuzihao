package com.xuzihao.lab3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AddCookiesServlet", value = "/add_cookies")
public class AddCookiesServlet extends HttpServlet {
    private static int cookieCount;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = "Cookie" + (++cookieCount);
        String value = String.valueOf(System.currentTimeMillis());

        //create a cookie
        Cookie cookie =new Cookie(name, value);

        //add cookie into response
        response.addCookie(cookie);

        response.getWriter().println("A cookie has been created successfully!");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
