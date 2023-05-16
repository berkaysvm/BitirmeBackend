package com.example.backend.business;

import com.example.backend.dto.UserEntityDto;
import com.example.backend.mapper.UserMapper;
import com.example.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{

    UserRepository userRepository;
    UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public UserEntityDto save(UserEntityDto userEntityDto) {

        userRepository.save(userMapper.convertEntity(userEntityDto));
        return null;
    }

    @Override
    public List<UserEntityDto> getAll() {
        return userMapper.maplist(userRepository.findAll());
    }

    @Override
    public UserEntityDto getById(Long id) {
        return userMapper.map(userRepository.getReferenceById(id));
    }
}
