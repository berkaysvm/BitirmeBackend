package com.example.backend.dto;

import com.example.backend.business.UserService;
import com.example.backend.entities.UserCategoryCounter;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
@Getter
public class UserCategoryCounterDto {
    private int id;
    private UserEntityDto user;
    private int technology;
    private int clothes;
    private int accessory;
    private int sport;
    private int hobby;

    public UserCategoryCounterDto(Builder builder) {
        this.id=builder.id;
        this.accessory = builder.accessory;
        this.clothes = builder.clothes;
        this.hobby = builder.hobby;
        this.sport = builder.sport;
        this.technology = builder.technology;
        this.user = builder.user;
    }

    public static class Builder
    {
        private int id;
        private UserEntityDto user;
        private int technology;
        private int clothes;
        private int accessory;
        private int sport;
        private int hobby;

        public Builder(){}

        public static Builder userCategoryDtoWith(){
            return new Builder();
        }

        public Builder id(Integer id){this.id=id; return this;}
        public Builder technology(Integer technology){this.technology=technology; return this;}
        public Builder clothes(Integer clothes){this.clothes=clothes; return this;}
        public Builder accessory(Integer accessory){this.accessory= accessory;return this;}
        public Builder sport(Integer sport){this.sport=sport; return this;}
        public Builder hobby(Integer hobby){this.hobby = hobby; return this;}
        public Builder user(UserEntityDto user) {this.user = user; return this;}

        public UserCategoryCounterDto build(){return new UserCategoryCounterDto(this);}
    }
}
