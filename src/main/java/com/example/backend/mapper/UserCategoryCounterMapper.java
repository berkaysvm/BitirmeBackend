package com.example.backend.mapper;

import com.example.backend.dto.SizeDto;
import com.example.backend.dto.UserCategoryCounterDto;
import com.example.backend.entities.SizeEntity;
import com.example.backend.entities.UserCategoryCounter;
import org.springframework.stereotype.Component;

@Component
public class UserCategoryCounterMapper {
    UserMapper userMapper = new UserMapper();


    public UserCategoryCounter convertEntity(UserCategoryCounterDto userCategoryCounterDto)
    {

        UserCategoryCounter userCategoryCounter = new UserCategoryCounter();

        userCategoryCounter.setId(userCategoryCounterDto.getId());
        userCategoryCounter.setAccessory(userCategoryCounterDto.getAccessory());
        userCategoryCounter.setClothes(userCategoryCounterDto.getClothes());
        userCategoryCounter.setHobby(userCategoryCounterDto.getHobby());
        userCategoryCounter.setSport(userCategoryCounterDto.getSport());
        userCategoryCounter.setTechnology(userCategoryCounterDto.getTechnology());
        userCategoryCounter.setUser(userMapper.convertEntity(userCategoryCounterDto.getUser()));
        return userCategoryCounter;
    }
    public UserCategoryCounterDto map(UserCategoryCounter userCategoryCounter)
    {
        return UserCategoryCounterDto.Builder.userCategoryDtoWith()
                .id(userCategoryCounter.getId())
                .accessory(userCategoryCounter.getAccessory())
                .clothes(userCategoryCounter.getClothes())
                .hobby(userCategoryCounter.getHobby())
                .sport(userCategoryCounter.getSport())
                .user(userMapper.map(userCategoryCounter.getUser()))
                .build();
    }
}
