<%@ page import="java.util.List" %>
<%@ page import="app.entities.Car" %>
<%@ page import="java.io.BufferedReader" %>
<%@ page import="java.io.Reader" %>
<%@ page import="java.io.FileReader" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Users list</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>

<body class="w3-light-grey">
<div  class="w3-container w3-blue-grey w3-opacity w3-right-align">
    <h1>Super app!</h1>
</div>

<div class="w3-container w3-center w3-margin-bottom w3-padding">
    <div class="w3-card-4">
        <div class="w3-container w3-light-blue">
            <h2>Cars</h2>
        </div>
        <div class="w3-container w3-grey w3-opacity w3-right-align w3-padding">
            <button class="w3-btn w3-round-large" onclick="location.href='/'">Back to main</button>
        </div>

        <%
//
            List<String> names = (List<String>) request.getAttribute("carNames");
            String  path = "/Users/oleksandrhuliai/Desktop/transaction.txt";

            String line;


            BufferedReader reader = new BufferedReader(new FileReader(path));


            while((line=reader.readLine())!=null) {


                String[] parsedLine = line.split(" ");
                for (int i = 0; i < names.size(); i++) {
                    String[] s2 = names.get(i).split(" ");
                    if (s2[6].equals(parsedLine[4])) {
                        names.remove(i);
                    }
                }
            }

                    if (names != null && !names.isEmpty()) {
                        out.println("<ul class=\"w3-ul\">");


                            for(int k=0;k<names.size();k++){
                            String[] s3 = names.get(k).split(" ");
                            out.println("<li class=\"w3-hover-sand\">" + s3[0]+" "+s3[1]+" "+s3[2]+" "+s3[3]+" "+s3[4]+" "+s3[5]+" "+s3[6]+" "+s3[7]+" "+s3[8]+" "+s3[9] );
                            out.println("<br>");
                            out.println("<img src=\""+s3[10]+"\" style=\"width: 800px; height :500px;\" alt=\"as\">");
                            out.println("</li><button onclick=\"window.location.href = '/transaction';\">Purchase Car</button>");
                        }


                        out.println("</ul>");

                    } else out.println("<div class=\"w3-panel w3-red w3-display-container w3-card-4 w3-round\">\n"
                            +
                            "   <span onclick=\"this.parentElement.style.display='none'\"\n" +
                            "   class=\"w3-button w3-margin-right w3-display-right w3-round-large w3-hover-red w3-border w3-border-red w3-hover-border-grey\">×</span>\n" +
                            "   <h5>There are no Cars yet!</h5>\n" +
                            "</div>");


        %>
    </div>
</div>


</body>
</html>