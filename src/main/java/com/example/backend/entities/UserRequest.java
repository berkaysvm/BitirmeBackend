package com.example.backend.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Data
@Getter
public class UserRequest {
    String userName;
    String password;
}
