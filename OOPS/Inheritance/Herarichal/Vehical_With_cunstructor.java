abstract class Vehicle {
    String name;
    String brand;
    String color;
    int seatingCapacity;
    double cost;

    public Vehicle(String name, String brand, String color, int seatingCapacity, double cost) {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.seatingCapacity = seatingCapacity;
        this.cost = cost;
    }

    abstract void drive();
    abstract void brake();
}

abstract class LandTransport extends Vehicle {
    int numberOfWheels;

    public LandTransport(String name, String brand, String color, int seatingCapacity, double cost, int numberOfWheels) {
        super(name, brand, color, seatingCapacity, cost);
        this.numberOfWheels = numberOfWheels;
    }

     
    void drive() {
        
        System.out.println("Driving on land.");
    }

     
    void brake() {
        
        System.out.println("Applying brakes on land.");
    }
}

class Cycle extends LandTransport {
    public Cycle(String name, String brand, String color, int seatingCapacity, double cost, int numberOfWheels) {
        super(name, brand, color, seatingCapacity, cost, numberOfWheels);
    }
}

class Bike extends LandTransport {
    public Bike(String name, String brand, String color, int seatingCapacity, double cost, int numberOfWheels) {
        super(name, brand, color, seatingCapacity, cost, numberOfWheels);
    }
}

class Car extends LandTransport {
    public Car(String name, String brand, String color, int seatingCapacity, double cost, int numberOfWheels) {
        super(name, brand, color, seatingCapacity, cost, numberOfWheels);
    }
}

abstract class WaterTransport extends Vehicle {
    boolean hasPropellers;
    
    public WaterTransport(String name, String brand, String color, int seatingCapacity, double cost, boolean hasPropellers) {
        super(name, brand, color, seatingCapacity, cost);
        this.hasPropellers = hasPropellers;
    }
    
     
    void drive() {
        
        System.out.println("Driving on water.");
    }

     
    void brake() {
        
        System.out.println("Applying brakes on water.");
    }
}

class Ship extends WaterTransport {
    public Ship(String name, String brand, String color, int seatingCapacity, double cost, boolean hasPropellers) {
        super(name, brand, color, seatingCapacity, cost, hasPropellers);
    }
}

class Submarine extends WaterTransport {
    public Submarine(String name, String brand, String color, int seatingCapacity, double cost, boolean hasPropellers) {
        super(name, brand, color, seatingCapacity, cost, hasPropellers);
    }
}

class Boat extends WaterTransport
 {
    public Boat(String name, String brand, String color, int seatingCapacity, double cost, boolean hasPropellers) {
        super(name, brand, color, seatingCapacity, cost, hasPropellers);
    }
}
abstract class AirTransport extends Vehical
{
    public AirTransport(String name, String brand, String color, int seatingCapacity, double cost, int numberOfWheels) 
    {
         super(name, brand, color, seatingCapacity, cost);
       
    }
    abstract void drive();
        
    abstract void brake();   
}
class Helecopter extends AirTransport
{
    int numberOfBlades;
    public Helecopter(String name, String brand, String color, int seatingCapacity, double cost, int numberOfBlades)
    {
        super(name, brand, color, seatingCapacity, cost);
        this.numberOfBlades = numberOfBlades;
    }
    void drive() {
        
        System.out.println("Driving on Air.");
    }

     
    void brake() {
        
        System.out.println("Applying brakes on Air.");
    }
}

 class Test 
 {
    public static void main(String[] args) {
        
        Cycle cycle = new Cycle("Atlas", "Hero", "Red", 1, 5000.0, 2);
        Bike bike = new Bike("Shine", "Honda", "Blue", 2, 12000.0, 2);
        Car car = new Car("Car", "Brand", "Black", 4, 100000.0, 4);
        Ship ship = new Ship("Titanic", "The World", "White", 100, 10000000.0, true);
        Submarine submarine = new Submarine("Submarine", "India", "Yellow", 20, 500000.0, false);
        Boat boat = new Boat("Boat", "America", "Green", 5, 50000.0, false);

        System.out.println("The Name of Cycle Is:"+cycle.name);
        System.out.println("The Colur of Cycle is "+cycle.color);
        System.out.println("The Brand of Cycle is: "+cycle.brand);
        System.out.println("The Seating Capacity of "+cycle.name+ "is: "+cycle.seatingCapacity);
        System.out.println("The Cost of "+cycle.name+ "is: "+cycle.cost);
        System.out.println("The Number  of Wheels in "+cycle.name+ " is: "+cycle.numberOfWheels);
        cycle.drive();
        cycle.brake();
        System.out.println("                                                                      ");
        System.out.println("The Name of Bike Is:"+bike.name);
        System.out.println("The Colur of Bike is "+bike.color);
        System.out.println("The Brand of Bike is: "+bike.brand);
        System.out.println("The Seating Capacity of "+bike.name+ "is: "+bike.seatingCapacity);
        System.out.println("The Cost of "+bike.name+ "is: "+bike.cost);
        System.out.println("The Number  of Wheels in "+bike.name+ " is: "+bike.numberOfWheels);
        bike.drive();
        bike.brake();
        System.out.println("                                                                      ");
        System.out.println("The Name of car Is:"+car.name);
        System.out.println("The Colur of car is "+car.color);
        System.out.println("The Brand of car is: "+car.brand);
        System.out.println("The Seating Capacity of "+car.name+ "is: "+car.seatingCapacity);
        System.out.println("The Cost of "+car.name+ "is: "+car.cost);
        System.out.println("The Number of Wheels in "+car.name+ " is: "+car.numberOfWheels);
        car.drive();
        car.brake();
        System.out.println("                                                                      ");
        System.out.println("The Name of Ship Is:"+ship.name);
        System.out.println("The Colur of Ship is "+ship.color);
        System.out.println("The Brand of Ship is: "+ship.brand);
        System.out.println("The Seating Capacity of "+ship.name+ "is: "+ship.seatingCapacity);
        System.out.println("The Cost of "+ship.name+ "is: "+ship.cost);
        System.out.println(ship.name+"Have Propellers");
        ship.drive();
        ship.brake();
        System.out.println("                                                                      ");
        System.out.println("The Name of submarine Is:"+submarine.name);
        System.out.println("The Colur of submarine is "+submarine.color);
        System.out.println("The Brand of submarine is: "+submarine.brand);
        System.out.println("The Seating Capacity of "+submarine.name+ "is: "+submarine.seatingCapacity);
        System.out.println("The Cost of "+submarine.name+ "is: "+submarine.cost);
        System.out.println(submarine.name+"Have Propellers");
        submarine.drive();
        submarine.brake();
        System.out.println("                                                                      ");
        System.out.println("The Name of Boat Is:"+boat.name);
        System.out.println("The Colur of Boat is "+boat.color);
        System.out.println("The Brand of Boat is: "+boat.brand);
        System.out.println("The Seating Capacity of "+boat.name+ "is: "+boat.seatingCapacity);
        System.out.println("The Cost of "+boat.name+ "is: "+boat.cost);
        System.out.println(boat.name+"Have Propellers");
        boat.drive();
        boat.brake();
        System.out.println("                                                                      ");



    
        
    }
}
