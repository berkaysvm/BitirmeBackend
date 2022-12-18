package com.example.backend.business;

import com.example.backend.dto.ProductStatusEntityDto;

import java.util.List;

public interface ProductStatusService {

    ProductStatusEntityDto save(ProductStatusEntityDto productStatusEntityDto);
    List<ProductStatusEntityDto> getAll();
}
