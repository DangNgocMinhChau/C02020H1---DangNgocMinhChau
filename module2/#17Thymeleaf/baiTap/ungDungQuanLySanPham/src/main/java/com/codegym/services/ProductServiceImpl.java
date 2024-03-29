package com.codegym.services;

import com.codegym.model.Product;
import com.codegym.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public void save(Product product) {
            productRepository.save(product);
    }

    @Override
    public void update(int id, Product product) {
            productRepository.update(id,product);
    }

    @Override
    public void remove(int id) {
            productRepository.remove(id);
    }
}
