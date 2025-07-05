package com.library;


import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) context.getBean("bookService");

        bookService.addBook("The Curious Case of Benjiman");
        bookService.addBook("13 Ceasers");

        bookService.removeBook("13 Ceasers");
    }
}