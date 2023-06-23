package ro.sit.homework.javaobjects;



    public class Library {

        public static void main(String[] args) {
                Author author = new Author("JK Rowlling", "larisa.branzan@gmail.com");


                Book book = new Book( "Harry Potter", 1999, 50.99, author );


            System.out.println("Book " + book.getName() + " (Price is " + book.getPrice() + " RON), by " +
                    author.getName() + ", published in " + book.getYear());

    }



}
