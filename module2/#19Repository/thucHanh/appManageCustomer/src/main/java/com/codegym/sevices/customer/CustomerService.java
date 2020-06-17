package com.codegym.sevices.customer;

import com.codegym.models.Customer;

public interface CustomerService {
    Iterable<Customer> findAll();
    Customer findById (Integer id);
    void save(Customer customer);
    void remove(Integer id);

}
