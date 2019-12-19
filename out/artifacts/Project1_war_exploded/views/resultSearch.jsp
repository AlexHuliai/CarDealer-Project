<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: oleksandrhuliai
  Date: 12/18/19
  Time: 12:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <title>Result</title>
</head>
<body>
<div class="w3-container w3-grey w3-opacity w3-right-align w3-padding">
    <button class="w3-btn w3-round-large" onclick="location.href='/'">Back to main</button>
</div>

<%

    List<String> names = (List<String>) request.getAttribute("carNames1");
    Object names1 =  request.getAttribute("carNames2");

    for(int i = 0;i<names.size();i++){
        String[] s2 = names.get(i).split(" ");
        if(s2[1].equalsIgnoreCase(names1.toString())){
            out.println("<li class=\"w3-hover-sand\">" + names.get(i) + "</li>");
        }
    }


%>

</body>
</html>
