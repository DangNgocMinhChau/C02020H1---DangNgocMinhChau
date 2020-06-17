package com.codegym.sevices;

import com.codegym.models.Customer;

public interface CustomerService {
    Iterable<Customer> findAll();
    Customer findById (Integer id);
    void save(Customer customer);
    void remove(Integer id);

}
