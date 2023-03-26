package com.example.backend.business;

import com.example.backend.dto.CategoryEntityDto;
import org.springframework.stereotype.Service;

@Service
public interface CategoryService {

    String save(CategoryEntityDto categoryEntityDto);
    CategoryEntityDto get(Integer id);
}
