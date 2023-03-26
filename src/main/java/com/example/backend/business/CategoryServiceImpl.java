package com.example.backend.business;

import com.example.backend.dto.CategoryEntityDto;
import com.example.backend.mapper.CategoryMapper;
import com.example.backend.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@NoArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryMapper categoryMapper;
    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryMapper categoryMapper, CategoryRepository categoryRepository) {
        this.categoryMapper = categoryMapper;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public String save(CategoryEntityDto categoryEntityDto) {

        categoryRepository.save(categoryMapper.convertEntitiy(categoryEntityDto));
        return null;
    }

    @Override
    public CategoryEntityDto get(Integer id) {
        return categoryMapper.map(categoryRepository.getReferenceById(id));
    }
}
