package com.example;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();

        System.out.println("""
                Welcome to Library App:
                1. Find all books
                2. Find one book by id
                3. Find  books by num max pages
                4. Create a new book
                5. Edit a book
                6. Remove a book
                7. Exit
                """);
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        System.out.println("La opción elegida es :" + option);

        if (option == 1) {
            List<Book> books = bookService.findAll();
            System.out.println("El total de lihrosves : " + books.size() + " libros");
            for (Book book : books)
                System.out.println(book);
        }else if (option==2){
            System.out.println("Indica el id del libro buscado");
            long bookId = scanner.nextLong();
            Book book = bookService.findById(bookId);

            if (book== null) {
                System.out.println("El libro con id : " + bookId + " no existe");
            }


        }

    }
}