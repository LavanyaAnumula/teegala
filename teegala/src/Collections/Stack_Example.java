package Collections;

import java.util.*; 
public class Stack_Example 
{ 
   public static void main(String args[]) 
   { 
     Stack<Object> s=new Stack<>(); 
     s.push("abc"); 
     s.push(10); 
     s.push(true); 
     s.push("abc"); 

     s.push(null); 
     System.out.println(s); 
     s.pop(); 
     System.out.println("Stack After Pop(): " + s); 
     System.out.println("Top element: " + s.peek()); 
     System.out.println("Stack after peek():" + s); 
     } 
} 
