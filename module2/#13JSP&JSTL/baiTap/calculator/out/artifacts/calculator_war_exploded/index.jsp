<%--
  Created by IntelliJ IDEA.
  User: Chau Dang
  Date: 5/26/2020
  Time: 6:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>calculator</title>
</head>
<body>
<form action="/cal" method="post">
    <table>First operand</table>
    <input type="text" name="firstnumber"><br>
    <table>Operator</table>
    <select name="operator">
        <option value="+">+</option>
        <option value="-">-</option>
        <option value="*">x</option>
        <option value="/">:</option>
    </select><br>
    <table>Second operand</table>
    <input type="text" name="secondnumber"><br>
    <input type="submit" id="submit" value="calculator">


</form>
</body>
</html>
