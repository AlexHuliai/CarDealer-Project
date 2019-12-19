<%--
  Created by IntelliJ IDEA.
  User: oleksandrhuliai
  Date: 12/16/19
  Time: 2:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Purchase Car</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
<form class="container" action="info" method="post">
    <label for="firstName">First Name</label>
    <input type="text" class="form-control" name="firstName" id="firstName" placeholder="First Name">
    <label for="lastName">Last Name</label>
    <input type="text" class="form-control" name="lastName" id="lastName" placeholder="Last Name">
    <label for="pricePaid">Price Paid</label>
    <input type="text" class="form-control" name="pricePaid" id="pricePaid" placeholder="Price Paid $:">
    <label for="datePurchased">Date Purchased</label>
    <input type="text" class="form-control" name="datePurchased" id="datePurchased" placeholder="mm/dd/year">
    <label for="vin">VIN</label>
    <input type="text" class="form-control" name="vin" id="vin" placeholder="VIN:">
    <button type="submit" class="btn btn-primary">Confirm Purchase</button>
</form>
</body>
</html>
