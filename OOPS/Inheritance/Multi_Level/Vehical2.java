class Vehicle {
    private String brand;
    private String model;
    private int year;
    private String color;
    private double price;

    public Vehicle(String brand, String model, int year, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    // Getter methods
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    // Setter methods
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class Car extends Vehicle {
    private int numOfDoors;

    public Car(String brand, String model, int year, String color, double price, int numOfDoors) {
        super(brand, model, year, color, price);
        this.numOfDoors = numOfDoors;
    }

    // Getter method
    public int getNumOfDoors() {
        return numOfDoors;
    }

    // Setter method
    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }
}

class Supercar extends Car {
    private String engineType;

    public Supercar(String brand, String model, int year, String color, double price, int numOfDoors, String engineType) {
        super(brand, model, year, color, price, numOfDoors);
        this.engineType = engineType;
    }

    // Getter method
    public String getEngineType() {
        return engineType;
    }

    // Setter method
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}

public class Test 
{
    public static void main(String[] args) 
    {

        Supercar ob = new Supercar("Ferrari", "488 GTB", 2022,"Red");
    }
}
