package com.security.SpringSecurity.service;

import com.security.SpringSecurity.entity.User;
import com.security.SpringSecurity.model.UserModel;
import com.security.SpringSecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public interface UserService{
        User registerUser(UserModel userModel);
}
