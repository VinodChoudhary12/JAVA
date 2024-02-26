abstract class Vehicle {
    String name;
    String brand;
    String color;
    int seatingCapacity;
    double cost;

    abstract void drive();
    abstract void brake();
}

abstract class LandTransport extends Vehicle {
    int numberOfWheels;

   
    void drive() {
        
        System.out.println("Driving on land.");
    }

    
    void brake() {
        
        System.out.println("Applying brakes on land.");
    }
}

class Cycle extends LandTransport {
    
}

class Bike extends LandTransport 
{
}
    

class Car extends LandTransport {
    
}

abstract class WaterTransport extends Vehicle {
    boolean hasPropellers;
    
    
    void drive() {
        
        System.out.println("Driving on water.");
    }

    
    void brake() {
        
        System.out.println("Applying brakes on water.");
    }
}

class Ship extends WaterTransport {

}

class Submarine extends WaterTransport {

}

class Boat extends WaterTransport {
    
}

public class Test 
{
    public static void main(String[] args) 
    {
        
        Cycle cycle = new Cycle();
        Bike bike = new Bike();
        Car car = new Car();
        Ship ship = new Ship();
        Submarine submarine = new Submarine();
        Boat boat = new Boat();
        
        cycle.drive();
        bike.drive();
        car.drive();
        ship.drive();
        submarine.drive();
        boat.drive();
    }
}
