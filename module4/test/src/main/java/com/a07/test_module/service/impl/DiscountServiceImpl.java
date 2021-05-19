package com.a07.test_module.service.impl;

import com.a07.test_module.model.entity.Discount;
import com.a07.test_module.repository.DiscountRepository;
import com.a07.test_module.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscountServiceImpl implements DiscountService {
    @Autowired
    DiscountRepository discountRepository ;
    @Override
    public List<Discount> findAll() {
        return discountRepository.findAll();
    }

    @Override
    public void save(Discount discount) {
        discountRepository.save(discount);
    }

    @Override
    public void delete(int id) {
        discountRepository.deleteById(id);
    }

    @Override
    public Discount findById(int id) {
        return discountRepository.findById(id).orElse(null);
    }

    @Override
    public List<Discount> findDiscount(String name) {
        return name.equals("") ? discountRepository.findAll() : discountRepository.findDiscount(name);
    }
}
