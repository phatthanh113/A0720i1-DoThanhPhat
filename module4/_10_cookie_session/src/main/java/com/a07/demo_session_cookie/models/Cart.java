package com.a07.demo_session_cookie.models;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@NoArgsConstructor
public class Cart  {
    private Map<Product,Integer> cart = new HashMap<>() ;
    public Map<Product,Integer> getCart() {
        return cart;
    }


    public List<Product> findAllProduct() {
        return new ArrayList<>(cart.keySet());
    }

    public void addProduct(Product product) {
        if(cart.containsKey(product)){
            int key = cart.get(product);
            cart.put(product,++key);
        }else {
            cart.put(product,1);
        }
    }
    public long getPrice() {
        long price = 0;
        for (Product product: cart.keySet()) {
            price+=product.getPrice()*cart.get(product);
        }
        return price;
    }
}
