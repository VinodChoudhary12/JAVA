abstract class Vehical
{
    private String name;
    private String brand;
    private String color;
    private int capacity;
    private int cost;
    public Vehical(String name, String brand, String color, int capacity, int cost) 
    {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.capacity = capacity;
        this.cost = cost;
    }
    
    public String getName() 
    {
        return name;
    }
    public void setName(String name)
     {
        this.name = name;
    }
    public String getBrand() 
    {
        return brand;
    }
    public void setBrand(String brand) 
    {
        this.brand = brand;
    }
    public String getColor()
     {
        return color;
    }
    public void setColor(String color)
     {
        this.color = color;
    }
    public int getCapacity()
     {
        return capacity;
    }
    public void setCapacity(int capacity)
     {
        this.capacity = capacity;
    }
    public int getCost()
     {
        return cost;
    }
    public void setCost(int cost) 
    {
        this.cost = cost;
    }
    public abstract void Display();
    public abstract void Drive();
    public abstract void Break();
}
abstract class LandTransport extends Vehical
{
     private int NumberOfWheels;
    public LandTransport(String name, String brand, String color, int capacity, int cost, int numberOfWheels) {
        super(name, brand, color, capacity, cost);
        NumberOfWheels = numberOfWheels;
    }
    public int getNumberOfWheels() {
        return NumberOfWheels;
    }
    public void setNumberOfWheels(int numberOfWheels) {
        NumberOfWheels = numberOfWheels;
    }

    
   
    

}