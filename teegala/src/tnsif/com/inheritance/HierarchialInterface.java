package tnsif.com.inheritance;

class Parent {

    public void parent() {
        System.out.println("Implementing Multiple Inheritance...");
    }

    public void parent1() {
        System.out.println("This method from parent class method name parent1");
    }

    public void parent2() {
        System.out.println("This method from parent class method name parent2");
    }
}

class ChildOne extends Parent {

    public void childOneMethod() {
        System.out.println("This method from child class method name child");
    }
}

class ChildTwo extends Parent {

    public void childTwoMethod() {
        System.out.println("This method from child2 class method name child");
    }
}

public class HierarchialInterface{
    public static void main(String[] args) {
        ChildOne c1 = new ChildOne();
        System.out.println("---- ChildOne Object ----");
        c1.parent();
        c1.parent1();
        c1.childOneMethod();

        ChildTwo c2 = new ChildTwo();
        System.out.println("\n---- ChildTwo Object ----");
        c2.parent();
        c2.parent2();
        c2.childTwoMethod();
    }
}
