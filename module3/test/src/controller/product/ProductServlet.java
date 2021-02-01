package controller.product;

import model.entity.Customer;
import model.entity.Product;
import service.IProduct;
import service.impl.ProductImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet" , urlPatterns = "/product")
public class ProductServlet extends HttpServlet {
    IProduct productService = new ProductImpl();
    protected void listProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> productList = productService.getAllProduct();
        request.setAttribute("productList",productList);
        request.setAttribute("path","product");
        request.getRequestDispatcher("jsp/product/list.jsp").forward(request,response);
    }
    protected void viewProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = productService.getProduct(id);
        request.setAttribute("product",product);
        request.getRequestDispatcher("jsp/customer/view.jsp").forward(request,response);
    }
    protected void searchProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        List<Product> productList = name == null ? productService.getAllProduct() : productService.searchProductByName(name);
        request.setAttribute("path","product");
        request.setAttribute("productList",productList);
        request.getRequestDispatcher("jsp/product/list.jsp").forward(request,response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
//                createOrEditCustomer(request, response, action);
                break;
            case "edit":
//                createOrEditCustomer(request, response, action);
                break;
            case "search":
                searchProduct(request, response);
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
//                viewCustomer(request, response);
                break;
            case "delete":
//                deleteCustomer(request, response);
                break;
            case "create":
//                viewCreate_Edit(request,response,"create");
                break;
            case "edit":
//                viewCreate_Edit(request,response,"edit");
                break;
            default:
                listProduct(request, response);
                break;
        }
    }
}
