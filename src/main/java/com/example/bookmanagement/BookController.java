package com.example.bookmanagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class BookController
{
    @Autowired
    public Book_repo br;
    @GetMapping ("/books")
    public List<Book> getAllBooks()
    {

        return br.findAll();
    }
    @PostMapping("/books")
    public Book createBook(@Validated @RequestBody Book b) {
        return br.save(b);
    }
    @GetMapping("/books/{id}")
    public ResponseEntity< Book > getBookById(@PathVariable(value = "id") int bid)
            throws ConfigDataResourceNotFoundException {
        Book bk = br.findById(bid)
                .orElseThrow();
        return ResponseEntity.ok().body(bk);
    }

}
