package Collections;

import java.util.Vector;

public class VectorMethodsDemo {
    public static void main(String[] args) {
        // Create a Vector of Integers
        Vector<Integer> v = new Vector<>();

        
        v.add(10);
        v.add(20);
        v.add(30);
        System.out.println("After add: " + v);     
           
        System.out.println("Element at index 0: " + v.get(0)); 
        v.set(1, 55);
        System.out.println("After set at index 1: " + v);
        v.remove(0);
        System.out.println("After removing index 0: " + v); 

       
    }
}
