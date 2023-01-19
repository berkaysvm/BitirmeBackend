package com.example.backend.business;

import com.example.backend.dto.CityDto;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
public interface CityService {
    List<CityDto> getCity(Integer id);

    CityDto save(CityDto cityDto);

    String delete(Integer id) throws Exception;

}
