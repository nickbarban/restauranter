package ppl.da;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by greg on 17.10.15.
 */
@WebServlet("/test")
public class Test extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Test passed!!</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
