package vn.phatdo.my_demo_project.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.phatdo.my_demo_project.models.Cart;
import vn.phatdo.my_demo_project.repositories.ICartRepository;
import vn.phatdo.my_demo_project.repositories.IProductRepository;
import vn.phatdo.my_demo_project.services.ICartService;
@Service
public class CartServiceImpl implements ICartService {
    @Autowired
    ICartRepository cartRepository ;
    @Override
    public Page<Cart> findAll(Pageable pageable) {
        return cartRepository.findAll(pageable);
    }

    @Override
    public void save(Cart cart) {
        cartRepository.save(cart);
    }

    @Override
    public void delete(int id) {
        cartRepository.deleteById(id);
    }

    @Override
    public Cart findById(int id) {
       return cartRepository.findById(id).orElse(null);
    }
}
