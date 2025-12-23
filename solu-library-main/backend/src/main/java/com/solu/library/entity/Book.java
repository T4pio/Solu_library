package com.solu.library.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data // Getter, Setter, ToString gibi metodları otomatik yazar (Lombok sihri)
@Entity // Java'ya der ki: "Bu sınıf veritabanında bir TABLO olacak"
@Table(name = "books") // Tablonun adı "books" olsun
public class Book {

    @Id // Bu sütun tablonun kimliğidir (Primary Key)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID'ler 1, 2, 3 diye otomatik artsın
    private Long id;

    private String title;   // Kitap Adı
    private String author;  // Yazar
    @Column(columnDefinition = "TEXT") // Sınırsız uzunlukta metne izin ver
    private String image;
    private String owner;   // Kitabın Sahibi (Kullanıcı Adı)
    private String status;  // Durum (available / borrowed)
}