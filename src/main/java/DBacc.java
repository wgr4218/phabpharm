import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/DB")
public class DBacc extends HttpServlet {
    GetDB db= new GetDB();
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {}
}
