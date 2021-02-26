package controller.customer;

import model.Customer;
import service.ICustomerService;
import service.impl.CustomerServiceImplement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.beans.IntrospectionException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    private ICustomerService customerService = new CustomerServiceImplement();
    protected void listCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = this.customerService.findAll();
        request.setAttribute("customerList", customerList);
        request.getRequestDispatcher("jsp/customer/list.jsp").forward(request, response);
    }

    protected void viewCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        Customer customer = this.customerService.findById(Integer.parseInt(id));
        request.setAttribute("customer", customer);
        request.getRequestDispatcher("jsp/customer/view.jsp").forward(request, response);
    }

    protected void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        this.customerService.remove(Integer.parseInt(id));
        listCustomer(request, response);
    }
    protected void viewEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String submit = "edit";
        String id = request.getParameter("id");
        Customer customer = this.customerService.findById(Integer.parseInt(id));
        request.setAttribute("submit",submit);
        request.setAttribute("customer", customer);
        request.getRequestDispatcher("jsp/customer/create_edit.jsp").forward(request,response);
    }
    protected void editCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        this.customerService.update(Integer.parseInt(id),new Customer(id,name,email,address));
        listCustomer(request,response);
    }
    protected void createCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        this.customerService.save(new Customer(id,name,email,address));
        listCustomer(request,response);
    }
    protected void viewCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String submit = "create";
        request.setAttribute("submit",submit);
        request.getRequestDispatcher("jsp/customer/create_edit.jsp").forward(request,response);
    }
    protected void searchCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nameCustomer = request.getParameter("nameCustomer");
        List<Customer> customerListSearch = new ArrayList<>();
        for (Customer customer: this.customerService.findAll()) {
            if(customer.getName().contains(nameCustomer)) {
                customerListSearch.add(customer);
            }
        }
        List<Customer> customerList = this.customerService.findAll();
        request.setAttribute("customerList", customerList);
        request.setAttribute("customerListSearch",customerListSearch);
        request.getRequestDispatcher("jsp/customer/list.jsp").forward(request,response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "create":
                createCustomer(request,response);
                break;
            case "edit":
                editCustomer(request,response);
                break;
            case "search":
                searchCustomer(request,response);
                break;
            default:
                listCustomer(request,response);
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "view":
                viewCustomer(request, response);
                break;
            case "delete":
                deleteCustomer(request, response);
                break;
            case "create":
                viewCreate(request,response);
                break;
            case "edit":
                viewEdit(request,response);
                break;
            default:
                listCustomer(request, response);
                break;
        }
    }
}
