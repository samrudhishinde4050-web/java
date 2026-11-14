<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <title>First JSP</title>
</head>
<body>

    <h1>Welcome to Java JSP!</h1>

    <p>My name is Samrudhi.</p>

    <p>Current Date:
        <%= java.time.LocalDate.now() %>
    </p>

</body>
</html>
