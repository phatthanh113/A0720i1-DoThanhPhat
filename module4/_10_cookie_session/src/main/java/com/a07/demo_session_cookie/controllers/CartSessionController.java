package com.a07.demo_session_cookie.controllers;

import com.a07.demo_session_cookie.models.Cart;
import com.a07.demo_session_cookie.models.Product;
import com.a07.demo_session_cookie.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("cart")
@RequestMapping("/cart")
public class CartSessionController {
    @Autowired
    ProductService productService ;
    @ModelAttribute("cart")
    public Cart cart() {
        return new Cart();
    }
    @GetMapping("product")
    public ModelAndView getProduct(Model model) {
        model.addAttribute("products",productService.findAllProduct());
        return new ModelAndView("products");
    }
    @GetMapping("product-view")
    public ModelAndView viewProduct(@RequestParam int id){
        return new ModelAndView("view_product","product",productService.findById(id));
    }
    @PostMapping("product")
    public ModelAndView addProduct(@ModelAttribute("product")Product product,
                                   @ModelAttribute("cart") Cart cart) {
        cart.addProduct(product);
        System.out.println(cart.getCart().get(product));
        return new ModelAndView("redirect:/cart/product");
    }
    @GetMapping("")
    public ModelAndView getCart(@ModelAttribute("cart") Cart cart,
                                Model model) {
        model.addAttribute("totalPrice",cart.getPrice());
        return new ModelAndView("cart","cart",cart);
    }
}
