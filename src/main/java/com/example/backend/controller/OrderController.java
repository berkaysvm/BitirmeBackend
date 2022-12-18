package com.example.backend.controller;

import com.example.backend.business.OrderService;
import com.example.backend.dto.OrderEntityDto;
import com.example.backend.repository.OrderEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.RecursiveTask;

@RestController
@RequestMapping("/order")
public class OrderController {

    private OrderService orderService;
    private OrderEntityRepository orderEntityRepository;

    @Autowired
    public OrderController(OrderService orderService , OrderEntityRepository orderEntityRepository) {
        this.orderService = orderService;
        this.orderEntityRepository = orderEntityRepository;
    }
    @PostMapping("/save")
    public OrderEntityDto save(@RequestBody OrderEntityDto orderEntityDto)

    {
        return orderService.save(orderEntityDto);
    }
}
