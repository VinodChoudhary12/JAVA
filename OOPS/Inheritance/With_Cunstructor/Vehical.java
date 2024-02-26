 class Vehicle 
{
    String brand;
    String model;
    int year;
    String color;
    double price;
    public Vehicle(String brand, String model, int year, String color, double price)
	{
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }
}


class Car extends Vehicle 
{
    int Doors;

    public Car(String brand, String model, int year, String color, double price, int Doors) 
	{
        super(brand, model, year, color, price);
        this.Doors = Doors;
    }
}
class Supercar extends Car {
    private String engineType;

    public Supercar(String brand, String model, int year, String color, double price, int Doors, String engineType) {
        super(brand, model, year, color, price, Doors);
        this.engineType = engineType;
    }
	public String EngineType()
	{
		return engineType;
	}
}


class Test {
    public static void main(String[] args) {
        
        Supercar ob = new Supercar("Ferrari", "488 GTB", 2022, "Red", 350000.0, 2, "V8");

        // Accessing attributes using getter methods
        System.out.println("Brand: " + ob.brand);
        System.out.println("Model: " + ob.model);
        System.out.println("Year: " + ob.year);
        System.out.println("Color: " + ob.color);
        System.out.println("Price: " + ob.price);
        System.out.println("Number of Doors: " + ob.Doors);
        System.out.println("Engine Type: " + ob.EngineType());
    }
}
