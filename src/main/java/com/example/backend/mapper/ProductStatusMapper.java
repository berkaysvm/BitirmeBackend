package com.example.backend.mapper;

import com.example.backend.dto.ProductEntityDto;
import com.example.backend.dto.ProductStatusEntityDto;
import com.example.backend.entities.ProductEntity;
import com.example.backend.entities.ProductStatus;

public class ProductStatusMapper {

    public ProductStatus convertEntity(ProductStatusEntityDto productStatusEntityDto)
    {
        ProductStatus productStatus = new ProductStatus();
        productStatus.setId(productStatusEntityDto.getId());
       return  productStatus;

    }
    public ProductStatusEntityDto map(ProductStatus productStatus)
    {
        return ProductStatusEntityDto.Builder.productStatusDtoWith()
                .id(productStatus.getId())
                .status(productStatus.getStatus()).build();
    }

}
