package models;

import java.awt.print.Book;
import java.util.HashSet;
import java.util.Set;

public class Student {

    public Integer id;
    public String name;
    public String department;
    public String address;


    public Student(){

    }

    public Student(Integer id, String name, String department, String address) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.address = address;
    }

    private static Set<Student> students;

    static {
        students = new HashSet<>();
        students.add(new Student(1, "saiful", "CSE", "Mohakahli"));
        students.add(new Student(2, "Pappu vaia", "CSE", "Baridhara"));
    }

    public static Set<Student> allStudent() {
        return students;
    }

    public static Student findById(Integer id) {
        for (Student student : students) {
            if (id.equals(student.id)) {
                return student;
            }
        }
        return null;
    }

    public static void add(Student student) {
        students.add(student);
    }

    public static boolean delete(Student student) {
        return students.remove(student);
    }
}
