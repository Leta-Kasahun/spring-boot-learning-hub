package com.example.demo.controllers;
import com.example.demo.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class BookControllers {
    @GetMapping("/books")
    public List<Book> getBooks(){
        return List.of(
           new Book("Atomic Habits", "James Clear", 15.99, 2018),
            new Book("Clean Code", "Robert C. Martin", 28.50, 2008),
            new Book("Spring in Action", "Craig Walls", 40.00, 2021)
        );
    }
    
}
