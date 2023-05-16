package com.example.backend.mapper;

import com.example.backend.dto.FavoriteProductEntityDto;
import com.example.backend.dto.OrderEntityDto;
import com.example.backend.entities.FavoriteProductEntity;
import com.example.backend.entities.OrderEntity;

public class FavoriteproductMapper {
    public FavoriteProductEntity convertEntity(FavoriteProductEntityDto favoriteProductEntityDto)
    {
        FavoriteProductEntity favoriteProductEntity = new FavoriteProductEntity();
        favoriteProductEntity.setId(favoriteProductEntityDto.getId());
        //favoriteProductEntity.setUser(favoriteProductEntityDto.getUserEntityDto())
        return favoriteProductEntity;
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
