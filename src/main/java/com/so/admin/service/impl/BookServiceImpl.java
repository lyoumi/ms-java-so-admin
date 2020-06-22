package com.so.admin.service.impl;

import org.springframework.stereotype.Service;

import com.so.admin.entity.Book;
import com.so.admin.exceptions.BookNotFoundException;
import com.so.admin.repository.BookRepository;
import com.so.admin.service.BookService;
import java.util.List;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public Book getBookById(String id) {
        return bookRepository.findById(id)
            .orElseThrow(() ->
                new BookNotFoundException(String.format("Unable to find book with id: %s", id)));
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book createBook(Book book) {
        return bookRepository.saveAndFlush(book);
    }

    @Override
    public Book updateBook(Book book) {
        return bookRepository.saveAndFlush(book);
    }

    @Override
    public void deleteBook(String id) {
        bookRepository.deleteById(id);
    }
}
