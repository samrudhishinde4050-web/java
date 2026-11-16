<%@ page contentType="text/html;charset=UTF-8" %>

<%!
    int square(int number) {
        return number * number;
    }
%>

<html>
<body>

    <h2>JSP Declaration Example</h2>

    <%
        int number = 5;
    %>

    <p>Number: <%= number %></p>

    <p>Square: <%= square(number) %></p>

</body>
</html>
