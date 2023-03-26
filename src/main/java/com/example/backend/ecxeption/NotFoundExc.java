package com.example.backend.ecxeption;

import javax.persistence.Entity;
import javax.persistence.EntityNotFoundException;

public class NotFoundExc extends EntityNotFoundException {
    public NotFoundExc(String message) {
        super(message);

    }
}
