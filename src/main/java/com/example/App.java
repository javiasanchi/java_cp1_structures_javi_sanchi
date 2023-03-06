package com.example;

import java.time.LocalDate;
import java.util.List;
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

            if (book== null)
                System.out.println("El libro con id : " + bookId + " no existe");
                    else
                System.out.println(book);

        } else if (option == 3) {
            System.out.println("Indica el número máximo de páginas :");
            int maxPages =scanner.nextInt();
            List<Book> books =bookService.findByMaxPages(maxPages);
            for (Book book : books)
                System.out.println(book);
            if (books.size() <=0 || books.size()>=(maxPages))
            System.out.println("El libro elegido está fuera de rango de páginas " + maxPages);

        } else if (option == 4) {
            System.out.println("Indica el título del libro :");
            String title = scanner.next();
            scanner.nextLine();
            System.out.println("Añade una sinopsis del libro ");
            String synopsis = scanner.next();
            System.out.println("Indica el número de páginas del libro :");
            int numPages =scanner.nextInt();
            System.out.println("Indica el isbn del libro :");
            String isbn = scanner.next();
            System.out.println("Indica el idioma  del libro :");
            String language = scanner.next();
            System.out.println("Indica si el libro está disponible :");
            Boolean available = scanner.nextBoolean();
            System.out.println("Introduce el precio del libro :");
            Double price = scanner.nextDouble();
            System.out.println("Indica la fecha de la publicación del libro :");
            int publicYear = scanner.nextInt();

            Book book;
            book = new Book(null, title, synopsis, numPages, isbn, language, available, price, publicDate );
            Book createBook = bookService.create(book);
            System.out.println("El libro creado se guardo con el Id :" + createBook.getId());            
        } else if (option == 5) {
            System.out.println("Indica el Id del libro a editar :");
            Long bookId = scanner.nextLong();
            Book book = bookService.findById(bookId);
            System.out.println("Actualmente esta es la información del libro " + bookId);
            System.out.println(book);
            System.out.println("Cambia el título del libro :");
            String title = scanner.next();
            scanner.nextLine();
            System.out.println("Cambia la nueva sinopsis del libro :");
            String synopsis = scanner.next();
            System.out.println("Modifica el número de páginas del libro :");
            int numPages = scanner.nextInt();
            System.out.println("Indica si el libro está disponible :");
            Boolean present = scanner.nextBoolean();
            System.out.println("Indica el precio del libro :");
            Double price = scanner.nextDouble();
            System.out.println("Indica año de publicación del libro :");
            int publicYear = scanner.nextInt();

            book.setTitle(title);
            book.setSynopsis(synopsis);
            book.setNumPages(numPages);
            book.setAvailable(available);
            book.setPrice(price);
            book.getPublicYear(publicYear);

            Book bookedit = bookService.edit(book);

            if (bookedit == null)
                System.out.println("El libro no fue actualizado : ");
            else
                System.out.println("Libro actualizado " + bookedit);
        } else if (option == 6) {
            System.out.println("¿Qué libro por Id quieres borrar? :");
            Long bookId = scanner.nextLong();
            boolean isremoved = bookService.removedById(bookId);
            if (isremoved)
                System.out.println("Libro borrado correctamente " + bookId);
            else
                System.out.println("No se pudo borrar el pibro :" + bookId);
        }
        scanner.close();
        System.out.println("Se terminó el librerio ");

    }
}