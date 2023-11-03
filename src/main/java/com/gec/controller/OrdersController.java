package com.gec.controller;

import com.gec.entity.Orders;
import com.gec.service.OrdersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private OrdersService OrdersService;

    @GetMapping("/")
    public List<Orders> getLists(){
        return OrdersService.getAll();
    }

}