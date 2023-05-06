package com.example.backend.business;

import com.example.backend.dto.ProductEntityDto;
import com.example.backend.mapper.ProductMapper;
import com.example.backend.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    private ProductMapper productMapper;
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductMapper productMapper, ProductRepository productRepository) {
        this.productMapper = productMapper;
        this.productRepository = productRepository;
    }

    @Override
    public ProductEntityDto save(ProductEntityDto productEntityDto) {
        return productMapper.map(productRepository.save(productMapper.convertEntity(productEntityDto)));
    }

    @Override
    public ProductEntityDto get(Long id) {

        return productMapper.map(productRepository.getReferenceById(id));
    }

    @Override
    public String delete(Long id) {
        productRepository.deleteById(id);
        return "Ürün silindi";
    }
}
