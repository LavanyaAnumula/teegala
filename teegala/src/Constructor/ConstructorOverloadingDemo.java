package Constructor;

class Person {
    String name;
    int age;
    Person() {
        name = "Unknown";
        age = 0;
    }
    Person(String n) {
        name = n;
        age = 0;
    }

    // Constructor with two parameters
    Person(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
       
        Person p1 = new Person();           
        Person p2 = new Person("lavanya");    
        Person p3 = new Person("Bhavya", 20);   

        p1.display();
        p2.display();
        p3.display();
    }
}
