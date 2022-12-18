package com.example.backend.mapper;


import com.example.backend.dto.CategoryEntityDto;
import com.example.backend.entities.CategoryEntity;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapper {
    public CategoryEntityDto map(CategoryEntity categoryEntity)
    {

        return CategoryEntityDto
                .Builder
                .CatergoryEntityDtoBuilderWith()
                .id(categoryEntity.getId())
                .categoryName(categoryEntity.getCategoryName())
                //.subcategoryDtoList(categoryEntity.getSubcategoryList())
                .build();
    }

    public CategoryEntity convertEntitiy(CategoryEntityDto categoryEntityDto)
    {
        CategoryEntity category =new CategoryEntity();
        category.setId(categoryEntityDto.getId());
        category.setCategoryName(categoryEntityDto.getCategoryName());
        return category;
    }
}
