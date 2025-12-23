package com.solu.library.service;

import com.solu.library.entity.Book;
import com.solu.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service 
public class BookService {

    @Autowired 
    private BookRepository bookRepository;

    //  Tüm kitapları veritabanından getir
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // Yeni bir kitabı veritabanına kaydet
    public Book saveBook(Book book) {
        return bookRepository.save(book);

    }
    // Kitap Silme
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}