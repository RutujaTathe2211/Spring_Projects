package com.security.SpringSecurity.service;

import com.security.SpringSecurity.entity.User;
import com.security.SpringSecurity.model.UserModel;
import com.security.SpringSecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UserServiceimpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public User registerUser(UserModel userModel) {

        User user=new User();
        user.setFirstName(userModel.getFirstName());
        user.setLastName(userModel.getLastName());
        user.setEmail(userModel.getEmail());
        user.setRole("User");
        //for encryption purpose
        user.setPassword(passwordEncoder.encode(userModel.getPassword()));
        userRepository.save(user);


return user;
    }
}
