package com.security.SpringSecurity.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class VerificationToken {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String token;
    private Data expirationTime;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = )
    private User user;

}
