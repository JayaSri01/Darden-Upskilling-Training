package com.example.OrderProduct.service;

import java.util.List;

import com.example.OrderProduct.model.OrderProductDetails;

public interface OrderProductService {
    public List<OrderProductDetails> getAll();
    public OrderProductDetails getById(int id);
    public String addOrder(OrderProductDetails order);
    public String updateOrder(int id,OrderProductDetails order);
    public String deleteOrder(int id);

}
