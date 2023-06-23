package ro.sit.homework.javaobjects;

public class Author {

    String name;;
    String email;

    Author  (String name, String email) {
  this.name = name;
  this.email = email;
    }

    String getName() {
        return name;
    }

    String getEmail () {
        return email;
    }
}
