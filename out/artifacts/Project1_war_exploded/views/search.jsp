<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: oleksandrhuliai
  Date: 12/18/19
  Time: 10:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <title>Search By Model</title>

</head>
<body>
<div class="w3-container w3-grey w3-opacity w3-right-align w3-padding">
    <button class="w3-btn w3-round-large" onclick="location.href='/'">Back to main</button>
</div>
<div class="w3-container w3-grey w3-opacity w3-right-align w3-padding">
    <form class="container" action="result" method="post">
        <label for="model1">Car Model</label>
        <input type="text" class="form-control" name="model1" id="model1" placeholder="model">
        <button type="submit" class="btn btn-primary">Search</button>
    </form>
</div>













</body>
</html>
