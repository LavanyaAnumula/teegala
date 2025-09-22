package com.tnsif.exceptionhandling;

public class MultipleCatch {

    public static void main(String[] args) {
        try {
            int[] arr = {4, 8, 16, 32};
            int a= 4; 
            int b = 0; 
            System.out.println("Selected number: " + arr[a]); 
            int result = arr[2] / b; 
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The array index does not exist");
        } catch (Exception e) {
            System.out.println("An unknown error occurred.");
        }
    }
}