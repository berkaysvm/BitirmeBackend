package com.example.backend.mapper;

import com.example.backend.dto.OrderEntityDto;
import com.example.backend.entities.OrderEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component
public class OrderEntityMapper {

    public OrderEntity convertEntity(OrderEntityDto orderEntityDto)
    {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setId(orderEntityDto.getId());
        orderEntity.setDate(orderEntityDto.getDate());
        orderEntity.setStatus(orderEntityDto.getStatus());
        return orderEntity;
    }
    public OrderEntityDto map(OrderEntity orderEntity)
    {
        return OrderEntityDto.Builder.orderEntityBuilderWith()
                .id(orderEntity.getId())
                .date(orderEntity.getDate())
                .status(orderEntity.getStatus())
                .build();
    }
}
