package com.example.mongodbexample.controller;


import com.example.mongodbexample.models.Product;
import com.example.mongodbexample.repository.ProductRepository;
import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

  @Autowired
  private ProductRepository productRepository;


  @GetMapping
  public List<Product> getProducts() {
    return productRepository.findAll();
  }

  @GetMapping("/{id}")
  public Product getProductById(@PathVariable ObjectId id) {
    return productRepository.findBy_id(id);
  }

}
