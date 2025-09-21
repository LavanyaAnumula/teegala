package tnsif.com.inheritance;

class Vehicle {
 void start() {
     System.out.println("Vehicle can start");
 }
}

interface Electric {
 void charge();
}

interface Automatic {
 void autoDrive();
}

class ElectricCar extends Vehicle implements Electric, Automatic {
 public void charge() {              
     System.out.println("ElectricCar is charging.");
 }


 public void autoDrive() {          
     System.out.println("ElectricCar is in auto-drive mode.");
 }

 void showModel() {
     System.out.println("Model: Tesla Model 3");
 }
}

public class HybridInheritance {
 public static void main(String[] args) {
     ElectricCar car = new ElectricCar();

     car.start();
     car.charge();
     car.autoDrive();
     car.showModel();
 }
}
