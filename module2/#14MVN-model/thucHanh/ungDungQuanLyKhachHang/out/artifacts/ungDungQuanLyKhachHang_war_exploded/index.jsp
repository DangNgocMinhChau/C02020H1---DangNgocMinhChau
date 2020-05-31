<%--
  Created by IntelliJ IDEA.
  User: Chau Dang
  Date: 5/28/2020
  Time: 8:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Customer List</title>
  </head>
  <body>
    <h1>Customers</h1>
  <p>
    <a href="/customers?action=view">Create new customer</a>
  </p>
  <table border="1">
      <tr>
        <td>Name</td>
        <td>Email</td>
        <td>Address</td>
        <td>Edit</td>
        <td>Delete</td>
      </tr>
    <c:forEach items='${requestScope["customer"]}' var="cuatomer">
      <tr>
        <td><a href="/customers?action=view&id=${cuatomer.getId()}">${cuatomer.getName()}</a></td>
        <td>${cuatomer.getEmail()}</td>
        <td>${cuatomer.getAddress()}</td>
        <td><a href="/customers?action=edit&id=${cuatomer.getId()}">edit</a></td>
        <td><a href="/customers?action=delete&id=${cuatomer.getId()}">delete</a></td>
      </tr>
    </c:forEach>
  </table>
  </body>
</html>
