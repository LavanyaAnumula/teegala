package Collections;

public class Student implements Comparable<Student> {
    int id;
    String name;
    int marks;
    
    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int compareTo(Student other) {
        if (this.marks == other.marks) {
            return this.name.compareTo(other.name);
        }
        return this.marks - other.marks;
    }

    public String toString() {
        return id + " - " + name + " - " + marks;
    }
}
