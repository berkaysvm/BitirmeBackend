package com.example.backend.mapper;

import com.example.backend.dto.BrandDto;
import com.example.backend.dto.SizeDto;
import com.example.backend.entities.BrandEntity;
import com.example.backend.entities.SizeEntity;
import org.springframework.stereotype.Component;

@Component
public class BrandMapper {

    public BrandEntity convertEntity(BrandDto brandDto)
    {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setId(brandDto.getId());
        brandEntity.setName(brandDto.getName());
        return brandEntity;

    }
    public BrandDto map(BrandEntity brandEntity)
    {
        return BrandDto.Builder.brandDtoBuilderWith()
                .id(brandEntity.getId())
                .name(brandEntity.getName())
                .build();
    }
}
