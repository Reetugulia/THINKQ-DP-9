package com.overridingassign;
class Vehicle {
    public String accelerate(long mph) {
        return "Vehicle is accelerating at " + mph + " mph.";
    }

    public String stop() {
        return "Vehicle has stopped.";
    }

    public String run() {
        return "Vehicle is running.";
    }
}

class Car extends Vehicle {
    @Override
    public String accelerate(long mph) {
        return "Car is accelerating at " + mph + " mph.";
    }
}
public class Carspeed {
	public static void main(String[] args) {
		Vehicle v;
		v=new Vehicle();
		v.accelerate(1000);
		
		System.out.println("--------------------------------------------------------------");
		v=new Car();
		v.accelerate(200);
		v.run();
		v.stop();
		
		
				
	}

}
