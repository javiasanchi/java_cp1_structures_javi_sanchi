package com.example;

import java.util.List;
import java.util.Optional;

public class BookServiceImpl implements BookService {
    @Override
    public List<Book> findAll() {
        return null;
    }

    @Override
    public Optional<Book> findById() {
        return Optional.empty();
    }

    @Override
    public List<Book> findByMaxPages() {
        return null;
    }

    @Override
    public Book create(Book book) {
        return null;
    }

    @Override
    public Book edit(Book bookEdit) {
        return null;
    }

    @Override
    public boolean removedById(Long id) {
        return false;
    }
}
