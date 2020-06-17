package com.codegym.repository;

import com.codegym.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductRepositoryImpl implements ProductRepository {

    public static Map<Integer,Product> productList = new HashMap<>();

    static {
        productList.put(1,new Product(1,"iphone X","ip1232","12/12/2020"));
        productList.put(2,new Product(2,"iphone Xs","ip09342","15/07/2021"));
        productList.put(3,new Product(3,"iphone 7","ip095424","09/06/2022"));
        productList.put(4,new Product(4,"iphone 7plus","ip09542","12/06/2023"));
        productList.put(5,new Product(5,"iphone 8","ip012323","03/10/2024"));
        productList.put(6,new Product(6,"iphone 11 pro","ip056523","25/11/2020"));
        productList.put(7,new Product(7,"iphone 6","ip05314","12/02/2019"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productList.values());
    }

    @Override
    public Product findById(int id) {
        return productList.get(id);
    }

    @Override
    public void save(Product product) {
        productList.put(product.getId(),product);
    }

    @Override
    public void update(int id, Product product) {
            productList.put(id,product);
    }

    @Override
    public void remove(int id) {
        productList.remove(id);
    }
}
