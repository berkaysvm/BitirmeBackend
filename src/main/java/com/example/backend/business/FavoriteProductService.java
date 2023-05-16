package com.example.backend.business;

import com.example.backend.dto.FavoriteProductEntityDto;
import com.example.backend.dto.ProductEntityDto;
import com.example.backend.entities.ProductEntity;

import java.util.List;

public interface FavoriteProductService {

    List<ProductEntityDto> getListById(Long id);

    String delete(Long id);

    List<FavoriteProductEntityDto> getFavoriteProductList(Long id);

    FavoriteProductEntityDto save(FavoriteProductEntityDto favoriteProductEntityDto);
}
