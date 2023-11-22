package com.example.OrderProduct.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.OrderProduct.model.OrderProductDetails;

@Repository
public interface OrderProductRepository extends MongoRepository<OrderProductDetails,Integer> {

}
