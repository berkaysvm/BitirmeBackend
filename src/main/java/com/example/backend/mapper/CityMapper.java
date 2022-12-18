package com.example.backend.mapper;

import com.example.backend.dto.CategoryEntityDto;
import com.example.backend.dto.CityDto;
import com.example.backend.entities.CategoryEntity;
import com.example.backend.entities.City;
import org.springframework.stereotype.Component;

@Component
public class CityMapper {

    public City convertEntity(CityDto cityDto)
    {
        City city = new City();
        city.setId(cityDto.getId());
        city.setName(cityDto.getName());
        return city;
    }
    public CityDto map(City city)
    {
        return CityDto.Builder
                .cityBuilderWith()
                .id(city.getId())
                .name(city.getName())
                .build();
    }
}
