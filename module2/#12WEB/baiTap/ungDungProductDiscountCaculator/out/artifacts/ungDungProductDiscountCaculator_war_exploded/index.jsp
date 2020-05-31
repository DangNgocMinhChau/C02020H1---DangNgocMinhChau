<%--
  Created by IntelliJ IDEA.
  User: Chau Dang
  Date: 5/23/2020
  Time: 11:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Caculator</title>
  </head>
  <body>
  <h1>Product Discount Caculator</h1>
  <form method="post" action="/display-discount">
    <label>Product Description </label>
    <input type="text" name="productDescription" placeholder="productDescription" /></br>
    <label>List Price </label>
    <input type="text" name="price" placeholder="0" value="0"/></br>
    <label>Discount Percent </label>
    <input type="text" name="discount" placeholder="0" value="0"></br>
    <input type="submit" id="submit" value="CaculatorDiscount">


  </form>
  </body>
</html>
