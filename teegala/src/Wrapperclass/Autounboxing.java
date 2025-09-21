package Wrapperclass;

public class Autounboxing{
    public static void main(String[] args) {
       
        Integer intObj = 50;      
        Double doubleObj = 99.99; 
        Float floatObj = 75.5f;  
       
        int num = intObj;          
        double price = doubleObj; 
        float marks = floatObj;   
        System.out.println("Primitive int: " + num);
        System.out.println("Primitive double: " + price);
        System.out.println("Primitive float: " + marks);
        System.out.println("\nSum of intObj + num: " + (intObj + num));
        System.out.println("Sum of doubleObj + price: " + (doubleObj + price));
    }
}
