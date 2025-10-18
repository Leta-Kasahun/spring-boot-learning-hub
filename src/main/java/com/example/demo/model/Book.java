package com.example.demo.model;

public class Book {
    private String title;
    private String author;
    private Double price;
    private int year;
    public Book(){}
public Book( String title,String author, Double price, int year){
    this.title=title;
    this.author=author;
    this.price=price;
    this.year=year;
}

//setter and getter
public String getTitle() { return title; }
public void setTitle(String title) { this.title = title; }
public String getAuthor() { return author; }
public void setAuthor(String author) { this.author = author; }
public Double getPrice() { return price; }
public void setPrice(Double price) { this.price = price; }
public int getYear() { return year; }
public void setYear(int year) { this.year = year; }

}
