package ro.sit.homework.homework04;

import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Catalog catalog = new Catalog();

        catalog.addStudent("Larisa", 10);
        catalog.addStudent("Ioana", 5);
        catalog.addStudent("Alexandru", 9);

        List<Student> students = catalog.getStudents();

        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Marks: " + student.getMarks());
        }

        // Before sorting by name
        System.out.println("List of students before ordering by name ...");

        orderStudentsByName(students);

        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Marks: " + student.getMarks());
        }

        // Sorting by marks
        Collections.sort(students, Comparator.comparingInt(Student::getMarks));
        System.out.println("\nList of students after sorting by marks:");

        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Marks: " + student.getMarks());
        }
    }

    public static void orderStudentsByName(List<Student> students) {
        Collections.sort(students, Comparator.comparing(Student::getName, String.CASE_INSENSITIVE_ORDER));
    }
}
