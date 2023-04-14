package com.enigma.advancedexp.controller;


import com.enigma.advancedexp.entity.Product;
import com.enigma.advancedexp.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/products")
    public Product saveProduct(@RequestBody Product product){
       return productService.saveProduct(product);
    }

    @GetMapping("/products")
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable String id){
        return productService.findProduct(id);
    }
}
