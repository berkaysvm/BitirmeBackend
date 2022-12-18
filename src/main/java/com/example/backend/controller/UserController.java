package com.example.backend.controller;

import com.example.backend.business.UserService;
import com.example.backend.dto.UserEntityDto;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@NoArgsConstructor
@Component
@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/save/")
    public UserEntityDto save(@RequestBody UserEntityDto userEntityDto)
    {
        return userService.save(userEntityDto);
    }
}
