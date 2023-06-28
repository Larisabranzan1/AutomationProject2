package ro.sit.homework.homework03;

public class Book {


    Author author;

    private String name;
    private int year;
    private double price;


    public Book(String name, int year, double price) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.author = author;
    }

    public Book(String authorName, String authorEmail, String name, int year, double price) {
        this.author = new Author(authorName, authorEmail);
        this.name = name;
        this.year = year;
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

}
