package com.solu.library.controller;

import com.solu.library.entity.Book;
import com.solu.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Bu sınıfın bir "Web API" olduğunu belirtir.
@RequestMapping("/api/books") // Adresimiz: http://localhost:3000/api/books
@CrossOrigin(origins = "*") // Frontend'in (HTML) erişmesine izin veriyoruz
public class BookController {

    @Autowired
    private BookService bookService;

    // 1. İSTEK: GET (Verileri Getir)
    // HTML "fetch" yaptığında burası çalışır.
    @GetMapping
    public List<Book> getAll() {
        return bookService.getAllBooks();
    }

    // 2. İSTEK: POST (Veri Kaydet)
    // HTML "Kitap Ekle" dediğinde burası çalışır.
    @PostMapping
    public Book add(@RequestBody Book book) {
        return bookService.saveBook(book);
    }
    // SİLME İSTEĞİ (DELETE)
    @DeleteMapping("/{id}") // Örn: /api/books/5 adresine istek gelirse
    public void delete(@PathVariable Long id) {
        bookService.deleteBook(id);
    }
}