package com.security.SpringSecurity.controller;

import com.security.SpringSecurity.entity.User;
import com.security.SpringSecurity.event.RegistractionCompleteEvent;
import com.security.SpringSecurity.model.UserModel;
import com.security.SpringSecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Flow;

@RestController
public class registrationController {
    @Autowired
    private UserService userService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private ApplicationEventPublisher publisher;
    @PostMapping("/register")
    public String registerUser(@RequestBody UserModel userModel){
  User user=userService.registerUser(userModel);
        publisher.publishEvent(new RegistractionCompleteEvent(
                user,"url"
        ));
  return "Success";
    }
}
