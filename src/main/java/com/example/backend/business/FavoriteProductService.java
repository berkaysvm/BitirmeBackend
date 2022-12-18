package com.example.backend.business;

import com.example.backend.dto.ProductEntityDto;
import com.example.backend.entities.ProductEntity;

import java.util.List;

public interface FavoriteProductService {

    List<ProductEntityDto> getListById(Long id);
}
