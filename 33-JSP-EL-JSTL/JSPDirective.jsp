<%@ page contentType="text/html;charset=UTF-8"
         import="java.time.LocalDate" %>

<%@ include file="Header.jsp" %>

<html>
<body>

    <h2>JSP Directive Example</h2>

    <p>Today's Date: <%= LocalDate.now() %></p>

</body>
</html>
