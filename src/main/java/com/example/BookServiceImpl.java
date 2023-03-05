package com.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookServiceImpl implements BookService {

    private List<Book> bookdata= new ArrayList<>();

    public BookServiceImpl (){
        Book book1 = new Book(null,"La guerra de los cielos","La guerra de los cielos volumen 1 Por Fernando Trujillo / César García ,La guerra más antigua y devastadora de la existencia ha encontrado el modo de continuar, de extenderse por toda la creación. El Cielo y el Infierno ya no son los únicos escenarios para este terrible conflicto.",387,"9781517051440","Español",true,21.14, LocalDate.now(),LocalDate.now());
        Book book2 = new Book(null,"La biblia de los caídos","El mundo cuenta con un lado oculto, una cara sobrenatural que nos susurra, que se intuye, pero que muy pocos perciben",478,"9781517051440","Español",true,108.5,LocalDate.now(),LocalDate.now());
        Book book3 = new Book(null,"La prisión de Blackrock","¿Cuál es la peor condena que le puede caer a un preso de Illinois? Ni la cadena perpetua, ni la inyección letal. El peor castigo es el destino a la prisión de Black Rock, una fortaleza de negros muros cuya localización exacta nadie conoce.",114,"9781517055752","Español",true,17.34,LocalDate.now(),LocalDate.now());
        this.create(book1);
        this.create(book2);
        this.create(book3);
    }

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
}
