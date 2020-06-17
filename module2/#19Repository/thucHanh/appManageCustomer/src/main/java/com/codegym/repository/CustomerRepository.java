package com.codegym.repository;

import com.codegym.models.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer,Integer> {
}
