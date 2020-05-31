<%--
  Created by IntelliJ IDEA.
  User: Chau Dang
  Date: 5/31/2020
  Time: 7:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>index</title>
  </head>
  <body>
  <h1>English-Vietnamese Dictionary</h1>
  <form action="/result" method="post">
    <label>
      <input type="search" name="keyword">
    </label>
    <input type="submit" value="search">
  </form>
  </body>
</html>
