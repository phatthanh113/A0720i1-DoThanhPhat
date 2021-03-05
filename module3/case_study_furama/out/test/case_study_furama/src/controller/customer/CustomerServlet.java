package controller.customer;

import model.entity.Customer;
import service.customer.CustomerServiceImpl;
import service.customer.ICustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CustomerServlet" ,urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    private ICustomerService customerService = new CustomerServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = null;
        try {
            customerList = customerService.getAllCustomer();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("customerList",customerList);
        request.getRequestDispatcher("jsp/customer/list.jsp").forward(request,response);
    }
}
