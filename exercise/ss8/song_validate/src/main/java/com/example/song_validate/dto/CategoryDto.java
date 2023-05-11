package com.example.song_validate.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CategoryDto implements Validator {

    private int id;
    @NotBlank(message = "Tên không được để trống.")
    @Size(min = 5, max = 45, message = "Tên có độ dài tối thiểu 5, tối đa 45 ký tự.")
    private String categoryName;

    public CategoryDto() {
    }

    public CategoryDto(int id, String categoryName) {
        this.id = id;
        this.categoryName = categoryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
