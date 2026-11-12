import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/context")
public class ServletContextExample extends HttpServlet {

    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {

        ServletContext context = getServletContext();

        context.setAttribute("college", "JJ Magdum College");

        response.setContentType("text/plain");

        PrintWriter out = response.getWriter();

        out.println(
                "College: " + context.getAttribute("college")
        );
    }
}
