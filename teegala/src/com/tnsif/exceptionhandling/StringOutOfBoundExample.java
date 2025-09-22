package com.tnsif.exceptionhandling;

public class StringOutOfBoundExample {
    public static void main(String[] args) {
        String str = "Hello";
        try {
            char ch = str.charAt(10);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
