package com.example.ecommerce.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class EcommerceController{  
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;

// Add new categories
    @PostMapping("/categories")
    public Category createCategory(@RequestBody Category category) {
        return categoryRepository.save(category);
    }
    //Read or see all categories
    @GetMapping("/categories")
    public List<Category> getALLCategories() {
        return categoryRepository.findAll();
    }
    //Add new products
    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }
    @GetMapping("/products")
    public List<Product> getALLProducts(){
        return productRepository.findAll();
    }
}