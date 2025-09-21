package polymorphism;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
    String add(String a, int b) {
        return a + " " + b;
    }
    String add(int a, String b) {
        return a + " " + b;
    }
}

public class TaskOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of ints: " + calc.add(5, 10));
        System.out.println("Sum of doubles: " + calc.add(5.5, 2.3));
        System.out.println("String + int: " + calc.add("RollNo", 101));
        System.out.println("Int + String: " + calc.add(2025, "Batch"));
    }
}
