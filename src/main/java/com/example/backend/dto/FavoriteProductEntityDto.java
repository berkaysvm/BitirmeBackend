package com.example.backend.dto;

import com.example.backend.entities.FavoriteProductEntity;
import com.example.backend.entities.ProductEntity;
import com.example.backend.entities.UserInformation;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.Stack;

@Getter
@Setter
@Component
public class FavoriteProductEntityDto {

    private Long id;
    private UserEntityDto userEntityDto;
    private ProductEntityDto productEntityDto;

    public FavoriteProductEntityDto(Builder builder) {

        this.id=builder.id;
        this.productEntityDto=builder.productEntityDto;
        this.userEntityDto = builder.userEntityDto;
    }


    public static class Builder{
        private Long id;
        private UserEntityDto userEntityDto;
        private ProductEntityDto productEntityDto;

        public Builder(){}

        public static Builder favoriteProductEntityDto(){return new Builder();}

        public Builder id(Long id){this.id=id; return this;}
        public Builder userEntityDto(UserEntityDto userEntityDto){this.userEntityDto=userEntityDto; return  this;}
        public Builder productEntityDto(ProductEntityDto productEntityDto){this.productEntityDto = productEntityDto; return this;}

        public FavoriteProductEntityDto build(){return new FavoriteProductEntityDto(this);}



    }
}