package com.solu.library.repository;

import com.solu.library.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository sayesinde; kaydet, sil, hepsini getir gibi kodlar hazır gelir.
public interface BookRepository extends JpaRepository<Book, Long> {
    // Buraya şimdilik hiçbir şey yazmamıza gerek yok!
    // Spring Boot bizim için arka planda her şeyi hallediyor.
}