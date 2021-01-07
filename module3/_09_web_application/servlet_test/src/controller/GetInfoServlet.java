package controller;

import model.Person;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "GetInfoServlet",urlPatterns = "/info")
public class GetInfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
    String name = request.getParameter("name");
    String address = request.getParameter("address");
    String birthdayAsBirthday = request.getParameter("birthday");
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        Date birthday = null;
        try {
           birthday = date.parse(birthdayAsBirthday);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Person person = new Person(name,address,birthday);
        request.setAttribute("person",person);
        request.getRequestDispatcher("information/getInfo.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("information/information.jsp").forward(request,response);
    }
}
