<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<body>

    <h2>JSP Expression Example</h2>

    <p>Message: <%= "Hello Java Developer!" %></p>

    <p>Addition: <%= 10 + 20 %></p>

    <p>Multiplication: <%= 5 * 5 %></p>

    <p>Current Date: <%= java.time.LocalDate.now() %></p>

</body>
</html>
