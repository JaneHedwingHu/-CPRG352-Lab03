<%-- 
    Document   : agecalculator
    Created on : Oct 3, 2021, 5:30:28 PM
    Author     : Jane
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
        <link rel="stylesheet" href="Styles/index.css" type="text/css"/>    
    </head>
    <body>
        <div class = "main-block">
            <table>
                <tr><td><h1>Age Calculator</h1></td></tr>
                <tr><td>
                        <form action="age" method="POST">
                            <label><h3>Enter your age:</h3></label></td></tr>
                <tr><td>
                        <input class="searchInput" type="text" name="age" value="${AGE}">
                <tr><td>
                        <input class="AgeButton" type="submit" value="Age next birthday">    
                    </td></tr>
                </form>
                </td>
                </tr>
                <tr>
                    <td><p><i>${MESSAGE}</i></p></td>
                </tr>
                <tr><td>
                        <p><a href='arithmetic'>Arithmetic Calculator</a></p>
                    </td></tr>
            </table>
        </div>
    </body>
</html>
