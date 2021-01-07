package practise;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ConvertServlet",urlPatterns = "/convert")
public class ConvertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Integer number = Integer.parseInt(request.getParameter("usd"));
    Integer rate = Integer.parseInt(request.getParameter("rate"));
    request.setAttribute("vnd",number*rate);
        request.getRequestDispatcher("practise/convert_currency.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("practise/convert_currency.jsp").forward(request,response);
    }
}
