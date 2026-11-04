import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet("/lifecycle")
public class ServletLifecycle extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("Servlet initialized");
    }

    @Override
    protected void doGet(
            jakarta.servlet.http.HttpServletRequest request,
            jakarta.servlet.http.HttpServletResponse response) {

        System.out.println("Request received");
    }

    @Override
    public void destroy() {
        System.out.println("Servlet destroyed");
    }
}
