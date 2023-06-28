package ro.sit.homework.homework03;



    public class Library {

        public static void main(String[] args) {
            Author author = new Author("JK Rowlling", "larisa.branzan@gmail.com");
            Book book = new Book(author.getAuthorName(), author.getAuthorEmail(), "Harry Potter", 1991, 20.99);

            System.out.println("Book " + book.getName() + " (Price is " + book.getPrice() + " RON), by " +
                    author.getAuthorName() + ", published in " + book.getYear());

        }









}
