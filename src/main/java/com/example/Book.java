package com.example;

import java.time.LocalDate;

public class Book {

    // atributos Book
    private Long id;
    private String title;
    private String synopsis;
    private Author author;
    private Integer numPages;
    private String isbn;
    private String language;
    private Boolean available;
    private Editorial editorial;
    private Double price;
    private LocalDate publicDate;
    private LocalDate finalSale;

    // constructores Book

    public Book (){}

    public Book(Long id, String title, String synopsis, Author author, Integer numPages, String isbn, String language, Boolean available, Editorial editorial, Double price, LocalDate publicDate, LocalDate finalSale) {
        this.id = id;
        this.title = title;
        this.synopsis = synopsis;
        this.author = author;
        this.numPages = numPages;
        this.isbn = isbn;
        this.language = language;
        this.available = available;
        this.editorial = editorial;
        this.price = price;
        this.publicDate = publicDate;
        this.finalSale = finalSale;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Integer getNumPages() {
        return numPages;
    }

    public void setNumPages(Integer numPages) {
        this.numPages = numPages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDate getPublicDate() {
        return publicDate;
    }

    public void setPublicDate(LocalDate publicDate) {
        this.publicDate = publicDate;
    }

    public LocalDate getFinalSale() {
        return finalSale;
    }

    public void setFinalSale(LocalDate finalSale) {
        this.finalSale = finalSale;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", synopsis='" + synopsis + '\'' +
                ", author=" + author +
                ", numPages=" + numPages +
                ", isbn='" + isbn + '\'' +
                ", language='" + language + '\'' +
                ", available=" + available +
                ", editorial=" + editorial +
                ", price=" + price +
                ", publicDate=" + publicDate +
                ", finalSale=" + finalSale +
                '}';
    }
}
