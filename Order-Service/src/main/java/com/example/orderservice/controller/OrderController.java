package com.example.orderservice.controller;

import com.example.orderservice.entity.Order;
import com.example.orderservice.service.orderservice;
import com.example.orderservice.valueObject.ResponseValueObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private orderservice orderservice;

    @PostMapping("/")
    public Order saveOrder(@RequestBody Order order){
        return orderservice.saveOrder(order);
    }

    @GetMapping("/{id}")
    public ResponseValueObject findOrderById(@PathVariable String id){
        return orderservice.getUserWithDepartment(id);
    }
}
