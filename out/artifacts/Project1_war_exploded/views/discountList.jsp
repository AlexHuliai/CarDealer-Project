<%@ page import="java.util.List" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.time.LocalDate" %>
<%@ page import="java.time.temporal.ChronoUnit" %>
<%@ page import="javax.swing.*" %><%--
  Created by IntelliJ IDEA.
  User: oleksandrhuliai
  Date: 12/18/19
  Time: 10:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <title>Discount cars</title>
</head>
<body>

<div class="w3-container w3-grey w3-opacity w3-right-align w3-padding">
    <button class="w3-btn w3-round-large" onclick="location.href='/'">Back to main</button>
</div>
<%
//    for (int k = 0; k < existingCarList.size(); k++) {
// | DateTimeFormatter sp =  DateTimeFormatter.ofPattern("MM/dd/yyyy");
// | LocalDate date = LocalDate.parse(existingCarList.get(k).getInvDate().trim(), sp);//.parse(existingCarList.get(k).getInvDate().trim());
// |
//
// | LocalDate now = LocalDate.now();
// |
// | long days = java.time.temporal.ChronoUnit.DAYS.between(date, now);
// | System.out.println(days);
// | if (days > 120) {
// | existingCarList.get(k).setDiscountDate("You Qualify for a 10% Discount");
// |
// | }
// | }
                List<String> names = (List<String>) request.getAttribute("carNames");
                    for(int i = 0;i<names.size();i++){
                        String[] s2 = names.get(i).split(" ");
                    DateTimeFormatter sp =  DateTimeFormatter.ofPattern("MM/dd/yyyy");
                    LocalDate date = LocalDate.parse(s2[8].trim(),sp);
                   LocalDate now = LocalDate.now();
                   long days = ChronoUnit.DAYS.between(date,now);
                        if(days>120){
                            out.println("<ul class=\"w3-ul\">");
                            out.println("<li class=\"w3-hover-sand\">" + s2[0]+" "+s2[1]+" "+s2[2]+" "+s2[3]+" "+s2[4]+" "+s2[5]+" "+s2[6]+" "+s2[7]+" "+s2[8]+" "+s2[9] +"</li>");
                            out.println("<img src=\""+s2[10]+"\" style=\"width: 800px; height :500px;\" alt=\"as\">");
                            out.println("<button onclick=\"window.location.href = '/bid';\">Bid Here</button>");
                            out.println("</ul>");
                        }
                }













%>

</body>
</html>
