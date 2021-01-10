import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/DB")
public class DBacc extends HttpServlet {
    int count = 0;
    GetDB db = new GetDB();
    String brand = db.getBrand().get(0);
/*    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println(1);
        out.println(brand);
    }
    */
}
