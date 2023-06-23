package ro.sit.homework.javaobjects;

public class Book {

     String name ;
     int year ;
     double price;

    Author author;

    Book (String name, int year, double price, Author author ) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.author = author;
    }


     String getName() {
        return name;
    }

    Author getAuthor () {
        return author;
    }

    Double getPrice () {
        return price;
    }

    int getYear () {
        return year;
    }
}
