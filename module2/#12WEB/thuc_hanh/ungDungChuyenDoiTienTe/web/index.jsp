<%--
  Created by IntelliJ IDEA.
  User: Chau Dang
  Date: 5/23/2020
  Time: 7:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ứng dụng chuyển đổi tiền tệ</title>
</head>
<body>
<h1>Currency Converter</h1>
<form method="post" action="/convert">
  <lable>Rate : </lable></br>
<input type="text" name="rate1" placeholder="Rate" value="20000" /></br>
<label>USD : </label></br>
<input type="text" name="usd" placeholder="USD" value="0" /></br>
<input type="submit" id="submit" value="Converter" />
</form>

</body>
</html>
