package com.example.library.controller;

import com.example.library.model.Book;
import com.example.demo.userManagment.model.User;
import com.example.library.service.BookService;
import com.example.library.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/library")
public class LibraryController {

    private final UserService userService;
    private final BookService bookService;

    // Constructor injection
    public LibraryController(UserService userService, BookService bookService) {
        this.userService = userService;
        this.bookService = bookService;
    }

    // Register user
    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }

    // Login user
    @PostMapping("/login")
    public User login(@RequestBody Map<String, String> loginData) {
        return userService.login(loginData.get("email"), loginData.get("password"));
    }

    // Add book
    @PostMapping("/books")
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    // Get all books
    @GetMapping("/books")
    public List<Book> getBooks() {
        return bookService.getAllBooks();
    }

    // Optional: Get all users (for testing)
    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }
}
