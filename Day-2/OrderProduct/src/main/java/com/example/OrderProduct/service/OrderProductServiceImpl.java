package com.example.OrderProduct.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OrderProduct.model.OrderProductDetails;
import com.example.OrderProduct.repository.OrderProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class OrderProductServiceImpl implements OrderProductService {
	
    @Autowired
    public OrderProductRepository repository;

    @Override
    public List<OrderProductDetails> getAll() {
        return repository.findAll();
    }

    @Override
    public OrderProductDetails getById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public String addOrder(OrderProductDetails order) {
        repository.save(order);
        return "Order added Successfully";
    }

    @Override
    public String updateOrder(int id, OrderProductDetails order) {
        Optional<OrderProductDetails> container = repository.findById(id);
        if (container.isPresent()) {
            OrderProductDetails c = container.get();
            c.setProductName(order.getProductName());
            c.setQuantity(order.getQuantity());
            repository.save(c);
            return "OrderDetails Updated";
        } else {
            return "OrderDetails not Found";
        }

    }

    @Override
    public String deleteOrder(int id) {
        Optional<OrderProductDetails> container = repository.findById(id);
        if (container.isPresent()) {
            OrderProductDetails c = container.get();

            repository.delete(c);
            return "OrderDetails Deleted";
        } else {
            return "OrderDetails not Found";
        }

    }
}