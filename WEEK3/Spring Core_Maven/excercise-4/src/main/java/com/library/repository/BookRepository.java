package com.library.repository;

public class BookRepository {
    public void saveBook(String bookName) {
        System.out.println("Book "+bookName+" Saved sucessfully!");
    }
    public void removeBook(String bookName){
        System.out.println("Book "+bookName+" removed from the repository");
    }
}
