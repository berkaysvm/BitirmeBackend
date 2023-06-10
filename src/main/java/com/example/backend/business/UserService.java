package com.example.backend.business;

import com.example.backend.dto.UserEntityDto;
import com.example.backend.entities.UserInformation;

import java.util.List;

public interface UserService {

    UserEntityDto save(UserEntityDto userEntityDto);
    List<UserEntityDto> getAll();
    UserEntityDto getById(Long id);

    UserInformation getOneByUsereMail(String userName);

    UserInformation saveOneUser(UserInformation userInformation);
}
