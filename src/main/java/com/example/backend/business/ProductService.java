package com.example.backend.business;

import com.example.backend.dto.ProductEntityDto;

public interface ProductService {

    ProductEntityDto save(ProductEntityDto productEntityDto);
    ProductEntityDto get(Long id);
    String delete(Long id);

}
