package com.example.OrderProduct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.OrderProduct.model.OrderProductDetails;
import com.example.OrderProduct.service.OrderProductService;

import java.util.List;

@RestController
public class OrderProductController {
	
    @Autowired
    private OrderProductService service;

    @PostMapping("/add")
    public String addOrder(@RequestBody OrderProductDetails order){
        return service.addOrder(order);
    }
    @GetMapping("/getAll")
    public List<OrderProductDetails> getAll(){
        return service.getAll();
    }
    @GetMapping("/get/{id}")
    public OrderProductDetails getById(@PathVariable int id){
        return service.getById(id);

    }
    @PutMapping("/update/{id}")
    public String updateOrder( @PathVariable int id,@RequestBody OrderProductDetails order){
        return service.updateOrder(id,order);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteOrder(@PathVariable int id)
    {
        return service.deleteOrder(id);
    }
}
