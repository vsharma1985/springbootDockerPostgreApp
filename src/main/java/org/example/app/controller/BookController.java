package org.example.app.controller;

import org.example.app.entity.Book;
import org.example.app.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/save")
    public Book saveBook(@RequestBody Book book){
        return bookRepository.save(book);
    }

    @GetMapping("/get")
    public List<Book> getBooks(){
        return bookRepository.findAll();
    }
}
