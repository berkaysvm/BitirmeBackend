package com.example.backend.business;

import com.example.backend.dto.CityDto;
import com.example.backend.mapper.CityMapper;

import java.util.List;

public class CityServiceImpl implements CityService{

    private CityMapper cityMapper;

    public CityServiceImpl(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }

    @Override
    public List<CityDto> getCity(Integer id) {
        return null;
    }

    @Override
    public CityDto save(CityDto cityDto) {

        return null;
    }

    @Override
    public String delete(Integer id) {
        return null;
    }
}
