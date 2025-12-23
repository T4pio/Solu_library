package com.solu.library.service;

import com.solu.library.entity.Book;
import com.solu.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service // Java'ya diyoruz ki: "Bu sınıf iş mantığını yürüten AŞÇI'dır"
public class BookService {

    @Autowired // Depocuyu (Repository) otomatik bağla, çağırdığımda gelsin.
    private BookRepository bookRepository;

    // 1. Yetenek: Tüm kitapları veritabanından getir
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // 2. Yetenek: Yeni bir kitabı veritabanına kaydet
    public Book saveBook(Book book) {
        return bookRepository.save(book);

    }
    // Kitap Silme
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}