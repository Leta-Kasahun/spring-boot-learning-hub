package com.example.library.service;

import com.example.library.model.Book;
import com.example.library.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository; // final for immutability

    // Constructor injection
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Add a new book
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    // Get all books
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
