package com.example.backend.mapper;

import com.example.backend.dto.ProductStatusEntityDto;
import com.example.backend.dto.SizeDto;
import com.example.backend.entities.ProductStatus;
import com.example.backend.entities.SizeEntity;
import org.springframework.stereotype.Component;

@Component
public class SizeMapper {
    public SizeEntity convertEntity(SizeDto sizeDto)
    {
        SizeEntity sizeEntity = new SizeEntity();
        sizeEntity.setId(sizeDto.getId());
        sizeEntity.setSizeName(sizeDto.getSizeName());
     return null;

    }
    public SizeDto map(SizeEntity sizeEntity)
    {
        return SizeDto.Builder.sizeDtoBuilderWith()
                .id(sizeEntity.getId())
                .sizeName(sizeEntity.getSizeName())
                .build();
    }

}
