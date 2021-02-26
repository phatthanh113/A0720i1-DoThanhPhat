package controller.product;

import model.Customer;
import model.Product;
import model.ShopDTO;
import service.ICustomerService;
import service.IProductService;
import service.impl.CustomerServiceImplement;
import service.impl.ProductServiceImplement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/product")
public class ProductServlet extends HttpServlet {
    IProductService productService = new ProductServiceImplement();
    ICustomerService customerService = new CustomerServiceImplement();
    //    Hiển thị danh sách sản phầm
    protected void listProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> productList = productService.findAll();
        List<Customer> customerList = customerService.findAll();
        List<ShopDTO> shopDTOList = productService.getCustomer();
        request.setAttribute("shopDTOList",shopDTOList);
        HttpSession session = request.getSession();
//        Trả về  username
        String username = (String) session.getAttribute("username");
        request.setAttribute("username",username);
        request.setAttribute("productList", productList);
        request.setAttribute("customerList",customerList);
        request.setAttribute("customerService",customerService);
        request.getRequestDispatcher("jsp/product/list.jsp").forward(request, response);
    }

    //    Xem thong tin san pham
    protected void viewProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        request.setAttribute("product", productService.findById(id));
        request.getRequestDispatcher("jsp/product/view.jsp").forward(request, response);
    }

    //    Xoa san pham
    protected void removeProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        this.productService.remove(id);
        listProduct(request, response);
    }

    // Hiển thị màn hình edit sản phẩm
    protected void viewUpdateProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("submit", "edit");
        String id = request.getParameter("id");
        Product product = this.productService.findById(id);
        request.setAttribute("product", product);
        request.getRequestDispatcher("jsp/product/create_edit.jsp").forward(request, response);
    }

    // Hiển thị màn hình edit sản phẩm
    protected void viewCreateProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("submit", "create");
        request.setAttribute("idRandom", Math.random() * 100);
        request.getRequestDispatcher("jsp/product/create_edit.jsp").forward(request, response);
    }

    //    Sửa và thêm sản phẩm
    protected void createOrEditProduct(HttpServletRequest request, HttpServletResponse response, String path) throws ServletException, IOException {
        String message = null ;
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        if(!name.matches("^KH-[\\d]{4}$")){
            message = "Ban nhap sai";
            request.setAttribute("message",message);
            viewCreateProduct(request,response);
        }
        String price = request.getParameter("price");
        String description = request.getParameter("description");
        String producer = request.getParameter("producer");
        if (path.equals("create")) {
            this.productService.save(new Product(id, name, price, description, producer));
            listProduct(request, response);
        } else if (path.equals("edit")) {
            this.productService.update(id, new Product(id, name, price, description, producer));
            listProduct(request, response);
        }
    }

    //    Tìm kiếm sản phẩm theo tên
    protected void searchProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nameProduct = request.getParameter("nameProduct");
        List<Product> productListSearch = nameProduct == null ? productService.findAll() : productService.findByName(nameProduct);
        request.setAttribute("productListSearch", productListSearch);
        request.getRequestDispatcher("jsp/product/search.jsp").forward(request, response);
    }
//
    protected void logOut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.removeAttribute("username");
        request.getRequestDispatcher("jsp/product/login.jsp").forward(request,response);
    }
//
//    protected void getCustomerById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        List<ShopDTO> shopDTOList = productService.getCustomer();
//        request.setAttribute("shopDTOList",shopDTOList);
//        request.getRequestDispatcher("jsp/product/list.jsp").forward(request,response);
//    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createOrEditProduct(request, response, "create");
                break;
            case "edit":
                createOrEditProduct(request, response, "edit");
                break;
            case "search":
                searchProduct(request, response);
                break;
            case "searchProduct" :
                searchProduct(request,response);
                break;
            default:
                listProduct(request, response);
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
                viewProduct(request, response);
                break;
            case "delete":
                removeProduct(request, response);
                break;
            case "edit":
                viewUpdateProduct(request, response);
                break;
            case "create":
                viewCreateProduct(request, response);
                break;
            case "logout":
                logOut(request,response);
                break;
            default:
                listProduct(request, response);
                break;
        }
    }

}
