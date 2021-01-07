package controller;


import model.Customer;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import service.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


@WebServlet(name = "AddNewCustomerServlet",urlPatterns = "/add_customer")
public class AddNewCustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean isMultiPart = ServletFileUpload.isMultipartContent(request);
        Map<String, String> forms = new HashMap<>();
        if (isMultiPart) {
            FileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload upload = new ServletFileUpload(factory);
            List items = null;
            try {
                items = upload.parseRequest(request);
            } catch (FileUploadException e) {
                e.printStackTrace();
            }

            Iterator iterator = items.iterator();
            String image = null;
            while (iterator.hasNext()) {
                FileItem item = (FileItem) iterator.next();
                if (item.isFormField()) {
                    forms.put(item.getFieldName(), item.getString());
                } else {
                    try {
                        String itemName = item.getName();
                        image = "image\\" + itemName.substring(itemName.lastIndexOf("\\") + 1);
                        String realPath = getServletContext().getRealPath("/") + image;
                        File saveFile = new File(realPath);
                        System.out.println("Path image: " + realPath);
                        item.write(saveFile);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            String name = forms.get("name");
            String date = forms.get("date");
            String address = forms.get("address");

            Customer cus = new Customer(name, date, address, image);
            CustomerService service = new CustomerService();
            service.addCustomer(cus);
        }
        response.sendRedirect("list");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("jsp/registerCustomer.jsp").forward(request,response);
    }
}
