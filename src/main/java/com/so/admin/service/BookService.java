package com.so.admin.service;

import com.so.admin.entity.Book;
import java.util.List;

public interface BookService {

    Book getBookById(String id);

    List<Book> getAllBooks();

    Book createBook(Book book);

    Book updateBook(Book book);

    void deleteBook(String id);
}
