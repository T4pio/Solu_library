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

    private String fullName; // Tam Ad

    @Column(unique = true)
    private String username; // Kullanıcı Adı

    private String password; // Şifre

    private String email; // E-posta



    @Column(columnDefinition = "TEXT") 
    private String profileImage; // Profil Resmi (Base64 String)

    private String aboutMe; 

    private String location;

    private String phone;

    private String currentStatus;

    private int trustScore = 100;
}