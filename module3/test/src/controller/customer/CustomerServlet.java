package controller.customer;

import commons.regex.Regex;
import model.entity.Customer;
import model.entity.Product;
import service.ICustomer;
import service.IProduct;
import service.impl.CustomerImpl;
import service.impl.ProductImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet",urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    ICustomer customerService = new CustomerImpl();
    IProduct productService = new ProductImpl();
//    Xem danh sach customer
    protected void listCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList= customerService.getAllCustomer();
        request.setAttribute("path","customer");
        request.setAttribute("customerList",customerList);
        request.getRequestDispatcher("jsp/customer/list.jsp").forward(request,response);
    }
    protected void viewCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer= customerService.getCustomer(id);
        request.setAttribute("customer",customer);
        request.getRequestDispatcher("jsp/customer/view.jsp").forward(request,response);
    }
    protected void searchCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String name = request.getParameter("name");
       List<Customer> customerList = name == null ? customerService.getAllCustomer() : customerService.searchCustomerByName(name);
        request.setAttribute("customerList",customerList);
        request.setAttribute("path","customer");
        request.getRequestDispatcher("jsp/customer/list.jsp").forward(request,response);
    }
    protected void viewCreate_Edit(HttpServletRequest request, HttpServletResponse response, String action) throws ServletException, IOException {
        List<Product> productList = productService.getAllProduct();
        boolean temp = request.getParameter("id") == null || request.getParameter("id").equals("");
        int id = temp ? 0 : Integer.parseInt(request.getParameter("id"));
        Customer customer = customerService.getCustomer(id);
        request.setAttribute("productList",productList);
        request.setAttribute("customer",customer);
        request.setAttribute("action",action);
        request.getRequestDispatcher("jsp/customer/create_edit.jsp").forward(request,response);
    }
    protected void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        customerService.deleteCustomer(id);
        listCustomer(request,response);
    }
    protected void createOrEditCustomer(HttpServletRequest request, HttpServletResponse response , String action) throws ServletException, IOException {
        int idProduct = Integer.parseInt(request.getParameter("idProduct"));
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        Regex regex = new Regex();
//        Regex
        if(!regex.validate(name,Regex.RG_NAME)) {
            String errorName = "Bạn đã nhập sai tên";
            request.setAttribute("message",errorName);
            viewCreate_Edit(request,response,action);
            return;
        }
        if(birthday.equals("")) {
            String errorBirthday = "Bạn đã nhập sai ngay thang";
            request.setAttribute("messageBirthday",errorBirthday);
            viewCreate_Edit(request,response,action);
            return;
        }

        Customer customer = null;
        switch (action) {
            case "edit": {
                int id = Integer.parseInt(request.getParameter("id"));
                customerService.updateCustomer(new Customer(id,idProduct,name,birthday));
            }
            break;
            case "create" : {
                customerService.insertCustomer(new Customer(0,idProduct,name,birthday));
            }
            break;
        }
        listCustomer(request,response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createOrEditCustomer(request, response, action);
                break;
            case "edit":
                createOrEditCustomer(request, response, action);
                break;
            case "search":
                searchCustomer(request, response);
                break;
            default:
//                listProduct(request, response);
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
                viewCreate_Edit(request,response,action);
                break;
            case "edit":
               viewCreate_Edit(request,response,action);
                break;
            default:
                listCustomer(request, response);
                break;
        }
    }
}
