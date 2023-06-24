package com.example.demo.domain;
import java.util.Date;


public class Book {
    private String bookId; //pk
    private String bookName; //책이름
    private int bookPrice; //가격
    private int bookStock; //재고
    private Date createdAt; //등록날짜
    private Date lastModify; //수정날짜
    private String createdBy;//등록자ID


    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public int getBookStock() {
        return bookStock;
    }

    public void setBookStock(int bookStock) {
        this.bookStock = bookStock;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getLasrModify() {
        return lastModify;
    }

    public void setLasrModify(Date lasrModify) {
        this.lastModify = lasrModify;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

}
