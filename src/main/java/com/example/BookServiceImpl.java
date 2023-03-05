package com.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {

    private List<Book> bookdata = new ArrayList<>();

    Book book1 = new Book(null, "La guerra de los cielos", "La saga de La guerra de los cielos es una historia de ciencia ficción que narra la guerra más devastadora entre el cielo y el infierno, más allá de los límites de la comprensión humana. El planeta se estremece, los habitantes pierden la facultad del movimiento, el mundo se desmorona. Lo llaman la Onda.", 380, "9781517051440", "Español", true, 13.47, LocalDate.now(), LocalDate.now());
    Book book2 = new Book(null, "La biblia de los caidos", "El mundo cuenta con un lado oculto, una cara sobrenatural que nos susurra, que se intuye, pero que muy pocos perciben", 478, "9788416101092", "Español", true, 108.99, LocalDate.now(), LocalDate.now());

    @Override
    public List<Book> findAll() {
        return null;
    }

    @Override
    public Book findById() {
        for (Book book : bookdata) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }


    @Override
    public List<Book> findByMaxPages() {
        return null;
    }

    @Override
    public List<Book> findByLanguage() {
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

    @Override
    public Book findById(long bookId) {
        return null;
    }
}
