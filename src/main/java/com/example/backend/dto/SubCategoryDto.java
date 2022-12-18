package com.example.backend.dto;

import com.example.backend.entities.ProductEntity;
import lombok.Getter;

import java.util.List;
@Getter
public class SubCategoryDto {
    private int id;
    private CategoryEntityDto categoryEntityDto;
    private String subCategoryName;
    private List<ProductEntityDto> productEntityList;

    public SubCategoryDto(Builder builder) {
        this.id = builder.id;
        this.subCategoryName = builder.subCategoryName;
        this.categoryEntityDto = builder.categoryEntityDto;
        this.productEntityList = builder.productEntityList;

    }



    public static class Builder
    {
        private int id;
        private CategoryEntityDto categoryEntityDto;
        private String subCategoryName;
        private List<ProductEntityDto> productEntityList;

        public Builder(){}

        public static Builder SubCategoryBuilderWith(){return new Builder();}

        public Builder id(int id){this.id=id; return this;}
        public Builder categoryEntityDto(CategoryEntityDto categoryEntityDto){this.categoryEntityDto = categoryEntityDto; return this;}
        public Builder subCategoryName(String subCategoryName){this.subCategoryName=subCategoryName; return this;}
        public Builder productEntityList(List<ProductEntityDto> productEntityList){this.productEntityList = productEntityList; return this;}

        public SubCategoryDto build(){return new SubCategoryDto(this);}



    }

}
