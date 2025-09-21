package Wrapperclass;

public class Autoboxing1{
    public static void main(String[] args) {
       
        int num = 10;
        double price = 99.99;
        float marks = 85.5f;
        char grade = 'A';
        Integer intObj = num;       
        Double doubleObj = price;   
        Float floatObj = marks;    
        Character charObj = grade;   
        System.out.println("Integer Object: " + intObj);
        System.out.println("Double Object: " + doubleObj);
        System.out.println("Float Object: " + floatObj);
        System.out.println("Character Object: " + charObj);
    }
}
