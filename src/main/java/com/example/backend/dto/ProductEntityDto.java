package com.example.backend.dto;

import com.example.backend.entities.BrandEntity;
import com.example.backend.entities.FavoriteProductEntity;
import com.example.backend.entities.SizeEntity;
import lombok.Getter;

import java.util.Date;
import java.util.List;

@Getter
public class ProductEntityDto {
    private Long id;

    private String name;
    private String color;
    private String explanation;
    private String price;
    //private List image;
    private SizeDto size;
    private BrandDto brandDto;
    private ProductStatusEntityDto durum;
    private String location;
    private SubCategoryDto category;
    private Date date;
    private Long favoriteCounter;
    private Long clickCounter;
    private UserEntityDto user;
    private List<FavoriteProductEntityDto> favoriteProductEntityDtos;

    public ProductEntityDto(Builder builder) {

        this.durum=builder.durum;
        this.id = builder.id;
        this.color = builder.color;
        this.name = builder.name;
        this.size = builder.size;
        this.category = builder.category;
        this.clickCounter = builder.clickCounter;
        this.date = builder.date;
        this.explanation = builder.explanation;
        this.brandDto = builder.brandDto;
        this.favoriteCounter = builder.favoriteCounter;
        this.location = builder.location;
        this.price = builder.price;
        this.user = builder.user;
        this.favoriteProductEntityDtos=builder.favoriteProductEntityDtos;
    }


    public static class Builder
    {
        private Long id;
        private String name;
        private String color;
        private String explanation;

        private String price;
        //private List image;
        private SizeDto size;
        private BrandDto brandDto;
        private ProductStatusEntityDto durum;
        private String location;
        private SubCategoryDto category;
        private Date date;
        private Long favoriteCounter;
        private Long clickCounter;
        private UserEntityDto user;
        private List<FavoriteProductEntityDto> favoriteProductEntityDtos;

        public Builder(){}
        public static Builder ProductEntityBuilderWith(){return new Builder();}

        public Builder id(Long id){this.id=id; return this;}
        public Builder name(String name){this.name = name; return this;}
        public Builder explantion(String explanation){this.explanation =explanation; return this;}
        public Builder color(String color){this.color = color; return this;}
        public Builder price(String price){this.price = price; return this;}
        public Builder size(SizeDto size){this.size = size; return this;}
        public Builder marka(BrandDto brandDto){this.brandDto = brandDto; return this;}
        public Builder durum(ProductStatusEntityDto productStatusDto){this.durum=durum; return this; }
        public Builder favoriteProductEntityDtos(List<FavoriteProductEntityDto> favoriteProductEntityDtos){this.favoriteProductEntityDtos = favoriteProductEntityDtos; return this;}

        public ProductEntityDto build(){return new ProductEntityDto(this);}

    }


}
