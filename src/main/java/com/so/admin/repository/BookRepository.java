package com.so.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.so.admin.entity.Book;


public interface BookRepository extends JpaRepository<Book, String> {

}
