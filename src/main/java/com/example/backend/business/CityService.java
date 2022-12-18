package com.example.backend.business;

import com.example.backend.dto.CityDto;

import java.util.List;

public interface CityService {
    List<CityDto> getCity(Integer id);

    CityDto save(CityDto cityDto);

    String delete(Integer id);

}
