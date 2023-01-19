package com.example.backend.ecxeption;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GeneralExceptionHandler extends Exception {

    public GeneralExceptionHandler(String msg)
    {
        super(msg);
    }

}
