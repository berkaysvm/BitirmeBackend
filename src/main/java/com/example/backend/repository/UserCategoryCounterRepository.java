package com.example.backend.repository;

import com.example.backend.entities.UserCategoryCounter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCategoryCounterRepository extends JpaRepository<UserCategoryCounter,Integer> {
}
