package com.overridingassign;
class Bike {
   
    String color;
    int speed;

    
    void bikeInfo() {
        System.out.println("Bike Color: " + color);
        System.out.println("Bike Speed: " + speed + " km/h");
    }
}


class Pulsar extends Bike {
    
    int pulsarModel;

   
    @Override
    void bikeInfo() {
       
        super.bikeInfo();
        System.out.println("Pulsar Model: " + pulsarModel);
    }
}
public class BikeType {
    public static void main(String[] args) {
      
        Bike myBike = new Bike();
        myBike.color = "Red";
        myBike.speed = 60;

        
        System.out.println("Bike Information:");
        myBike.bikeInfo();
        System.out.println();

     
        Pulsar myPulsar = new Pulsar();
        myPulsar.color = "Blue";
        myPulsar.speed = 80;
        myPulsar.pulsarModel = 220;

        
        System.out.println("Pulsar Information:");
        myPulsar.bikeInfo();
    }

}
