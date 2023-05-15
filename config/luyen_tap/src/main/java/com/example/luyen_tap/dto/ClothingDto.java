package com.example.luyen_tap.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class ClothingDto implements Validator {



    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
