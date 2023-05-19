package com.example.security.repository;

import com.example.security.model.AppRole;
import com.example.security.model.AppUser;
import com.example.security.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {
   List<UserRole> findByAppUser(AppUser appUser);
}
