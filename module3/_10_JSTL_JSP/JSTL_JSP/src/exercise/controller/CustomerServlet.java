package exercise.controller;

import exercise.model.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet",urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> listCustomer = new ArrayList<>();
        listCustomer.add(new Customer("Hoan","11-03-1998","Da Nang","https://image.shutterstock.com/image-photo/white-transparent-leaf-on-mirror-260nw-1029171697.jpg"));
        listCustomer.add(new Customer("Hoan","11-03-1998","Da Nang","https://image.shutterstock.com/image-photo/white-transparent-leaf-on-mirror-260nw-1029171697.jpg"));
        listCustomer.add(new Customer("Hoan","11-03-1998","Da Nang","https://image.shutterstock.com/image-photo/white-transparent-leaf-on-mirror-260nw-1029171697.jpg"));
        listCustomer.add(new Customer("Hoan","11-03-1998","Da Nang","https://image.shutterstock.com/image-photo/white-transparent-leaf-on-mirror-260nw-1029171697.jpg"));
        request.setAttribute("listCustomer",listCustomer);
        request.getRequestDispatcher("exercise/customer_info.jsp").forward(request,response);
    }
}
