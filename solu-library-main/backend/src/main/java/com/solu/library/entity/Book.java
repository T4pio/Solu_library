package com.solu.library.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data 
@Entity 
@Table(name = "books") 
public class Book {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;

    private String title;   // Kitap Adı
    private String author;  // Yazar
    @Column(columnDefinition = "TEXT") 
    private String image;
    private String owner;   // Kitabın Sahibi (Kullanıcı Adı)
    private String status;  // Durum (available / borrowed)
}