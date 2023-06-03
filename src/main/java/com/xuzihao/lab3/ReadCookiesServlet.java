package com.xuzihao.lab3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ReadCookiesServlet", value = "/read_cookies")
public class ReadCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter writer = response.getWriter();

        Cookie[] cookies = request.getCookies();

        if (cookies == null){
            writer.println("No cookies found");
        }else{
            writer.println("Number of cookies: " + cookies.length);

            for (Cookie aCookie : cookies){
                String name = aCookie.getName();
                String value = aCookie.getValue();

                writer.println(name + "=" + value);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
