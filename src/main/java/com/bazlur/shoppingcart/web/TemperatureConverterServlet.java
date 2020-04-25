package com.bazlur.shoppingcart.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/convert")
public class TemperatureConverterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var writer = resp.getWriter();
        writer.println("" +
                "<html>" +
                "<head>" +
                    "<title>Temperature Converter</title>" +
                "</head>" +
                "<body> " +
                    "<h1> Celsius to Fahrenheit Conversion</h2>" +

                    "<form action= \"/convert\" method = \"/get\" />"+
                        "<input type = \"number\" name = \"temperature\" />"+
                        "<input type = \"submit\" value = \"Submit\" />"+
                    "</form>"+

                "</body>"+
                "</html>"



        );
    }
}
