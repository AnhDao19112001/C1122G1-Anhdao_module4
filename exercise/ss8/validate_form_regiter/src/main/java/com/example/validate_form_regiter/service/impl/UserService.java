package com.example.validate_form_regiter.service.impl;

import com.example.validate_form_regiter.model.User;
import com.example.validate_form_regiter.repository.IUserRepository;
import com.example.validate_form_regiter.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository iUserRepository;

    @Override
    public List<User> findAll() {
        return iUserRepository.findAll();
    }

    @Override
    public void create(User user) {
        iUserRepository.save(user);
    }
}
