package com.example.backend.ecxeption;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class Exception extends Throwable {
    @ExceptionHandler(NotFoundExc.class)
    public ResponseEntity<String> handleCustomException(NotFoundExc ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }

}
