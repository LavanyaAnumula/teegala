package Collections;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20); 
        System.out.println("HashSet: " + numbers);
        numbers.remove(30);
        System.out.println("After removing 30: " + numbers);
        System.out.println("Contains 10? " + numbers.contains(10));
        System.out.println("Contains 50? " + numbers.contains(50));
        System.out.println("Iterating HashSet:");
        for (int n : numbers) {
            System.out.print(n +" ");
        }
    }
}
