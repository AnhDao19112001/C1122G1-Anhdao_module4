package com.example.security.service;

import com.example.security.model.AppUser;
import com.example.security.model.UserRole;
import com.example.security.repository.AppUserRepository;
import com.example.security.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private AppUserRepository appUserRepository;
    @Autowired
    private UserRoleRepository userRoleRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AppUser appUser = this.appUserRepository.findByUserName(username);
        if (appUser == null){
            System.out.println("User not found! "+ username);
            throw new UsernameNotFoundException("User "+ username +" was not found in th database");
        }
        System.out.println("Found User: "+ appUser);
        List<UserRole> userRoles = this.userRoleRepository.findByAppUser(appUser);
        List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
        if (userRoles != null){
            for (UserRole userRole : userRoles){
                GrantedAuthority authority = new SimpleGrantedAuthority(userRole.getAppRole().getRoleName());
                grantList.add(authority);
            }
        }
        UserDetails userDetails = (UserDetails) new User(appUser.getUserName(), appUser.getEncrytedPassword(), grantList);
        return userDetails;
    }
}
