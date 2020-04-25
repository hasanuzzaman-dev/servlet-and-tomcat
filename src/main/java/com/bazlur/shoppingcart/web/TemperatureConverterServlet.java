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

        req.getRequestDispatcher("/WEB-INF/convert.jsp")
                .forward(req,resp);


       /* var writer = resp.getWriter();
        var temperature = req.getParameter("temperature");

        if (temperature != null && temperature.length() > 0) {
            double temperatureInC = Double.parseDouble(temperature);
            double temperatureInF = (temperatureInC * 9 / 5) + 32;

            writer.println("" +
                    "<html>" +
                        "<head>" +
                            "<title>Temperature Converter</title>" +
                        "</head>" +
                        "<body> " +
                            "<p> Temperature in Fahrenheit is: " +
                                "   "+ temperatureInF + "</p>" +
                        "</body>" +
                    "</html>"
            );

            return;
        }
        writer.println("" +
                "<html>" +
                "<head>" +
                "<title>Temperature Converter</title>" +
                "</head>" +
                "<body> " +
                "<h1> Celsius to Fahrenheit Conversion</h2>" +

                "<form action= \"/convert\" method = \"/get\" />" +
                "<input type = \"number\" name = \"temperature\" />" +
                "<input type = \"submit\" value = \"Submit\" />" +
                "</form>" +

                "</body>" +
                "</html>"

        );*/
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        var temperature = req.getParameter("temperature");

        if (temperature != null && temperature.length() > 0){
            double temperatureInC = Double.parseDouble(temperature);
            double temperatureInF = (temperatureInC * 9 / 5) + 32;

            req.setAttribute("result", temperatureInF);
        }

        req.getRequestDispatcher("/WEB-INF/result.jsp").forward(req,resp);
    }
}
