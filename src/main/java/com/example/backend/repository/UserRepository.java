package com.example.backend.repository;

import com.example.backend.entities.UserInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserInformation,Long> {
    UserInformation findByeMail(String Email);
}
