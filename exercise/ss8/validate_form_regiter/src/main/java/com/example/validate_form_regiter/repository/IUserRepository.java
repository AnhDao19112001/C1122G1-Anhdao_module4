package com.example.validate_form_regiter.repository;

import com.example.validate_form_regiter.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Integer> {
}
