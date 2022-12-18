package com.example.backend.business;

import com.example.backend.dto.OrderEntityDto;
import com.example.backend.mapper.OrderEntityMapper;
import com.example.backend.repository.OrderEntityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private OrderEntityRepository orderEntityRepository;
    private OrderEntityMapper orderEntityMapper;

    public OrderServiceImpl(OrderEntityRepository orderEntityRepository, OrderEntityMapper orderEntityMapper) {
        this.orderEntityRepository = orderEntityRepository;
        this.orderEntityMapper = orderEntityMapper;
    }

    @Override
    public OrderEntityDto save(OrderEntityDto orderEntityDto) {
        orderEntityRepository.save(orderEntityMapper.convertEntity(orderEntityDto));
        return null;
    }

    @Override
    public OrderEntityDto get(Long id) {
        return null;
    }

    @Override
    public List<OrderEntityDto> getAll() {
        return null;
    }

    @Override
    public String delete(Long id) {
        return null;
    }
}
