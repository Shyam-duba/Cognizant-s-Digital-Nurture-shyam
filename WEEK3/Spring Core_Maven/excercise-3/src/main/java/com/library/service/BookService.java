package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        System.out.println("Dependency Injection implemented -- reporting from setter method in bookService");
        this.bookRepository = bookRepository;
    }

    public void addBook(String bookName) {
        System.out.println("Adding Book :" + bookName);
        bookRepository.saveBook(bookName);
    }
    public void removeBook(String bookName) {
        System.out.println("removing Book : "+bookName);
        bookRepository.removeBook(bookName);
    }


}
