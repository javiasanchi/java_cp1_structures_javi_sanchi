package com.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {

    private List<Book> bookdata = new ArrayList<>();

    Book book1 = new Book(null, "La guerra de los cielos", "La saga de La guerra de los cielos es una historia de ciencia ficción que narra la guerra más devastadora entre el cielo y el infierno, más allá de los límites de la comprensión humana. El planeta se estremece, los habitantes pierden la facultad del movimiento, el mundo se desmorona. Lo llaman la Onda.", 380, "9781517051440", "Español", true, 13.47, LocalDate.now(), LocalDate.now());
    Book book2 = new Book(null, "La biblia de los caidos", "El mundo cuenta con un lado oculto, una cara sobrenatural que nos susurra, que se intuye, pero que muy pocos perciben", 478, "9788416101092", "Español", true, 108.99, LocalDate.now(), LocalDate.now());

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
