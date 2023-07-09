package ro.sit.homework.homework04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Catalog {
    public List<Student> students;

    public Catalog() {
        students = new ArrayList<>();
    }

    public void addStudent(String name, int marks) {
        Student student = new Student(name, marks);
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public Student searchStudent(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    public void deleteStudent(String name) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getName().equalsIgnoreCase(name)) {
                iterator.remove();
                break;
            }
        }
    }

    public void orderStudentsByName() {
        Collections.sort(students, (s1, s2) -> s1.getName().compareToIgnoreCase(s2.getName()));
    }

}
