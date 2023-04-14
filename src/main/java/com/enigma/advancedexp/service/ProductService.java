package com.enigma.advancedexp.service;

import com.enigma.advancedexp.entity.Product;

import java.util.List;

public interface ProductService {
    Product findProduct(String id);
    Product saveProduct(Product product);
    List<Product> getAllProduct();
}
