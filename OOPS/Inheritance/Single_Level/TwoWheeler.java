class TwoWheeler
{
	String brand;
	int speed;
	void setData(String brand, int speed)
	{
		this.brand  = brand;
		this.speed = speed; 
	}
	public void getTwoWheeler()
	{
		System.out.println("Brand :"+brand+"\nSpeed :"+speed);
	}
	
}
class Motorcycle extends TwoWheeler
{
	int average;
	int gears;
	public void setData(String brand,int speed, int average, int gears)
	{
		this.setData(brand,speed);
		this.average = average;
		this.gears = gears;
		
	}
	public void getMotorcycle()
	{
	  System.out.println("Average : "+average+"\nNumber of gears : "+gears);
	}
	
}
class Test
{
	public static void main(String args [])
	{
		Motorcycle ob = new Motorcycle();
		ob.setData("Yamaha",50,40,4);
		ob.getTwoWheeler();
		ob.getMotorcycle();
	}
}