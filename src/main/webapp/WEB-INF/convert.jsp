<%--
  Created by IntelliJ IDEA.
  User: Hasan
  Date: 26-Apr-20
  Time: 1:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Temperature Converter</title>
    </head>
    <body>
        <h1>Celsius to Fahrenheit Conversion</h1>
        <form method="post" action="/convert">

            <input type="number" name="temperature"/>
            <input type="submit" value="Submit"/>

        </form>
    </body>
</html>
