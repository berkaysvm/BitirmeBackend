package com.example.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntityDto {
    private Long id;
    private String name;
    private String lastname;
    private String phoneNumber;
    private String address1;
    private String adress2;
    private CityDto city;
    private String postaKodu;
    private String eMail;
    private String password;
    private String location;
    private int age;

    public UserEntityDto(Builder builder) {
        this.id=builder.id;
        this.name=builder.name;
        this.lastname=builder.lastname;
        this.age= builder.age;
        this.phoneNumber = builder.phoneNumber;
        this.address1 = builder.address1;
        this.adress2 = builder.adress2;
        this.city = builder.city;
        this.postaKodu=builder.postaKodu;
        this.eMail= builder.eMail;
        this.password = builder.password;
        this.location = builder.location;
    }

    public static class Builder
    {
        private Long id;
        private String name;
        private String lastname;
        private String phoneNumber;
        private String address1;
        private String adress2;
        private CityDto city;
        private String postaKodu;
        private String eMail;
        private String password;
        private String location;
        private int age;

        public Builder(){};

        public static Builder UserEntityBuilderWith(){ return new Builder();}

        public Builder id(Long id){this.id=id; return this;}
        public Builder name(String name){this.name=name; return this;}
        public Builder lastname(String lastname){this.lastname=lastname; return this;}
        public Builder age(Integer age) {this.age = age; return this;}
        public Builder phoneNumber(String phoneNumber){this.phoneNumber = phoneNumber;  return this;}
        public Builder adress1(String address1){this.address1 = address1;  return this;}

        public Builder adress2(String adress){this.adress2 = adress2; return this;}
        public Builder city(CityDto city){this.city = city; return this;}
        public Builder postaKodu(String postaKodu){this.postaKodu = postaKodu;  return this;}
        public Builder eMail(String eMail){this.eMail = eMail;  return this;}
        public Builder password(String password){this.password= password;  return this;}
        public Builder location(String location){this.location = location;  return this;}

        public UserEntityDto build(){return new UserEntityDto(this);}



    }




}
