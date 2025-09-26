package Collections;

import java.util.*;

public class ComparableMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "ABC", 85));
        students.add(new Student(102, "DEF", 92));
        students.add(new Student(103, "GHI", 78));
        students.add(new Student(104, "JKL", 92));

        System.out.println("Before Sorting:");
        for (Student s : students) {
            System.out.println(s);
        }

        Collections.sort(students);

        System.out.println("\nAfter Sorting (by marks, then by name):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}