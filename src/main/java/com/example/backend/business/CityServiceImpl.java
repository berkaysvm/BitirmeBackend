package com.example.backend.business;

import com.example.backend.dto.CityDto;
import com.example.backend.mapper.CityMapper;
import com.example.backend.repository.CityRepository;
import java.util.*;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityServiceImpl implements CityService{

    private CityMapper cityMapper;
    private CityRepository cityRepository;

    public CityServiceImpl(CityMapper cityMapper, CityRepository cityRepository) {
        this.cityMapper = cityMapper;
        this.cityRepository = cityRepository;
    }

    @Override
    public List<CityDto> getCity(Integer id) {

        return null;
    }

    @Override
    public CityDto save(CityDto cityDto) {

        return cityMapper.map(cityRepository.save(cityMapper.convertEntity(cityDto)));
    }

    @Override
    public String delete(Integer id)  {
            cityRepository.deleteById(id);
            return "silindi";
    }



    }

