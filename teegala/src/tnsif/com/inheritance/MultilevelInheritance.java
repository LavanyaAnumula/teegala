package tnsif.com.inheritance;

class Vehicle {
 void start() {
     System.out.println("Vehicle can start");
 }
}
class Car extends Vehicle {
 void fuelType() {
     System.out.println("Car uses petrol or diesel");
 }
}

class ElectricCar extends Car {
 void battery() {
     System.out.println("Electric car runs on battery");
 }
}

public class MultilevelInheritance {
 public static void main(String[] args) {
     ElectricCar tesla = new ElectricCar();

     tesla.start();    
     tesla.fuelType(); 
     tesla.battery();  
 }
}
