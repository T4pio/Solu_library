package com.solu.library.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    @Column(unique = true)
    private String username;

    private String password;

    private String email;



    @Column(columnDefinition = "TEXT") 
    private String profileImage;

    private String aboutMe; 

    private String location;

    private String phone;

    private String currentStatus;

    private int trustScore = 100
}