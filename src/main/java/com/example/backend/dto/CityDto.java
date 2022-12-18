package com.example.backend.dto;

import com.example.backend.entities.UserInformation;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class CityDto {
    private int id;
    private String name;
    private List<UserEntityDto> userEntityDtos;

    public CityDto(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.userEntityDtos = builder.userEntityDtos;
    }
    public static class Builder
    {
        private int id;
        private String name;
        private List<UserEntityDto> userEntityDtos;

        public Builder(){};
        public static Builder cityBuilderWith(){return new Builder();}

        public Builder id(Integer id){this.id=id; return this;}
        public Builder name(String name){this.name = name; return this;}
        public Builder userEntityDto(List<UserEntityDto> userEntityDtos){this.userEntityDtos = userEntityDtos; return this;}

        public CityDto build(){return new CityDto(this);}
    }
}
