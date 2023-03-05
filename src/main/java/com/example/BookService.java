package com.example;

import java.util.List;
import java.util.Optional;

public interface BookService {

    // CRUD

    List<Book> findAll();
    Optional<Book> findById ();
    List<Book> findByMaxPages ();

    // Crear

    Book create (Book book);

    // Editar libro

    Book edit (Book bookEdit);

    // borrar

    boolean removedById (Long id);

}
