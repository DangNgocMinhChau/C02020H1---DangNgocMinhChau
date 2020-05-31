
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>ứng dụng chuyển đổi tiền tệ</title>
  </head>
  <body>
    <h1>Currency Conventer</h1>
    <form action="/converter.jsp" , method="post">
      <table>Rate</table>
      <input type="text" name="rate"  value="22000"/><br>
      <table>USD </table>
      <input type="text" name="usd" placeholder="0" value="0"><br>
      <input type="submit" id="submit" value="Converter">
    </form>

  </body>
</html>
