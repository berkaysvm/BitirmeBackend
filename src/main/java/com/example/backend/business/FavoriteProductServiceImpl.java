package com.example.backend.business;

import com.example.backend.dto.ProductEntityDto;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FavoriteProductServiceImpl implements FavoriteProductService{

    @Override
    public List<ProductEntityDto> getListById(Long id) {

        return null;
    }
}
