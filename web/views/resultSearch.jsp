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


        for (int i = 0; i < names.size(); i++) {
            String[] s2 = names.get(i).split(" ");
            if (s2[1].equalsIgnoreCase(names1.toString())) {
                out.println("<li class=\"w3-hover-sand\">" + s2[0] + " " + s2[1] + " " + s2[2] + " " + s2[3] + " " + s2[4] + " " + s2[5] + " " + s2[6] + " " + s2[7] + " " + s2[8] + " " + s2[9] + "</li>");
                out.println("<img src=\"" + s2[10] + "\" style=\"width: 800px; height :500px;\" alt=\"as\">");
                out.println("</ul>");
            }
            else if
            (!s2[1].equalsIgnoreCase(names1.toString())) {
                out.println("<div class=\"w3-panel w3-red w3-display-container w3-card-4 w3-round\">\n"
                        +
                        "   <span onclick=\"this.parentElement.style.display='none'\"\n" +
                        "   class=\"w3-button w3-margin-right w3-display-right w3-round-large w3-hover-red w3-border w3-border-red w3-hover-border-grey\">×</span>\n" +
                        "   <h5>There are no cars that match the search parameter!</h5>\n" +
                        "</div>");
                i=names.size();
            }
        }



%>

</body>
</html>
