package com.a07.demo_session_cookie.services;

import com.a07.demo_session_cookie.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAllProduct();
    Product findById(int id);
}
