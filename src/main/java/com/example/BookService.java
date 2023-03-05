package com.example;

import java.util.List;

public interface BookService {

    // CRUD

    List<Book> findAll();
    Book findById ();
    List<Book> findByMaxPages (int maxPages);
    List<Book> findByLanguage();
    // Crear

    Book create (Book book);

    // Editar libro

    Book edit (Book bookEdit);

    // borrar

    boolean removedById (Long id);

    Book findById(long bookId);
}
