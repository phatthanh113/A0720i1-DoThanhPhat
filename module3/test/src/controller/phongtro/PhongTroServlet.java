package controller.phongtro;


import commons.regex.Regex;
import model.entity.Customer;
import model.entity.Payment;
import model.entity.PhongTro;

import service.IPhongTroService;
import service.impl.PhongTroImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "PhongTroServlet" ,urlPatterns = "/phongtro")
public class PhongTroServlet extends HttpServlet {
    IPhongTroService phongTroService = new PhongTroImpl();
    protected void listPhongTro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<PhongTro> phongTroList= phongTroService.getAllPhongTro();
        request.setAttribute("path","phongtro");
        request.setAttribute("phongTroList",phongTroList);
        request.setAttribute("phongTroService",phongTroService);
        request.getRequestDispatcher("jsp/phongtro/list.jsp").forward(request,response);
    }
    protected void viewCreate_Edit(HttpServletRequest request, HttpServletResponse response, String action) throws ServletException, IOException {
        List<Payment> paymentList = phongTroService.getAllPayment();
        boolean temp = request.getParameter("id") == null || request.getParameter("id").equals("");
        int id = temp ? 0 : Integer.parseInt(request.getParameter("id"));
        PhongTro phongTro = phongTroService.getPhongTro(id);
        request.setAttribute("paymentList",paymentList);
        request.setAttribute("phongTro", phongTro);
        request.setAttribute("action",action);
        request.getRequestDispatcher("jsp/phongtro/create.jsp").forward(request,response);
    }
    protected void searchPhongTro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        List<PhongTro> phongTroList = name == null ? phongTroService.getAllPhongTro() : phongTroService.searchPhongTroByName(name);
        request.setAttribute("phongTroList",phongTroList);
        request.setAttribute("path","phongtro");
        request.getRequestDispatcher("jsp/phongtro/list.jsp").forward(request,response);
    }
    protected void deletePhongTro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        phongTroService.deletePhongTro(id);
        listPhongTro(request,response);
    }
    protected void createOrEditPhongTro(HttpServletRequest request, HttpServletResponse response , String action) throws ServletException, IOException {
        int idPayment = Integer.parseInt(request.getParameter("idPayment"));
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String date = request.getParameter("date");
        String note = request.getParameter("note");
        Regex regex = new Regex();
//        Regex
        if(!regex.validate(name,Regex.RG_NAME)) {
            String errorName = "Bạn đã nhập sai tên";
            request.setAttribute("message",errorName);
            viewCreate_Edit(request,response,action);
            return;
        }
//        if(birthday.equals("")) {
//            String errorBirthday = "Bạn đã nhập sai ngay thang";
//            request.setAttribute("messageBirthday",errorBirthday);
//            viewCreate_Edit(request,response,action);
//            return;
//        }

        PhongTro phongTro = null;
        switch (action) {
            case "edit":
//                int id = Integer.parseInt(request.getParameter("id"));
//                customerService.updateCustomer(new Customer(id,idProduct,name,birthday));
//            }
            break;
            case "create" : {
                phongTroService.insertPhongTro(new PhongTro(0,name,phone,date,idPayment,note));
            }
            break;
        }
        listPhongTro(request,response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createOrEditPhongTro(request, response, action);
                break;
            case "edit":
//                createOrEditCustomer(request, response, action);
                break;
            case "search":
                searchPhongTro(request, response);
                break;
            default:
                listPhongTro(request, response);
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {

            case "delete":
                deletePhongTro(request, response);
                break;
            case "create":
                viewCreate_Edit(request,response,action);
                break;
            case "edit":
//                viewCreate_Edit(request,response,action);
                break;
            default:
                listPhongTro(request, response);
                break;
        }
    }
}
