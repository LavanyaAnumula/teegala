package com.tnsif.exceptionhandling;

public class StringOutOfBoundExample {
    public static void main(String[] args) {
        String str = "Hello";
        try {
            char ch = str.charAt(10);
            System.out.println("Character at index 10: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
