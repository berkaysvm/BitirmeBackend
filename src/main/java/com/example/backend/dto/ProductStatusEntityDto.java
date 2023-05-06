package com.example.backend.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.criteria.CriteriaBuilder;
@Setter
@Getter
@NoArgsConstructor
public class ProductStatusEntityDto {

    private int id;
    private String status;

    public ProductStatusEntityDto(Builder builder) {

        this.status = builder.status;
        this.id = builder.id;
    }


    public static class Builder
    {
        private int id;
        private String status;


        public Builder(){}

        public static Builder productStatusDtoWith(){return new Builder();}

        public Builder id(Integer id){this.id=id; return this;}
        public Builder status(String status){this.status=status; return this;}

        public ProductStatusEntityDto build(){return new ProductStatusEntityDto(this);}
    }


}
