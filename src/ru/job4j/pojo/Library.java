package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Пушкин", 200);
        Book book2 = new Book("Толстой", 20000);
        Book book3 = new Book("Clean code", 800);
        Book book4 = new Book("Fowler", 1400);

        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;

        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getQuantitySheet());
        }

        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;

        System.out.println("Replace first and fourth book");
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getQuantitySheet());
        }

        System.out.println("Show only book Clean code");
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + " - " + book.getQuantitySheet());
            }
        }


    }
}
