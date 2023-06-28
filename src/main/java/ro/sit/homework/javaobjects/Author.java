package ro.sit.homework.javaobjects;

public class Author {


    private String authorName;
    private String authorEmail;

    public Author(String authorName, String authorEmail) {
        this.authorName = authorName;
        this.authorEmail = authorEmail;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

}

