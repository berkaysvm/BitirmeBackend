package com.example.backend.business;

import com.example.backend.dto.FavoriteProductEntityDto;
import com.example.backend.dto.ProductEntityDto;
import com.example.backend.mapper.FavoriteproductMapper;
import com.example.backend.repository.FavoriteProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FavoriteProductServiceImpl implements FavoriteProductService{

    private FavoriteProductRepository favoriteProductRepository;
    private FavoriteproductMapper favoriteproductMapper;

    public FavoriteProductServiceImpl(FavoriteProductRepository favoriteProductRepository) {
        this.favoriteProductRepository = favoriteProductRepository;
       // this.favoriteproductMapper = favoriteproductMapper;
    }

    @Override
    public List<ProductEntityDto> getListById(Long id) {

        return null;
    }

    @Override
    public String delete(Long id)
    {
        favoriteProductRepository.deleteById(id);
        return "silindi";
    }

    @Override
    public List<FavoriteProductEntityDto> getFavoriteProductList(Long id) {
        return null;
    }

    @Override
    public FavoriteProductEntityDto save(FavoriteProductEntityDto favoriteProductEntityDto) {
        return null;
    }
}
