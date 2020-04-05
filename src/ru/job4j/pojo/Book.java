package ru.job4j.pojo;

public class Book {
    private String name;
    private int quantitySheet;

    public Book(String name, int quantitySheet) {
        this.name = name;
        this.quantitySheet = quantitySheet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantitySheet() {
        return quantitySheet;
    }

    public void setQuantitySheet(int quantitySheet) {
        this.quantitySheet = quantitySheet;
    }
}
