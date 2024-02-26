//radius of Cone")(3.14*a*b)+(3.14*a*a);
//radius of Cirlce")
import java.util.Scanner;
class Circle
{
	int a;
	public void setA(int a)
	{
		this.a=a;
	}
	
	public double Circle()
	{
		return (3.14*a*a);
	}
}
class Cone extends Circle
{
	private int b;
	public void setData(int a,int b)
	{
		setA(a);
		this.b=b;
	}
	
	public double Cone()
	{
		return (3.14*a*b)+(3.14*a*a);
	}
}

class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Cone ob  = new Cone(); 
		System.out.println("Enter radius of Cirlce");
		int a=sc.nextInt();
		ob.setA(a);
		System.out.println("The area of circle Is: "+ob.Circle());
		System.out.println("Enter The Lenth of Cone");
		a=sc.nextInt();
		System.out.println("Enter The Width of Cone");
		int b=sc.nextInt();
		ob.setData(a,b);
		System.out.println("The area of ractangle is  of "+ob.Cone());
	}
}
		