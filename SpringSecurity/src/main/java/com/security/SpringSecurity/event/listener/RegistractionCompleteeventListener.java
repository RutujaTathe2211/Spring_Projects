package com.security.SpringSecurity.event.listener;

import com.security.SpringSecurity.entity.User;
import com.security.SpringSecurity.event.RegistractionCompleteEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

import java.util.UUID;

public class RegistractionCompleteeventListener implements ApplicationListener<RegistractionCompleteEvent> {


    @Override
    public void onApplicationEvent(RegistractionCompleteEvent event) {
        //create verification token for user
        User user=event.getUser();
        String token=UUID.randomUUID().toString();

        //send mail to user
    }
}
