package com.example.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryEntityDto {

    private int id;
    private String categoryName;
   // private List<SubCategoryDto> subCategoryList;

    public CategoryEntityDto(Builder builder) {
        this.id = builder.id;
        this.categoryName = builder.categoryName;
        //this.subCategoryList = builder.subcategoryDtoList;
    }

    public static class Builder
    {
        private int id;
        private String categoryName;
       // private List<SubCategoryDto> subcategoryDtoList;

        public Builder(){}
        public static Builder CatergoryEntityDtoBuilderWith()
        {
            return new Builder();
        }

        public Builder id(int id){this.id = id ; return this;}
        public Builder categoryName(String categoryName){this.categoryName = categoryName; return this;}
        //public Builder subcategoryDtoList(List<SubCategoryDto> subcategoryDtoList){this.subcategoryDtoList = subcategoryDtoList; return this;}

        public CategoryEntityDto build(){return new CategoryEntityDto(this);}
    }
}
