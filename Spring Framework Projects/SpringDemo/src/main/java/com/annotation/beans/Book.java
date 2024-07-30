package com.annotation.beans;
import org.springframework.beans.factory.annotation.Autowired;



public class Book {

    private int bookid;
    private String name;

    public int getBookid() {
        return bookid;
    }

    @Autowired //Required also give the same output
    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getName() {
        return name;
    }

    @Autowired
    public void setName(String name) {
        this.name = name;
    }
}
