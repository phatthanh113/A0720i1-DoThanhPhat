package practise;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet(name = "TimeServlet",urlPatterns = "/time")
public class TimeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Date today = new Date();
        request.setAttribute("time",today);
        request.getRequestDispatcher("practise/print_time.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Date today = new Date();
        request.setAttribute("time",today);
        request.getRequestDispatcher("practise/print_time.jsp").forward(request,response);
    }
}
