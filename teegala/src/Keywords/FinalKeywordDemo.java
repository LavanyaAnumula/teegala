package Keywords;

final class Animal {   
 final int legs = 4;  

 final void sound() {  
     System.out.println("Animals make sounds");
 }
}

class Dog {  
 void display() {
    
     System.out.println("Dogs bark");
 }
}

public class FinalKeywordDemo {
 public static void main(String[] args) {
     Animal a = new Animal();
     System.out.println("Legs: " + a.legs);
     a.sound(); 

     Dog d = new Dog();
     d.display();
 }
}
