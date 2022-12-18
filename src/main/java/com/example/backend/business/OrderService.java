package com.example.backend.business;

import com.example.backend.dto.OrderEntityDto;
import com.example.backend.entities.OrderEntity;

import java.util.List;

public interface OrderService {

    OrderEntityDto save(OrderEntityDto orderEntityDto);
    OrderEntityDto get(Long id);
    List<OrderEntityDto> getAll();

    String delete(Long id);




}
