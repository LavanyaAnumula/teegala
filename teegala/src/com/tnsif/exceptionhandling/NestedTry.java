package com.tnsif.exceptionhandling;

public class NestedTry {
    public static void main(String[] args) {
        try {
            int[] arr = {10, 20, 30};  
            try {
                String str = "Java";
                char ch = str.charAt(10); 
                System.out.println("Character: " + ch);
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Inner catch: " + e);
            }
            System.out.println("Array element: " + arr[5]);         
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: " + e);
        }
    }
}
