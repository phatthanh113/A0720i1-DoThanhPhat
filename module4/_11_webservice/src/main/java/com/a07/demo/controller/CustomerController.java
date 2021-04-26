package com.a07.demo.controller;

import com.a07.demo.models.Customer;
import com.a07.demo.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    CustomerService customerService ;
    @GetMapping("/")
    public ResponseEntity<List<Customer>> getList() {
        return customerService.findAll().isEmpty() ?
                new ResponseEntity<>(HttpStatus.NO_CONTENT) : new ResponseEntity<>(customerService.findAll(),HttpStatus.OK) ;
    }
    @PostMapping("/create")
    public ResponseEntity<Void> addCustomer(@RequestBody Customer customer) {
        customerService.save(customer);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Customer> editCustomer(@PathVariable("id") int id, @RequestBody Customer customer) {
        if(customer == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        customerService.save(customer);
        return new ResponseEntity<>(customer,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Customer> deleteCustomer(@PathVariable("id") int id) {
        Customer customer = customerService.findById(id);
        if(customer == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        customerService.remove(id);
        return new ResponseEntity<>(customer,HttpStatus.OK);
    }
}
