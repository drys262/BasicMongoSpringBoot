package com.example.mongodbexample.repository;

import com.example.mongodbexample.models.Product;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

  Product findBy_id(ObjectId id);
}
