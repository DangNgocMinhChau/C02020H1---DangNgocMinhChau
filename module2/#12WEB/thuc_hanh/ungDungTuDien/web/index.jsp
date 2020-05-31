<%--
  Created by IntelliJ IDEA.
  User: Chau Dang
  Date: 5/23/2020
  Time: 10:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Ứng dụng từ điển</title>
  </head>
  <body>
    <h1>Vietnamese Dictionary</h1>
  <form action="/translate" method="post">
    <input type="text" name="txtSearch" placeholder="Enter your word" />
    <input type="submit" id="submit" value="Search"/>
  </form>
  </body>
</html>
