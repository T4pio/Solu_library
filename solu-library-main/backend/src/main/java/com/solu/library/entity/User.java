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

    // --- YENİ EKLENEN ALANLAR ---

    @Column(columnDefinition = "TEXT") // Uzun resim kodu için (Base64)
    private String profileImage;

    private String aboutMe; // Biyografi (Hakkımda)

    private String location; // Konum (İlçe/Şehir)

    private String phone; // Telefon

    private String currentStatus; // Şu an ne okuyor? (WhatsApp durumu gibi)

    private int trustScore = 100; // Güven Puanı
}