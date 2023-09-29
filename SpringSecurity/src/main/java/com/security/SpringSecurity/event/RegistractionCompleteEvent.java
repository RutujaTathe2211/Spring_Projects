package com.security.SpringSecurity.event;

import com.security.SpringSecurity.entity.User;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;
@Getter
@Setter
public class RegistractionCompleteEvent extends ApplicationEvent {
    private User user;
    private String applicationurl;//url for user used in mail to click
    public RegistractionCompleteEvent(User user, String application) {
        super(user);
        this.user=user;
        this.applicationurl=application;
    }
}
