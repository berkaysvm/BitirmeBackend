package com.example.backend.business;

import com.example.backend.dto.SizeDto;
import com.example.backend.mapper.SizeMapper;
import org.springframework.stereotype.Service;

@Service
public class SizeServiceImpl implements SizeService{

    SizeMapper sizeMapper = new SizeMapper();




    @Override
    public SizeDto save(SizeDto sizeDto) {
        return null;
    }
}
