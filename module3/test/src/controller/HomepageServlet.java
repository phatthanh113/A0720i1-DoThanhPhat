package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "HomepageServlet",urlPatterns = "/homepage")
public class HomepageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
//        if(action != null) {
            request.setAttribute("action","../customer/list.jsp");
//        }
        request.getRequestDispatcher("jsp/homepage/homepage.jsp").forward(request,response);
    }
}
