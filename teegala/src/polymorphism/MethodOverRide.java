package polymorphism;

public class MethodOverRide {
    public void demo() {
        System.out.println("this is parent class");
    }
}

class Demo1 extends MethodOverRide {
    public void demo() {
        System.out.println("this is derived class");
    }
}