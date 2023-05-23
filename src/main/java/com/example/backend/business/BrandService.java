package com.example.backend.business;

import com.example.backend.controller.BrandController;
import com.example.backend.dto.BrandDto;
import com.example.backend.dto.ProductEntityDto;

import java.util.List;

public interface BrandService {

    BrandDto save(BrandDto brandDto);
    BrandDto get(Integer id);
    List<ProductEntityDto> getBrandList(BrandDto brandDto);
}
