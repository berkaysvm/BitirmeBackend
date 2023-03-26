package com.example.backend.mapper;

import com.example.backend.dto.UserEntityDto;
import com.example.backend.entities.UserInformation;
import org.apache.catalina.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserMapper {
    public UserInformation convertEntity(UserEntityDto userEntityDto)
    {
        CityMapper cityMapper = new CityMapper();
        UserInformation userInformation = new UserInformation();
        userInformation.setId(userEntityDto.getId());
        userInformation.setName(userEntityDto.getName());
        userInformation.setLastname(userEntityDto.getLastname());
        userInformation.setCity(cityMapper.convertEntity(userEntityDto.getCity()));
        userInformation.setEMail(userEntityDto.getEMail());
        userInformation.setLocation(userEntityDto.getLocation());
        userInformation.setPassword(userEntityDto.getPassword());
        userInformation.setAddress1(userEntityDto.getAddress1());
        userInformation.setAdress2(userEntityDto.getAdress2());
        userInformation.setPostaKodu(userEntityDto.getPostaKodu());
        userInformation.setAge(userEntityDto.getAge());
        return userInformation;
    }
    public List<UserEntityDto> maplist(List<UserInformation> userInformation) {
        List<UserEntityDto> returnList =new ArrayList<>();
        for (UserInformation userInformation1: userInformation)
        {
            returnList.add(map(userInformation1));
        }
        return returnList;
    }

    public UserEntityDto map(UserInformation userInformation)
    {
        CityMapper cityMapper = new CityMapper();
        return UserEntityDto
                .Builder
                .UserEntityBuilderWith()
                .id(userInformation.getId())
                .age(userInformation.getAge())
                .adress1(userInformation.getAddress1())
                .adress2(userInformation.getAdress2())
                .city(cityMapper.map(userInformation.getCity()))
                .eMail(userInformation.getEMail())
                .name(userInformation.getName())
                .lastname(userInformation.getLastname())
                .location(userInformation.getLocation())
                .phoneNumber(userInformation.getPhoneNumber())
                .password(userInformation.getPassword())
                .postaKodu(userInformation.getPostaKodu()).build();
    }
}
