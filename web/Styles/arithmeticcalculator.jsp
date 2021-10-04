<%-- 
    Document   : arithmeticcalculator
    Created on : Oct 3, 2021, 5:31:38 PM
    Author     : Jane
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
        <link rel="stylesheet" href="Styles/index.css" type="text/css"/>    
    </head>
    <body>
        <div class = "main-block">
            <div class = "tableBody">
                <table>
                    <tr><td>
                            <h1>Arithmetic Calculator</h1></td></tr>
                    <tr><td>
                            <form action="arithmetic" method="POST">
                                <label><h3>First:</h3></label></td></tr>
                    <tr><td>
                            <input  class="searchInput" type="text" name="first" value="${FIRST}">
                        </td></tr>
                    <tr><td>
                            <label><h3>Second:</h3></label></td></tr>
                    <tr><td>
                            <input  class="searchInput" type="text" name="second" value="${SECOND}">
                        </td></tr>
                    <tr><td>
                            <input  class="button" type="submit" name="action" value="+"/>
                            <input  class="button" type="submit" name="action" value="-"/>
                            <input  class="button" type="submit" name="action" value="*"/>
                            <input  class="button" type="submit" name="action" value="%"/>
                        </td></tr>
                    </form>
                    <tr><td>
                            <p class="resultArea"><i><h3>Result: ${MESSAGE}</h3></i></p>    </td></tr>
                    <tr><td>
                            <p><a href='age'>Age Calculator</a></p></td></tr>
                </table>
            </div>
        </div>
    </body>
</html>
