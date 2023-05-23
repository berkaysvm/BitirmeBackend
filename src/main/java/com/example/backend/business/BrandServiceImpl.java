package com.example.backend.business;

import com.example.backend.dto.BrandDto;
import com.example.backend.dto.ProductEntityDto;
import com.example.backend.mapper.BrandMapper;
import com.example.backend.repository.BrandRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class BrandServiceImpl implements BrandService{

    private BrandRepository brandRepository;
    private BrandMapper brandMapper;

    public BrandServiceImpl(BrandRepository brandRepository, BrandMapper brandMapper) {
        this.brandRepository = brandRepository;
        this.brandMapper = brandMapper;
    }

    @Override
    public BrandDto save(BrandDto brandDto) {
        return brandMapper.map(brandRepository.save(brandMapper.convertEntity(brandDto)));
    }

    @Override
    public BrandDto get(Integer id) {
        return brandMapper.map(brandRepository.getReferenceById(id));
    }

    @Override
    public List<ProductEntityDto> getBrandList(BrandDto brandDto) {
        return null;
    }
}
