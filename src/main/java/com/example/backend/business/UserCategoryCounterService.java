package com.example.backend.business;

import com.example.backend.dto.UserCategoryCounterDto;
import com.example.backend.entities.UserCategoryCounter;

public interface UserCategoryCounterService {
    UserCategoryCounterDto save(UserCategoryCounterDto userCategoryCounterDto);
}
