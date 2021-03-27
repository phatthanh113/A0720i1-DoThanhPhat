package com.a07.demo_session_cookie.services.impl;

import com.a07.demo_session_cookie.models.Product;
import com.a07.demo_session_cookie.services.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class ProducServiceImpl implements ProductService {
    static Map<Integer,Product> productMap = new HashMap<>();
    static {
        productMap.put(1,new Product(1,"milk",50000));
        productMap.put(2,new Product(2,"sugar",240000));
    }
    @Override
    public List<Product> findAllProduct() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }
}
