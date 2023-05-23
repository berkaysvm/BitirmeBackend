package com.example.backend.dto;

import com.example.backend.entities.ProductEntity;
import lombok.Getter;

import javax.swing.plaf.PanelUI;
import java.util.List;
@Getter
public class BrandDto {
    private int id;
    private String name;
    private List<ProductEntityDto> productEntityDtos;

    public BrandDto(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.productEntityDtos = builder.productEntityDtos;
    }


    public static class Builder
    {
        private int id;
        private String name;
        private List<ProductEntityDto> productEntityDtos;


        public Builder(){}

        public static Builder brandDtoBuilderWith()
        {
            return new Builder();
        }

        public Builder id(Integer id){this.id = id; return this;}
        public Builder name(String name){this.name=name; return this;}
        public  Builder productEntityDto(List<ProductEntity> productEntityList){this.productEntityDtos = productEntityDtos; return this;}

        public BrandDto build(){return new BrandDto(this)


                ;}
    }
}
