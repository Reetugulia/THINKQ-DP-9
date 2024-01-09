package com.staticassignment;
class Vehicle {
    String vehicleType;

    
    Vehicle(String type) {
        this.vehicleType = type;
    }

    void displayType() {
        System.out.println("Vehicle Type: " + vehicleType);
    }
}


class Car1 extends Vehicle {
    int numberOfDoors;

    // Constructor with parameters, using 'super' to call the parent class constructor
    Car1(String type, int doors) {
        super(type);
        this.numberOfDoors = doors;
    }


    void displayDetails() {
        super.displayType(); // Calling the displayType method of the parent class
        System.out.println("Number of Doors: " + numberOfDoors);
    }

   
    void displayType() {
        super.displayType(); // Calling the displayType method of the parent class
        System.out.println("This is a Car.");
    }
}
public class SuperKeyword {
	  public static void main(String[] args) {
	       
	        Car1 myCar = new Car1("verna", 4);

	      
	        myCar.displayDetails(); 
	        myCar.displayType();    
	    }

}
