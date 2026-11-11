import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(
    urlPatterns = "/config",
    initParams = {
        @WebInitParam(name = "developer", value = "Samrudhi")
    }
)
public class ServletConfigExample extends HttpServlet {

    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {

        ServletConfig config = getServletConfig();

        String developer = config.getInitParameter("developer");

        response.setContentType("text/plain");

        PrintWriter out = response.getWriter();

        out.println("Developer: " + developer);
    }
}
