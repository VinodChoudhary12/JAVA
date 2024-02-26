import java.util.Scanner;
class Fruit
{
	String test;
	String color;
	String smell;
	public void setData(String test,String color,String smell)
	{
		this.test=test;
		this.colork=color;
		this.smell=smell;
	}
	public String getTest()
	{
		return this.test;
	}
	public String getColor()
	{
		return this.color;
	}
	public String getSmell()
	{
		return this.smell;
	}	
}
class Mango extends Fruit
{
	String name;
	String tecture;
	String shape;
	int price;
	public void setData(String name String test,String color,String smell,String tecture,String shape,int price)
	{
		setData(test,color,smell)
		this.name=name;
		this.tecture=tecture;
		this.shape=shape;
		this.price=price;
	}
	public String getTecture
	{
		return tecture;
	}
	public String getShape
	{
		return shape;
	}
	public int getPrice
	{
		return price;
	}
	public String getName
	{
		return name;
	}
	public void print()
	{
		System.out.println("The Test of Mango is +"getTest());
		System.out.println("The Color of Mango is +"getColor());
		System.out.println("The Smell of Mango is +"getSmell());
	}
}

class Test
{
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in)
			Mango ob = new Mango();
			System.out.println("Enter The Name of Fruit:");
			String name = sc.nextLine();
			
			System.out.println("Enter The Tast of "+name);
			String tast = sc.nextLine();
			
			System.out.println("Enter The Smell of :"+name);
			String smell = sc.nextLine();
			
			System.out.println("Enter The Colur of :"+name);
			String color = sc.nextLine();
			
			System.out.println("Enter The Tecture of :"+name);
			String tecture = sc.nextLine();
			
			System.out.println("Enter The Shape of :"+name);
			String tecture = sc.nextLine();
			
			ob.setData(name, test,color,smell,tecture,shape,price)
			System.out.println("The Name of Fruit Is: "+ob.getName());
			System.out.println("The Tast of "+getName()+"Is :"+getTest);
			System.out.println("The Tast of "+getName()+"Is :"+
			