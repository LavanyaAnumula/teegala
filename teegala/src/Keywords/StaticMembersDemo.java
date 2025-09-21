package Keywords;

class Student {
    static String schoolName = "TKR High School";
    String name;
    int rollNo;
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    static void changeSchool(String newSchool) {
        schoolName = newSchool;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", School: " + schoolName);
    }

    static {
        System.out.println("Static block executed: School initialized.");
    }
}

public class StaticMembersDemo {
    public static void main(String[] args) {
      
        Student s1 = new Student("Lavanya", 1);
        Student s2 = new Student("Bhavya", 2);
        s1.display();
        s2.display();
        Student.changeSchool("TKR International School");
        System.out.println("\nAfter changing school name:");
        s1.display();
        s2.display();  
    }
}

