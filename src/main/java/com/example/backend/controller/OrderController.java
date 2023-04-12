package com.example.backend.controller;

import com.example.backend.business.OrderService;
import com.example.backend.dto.OrderEntityDto;
import com.example.backend.repository.OrderEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.RecursiveTask;

@RestController
@RequestMapping("/order")
public class OrderController {

    private OrderService orderService;


    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;

    }
    @PostMapping("/save")
    public OrderEntityDto save(@RequestBody OrderEntityDto orderEntityDto)
    {
        return orderService.save(orderEntityDto);
    }
    @GetMapping("/getid")
    public OrderEntityDto get(@RequestParam Long id)
    {
        return orderService.get(id);
    }

    @DeleteMapping("/delete")
    public String delete(@RequestParam Long id)
    {
        return orderService.delete(id);
    }
}
