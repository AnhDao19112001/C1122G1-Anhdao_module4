package com.example.validate_form_regiter.service;

import com.example.validate_form_regiter.model.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();
    void create(User user);
}
