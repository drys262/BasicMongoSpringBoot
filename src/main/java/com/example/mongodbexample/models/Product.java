package com.example.mongodbexample.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter @Setter @NoArgsConstructor @ToString
@Document("products")
public class Product {

  @Id
  public ObjectId _id;
  public String name;
  public double price;

  public Product(ObjectId _id, String name, double price) {
    this._id = _id;
    this.name = name;
    this.price = price;
  }

  public String get_id() {
    return _id.toHexString();
  }

  public void set_id(ObjectId _id) {
    this._id = _id;
  }
}
