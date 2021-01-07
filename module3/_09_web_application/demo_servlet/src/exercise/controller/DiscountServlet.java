package exercise.controller;

import exercise.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DiscountServlet",urlPatterns ="/display-discount")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String name = request.getParameter("name");
    String listPriceAsString = request.getParameter("listPrice");
    String percentAsString = request.getParameter("percent");
    Double listPrice = Double.parseDouble(request.getParameter("listPrice"));
    Integer percent = Integer.parseInt(request.getParameter("percent"));
    Product product = new Product(name,listPriceAsString,percentAsString);
    Double discountAmount = listPrice * percent * 0.01  ;
    Double discountPrice = listPrice - discountAmount ;
    request.setAttribute("product",product);
    request.setAttribute("discountAmount",discountAmount);
    request.setAttribute("discountPrice",discountPrice);
    request.getRequestDispatcher("exercise/product/getInfoProduct.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.getRequestDispatcher("exercise/product/index.jsp").forward(request,response);
    }
}
