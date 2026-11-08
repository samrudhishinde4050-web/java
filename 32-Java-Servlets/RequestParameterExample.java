import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/student")
public class RequestParameterExample extends HttpServlet {

    @Override
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {

        String name = request.getParameter("name");
        String city = request.getParameter("city");

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<h2>Student Details</h2>");
        out.println("Name: " + name + "<br>");
        out.println("City: " + city);
    }
}
