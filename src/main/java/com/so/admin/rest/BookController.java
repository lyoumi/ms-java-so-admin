package com.so.admin.rest;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;
import static org.springframework.http.HttpStatus.OK;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.so.admin.entity.Book;
import com.so.admin.service.BookService;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RequestMapping("book")
@RestController
public class BookController {

    private final BookService bookService;

    @ResponseStatus(OK)
    @GetMapping(path = "/{id}")
    public Book getBookById(@PathVariable("id") String id) {
        return bookService.getBookById(id);
    }

    @ResponseStatus(OK)
    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @ResponseStatus(CREATED)
    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    @ResponseStatus(OK)
    @PutMapping
    public Book updateBook (@RequestBody Book book) {
        return bookService.updateBook(book);
    }

    @ResponseStatus(NO_CONTENT)
    @DeleteMapping(path = "/{id}")
    public void deleteBook(@PathVariable("id") String id) {
        bookService.deleteBook(id);
    }
}
