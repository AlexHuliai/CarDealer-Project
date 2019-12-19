<%--
  Created by IntelliJ IDEA.
  User: oleksandrhuliai
  Date: 12/18/19
  Time: 2:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <title>Bidding form</title>
</head>
<body>
<div class="w3-container w3-grey w3-opacity w3-right-align w3-padding">
    <button class="w3-btn w3-round-large" onclick="location.href='/'">Back to main</button>


</div>


<form class="container" action="bidResult" method="post">
    <label for="bidPrice">Bid</label>
    <input type="text" class="form-control" name="bid" id="bidPrice" placeholder="min:price of the vehicle -10%">
    <label for="vin">Vin Of The Car</label>
    <input type="text" class="form-control" name="vin" id="vin" placeholder="vin">
    <button type="submit" class="btn btn-primary">Confirm Bid</button>
</form>




</body>
</html>
