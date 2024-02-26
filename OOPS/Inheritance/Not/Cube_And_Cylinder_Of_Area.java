//area of cube:(6*a)
//Area of Cylinder:res=(2*3.14*a*b)+(2+3.14*a*a);
import java.util.Scanner;
class Cube
{
	int a;
	public void setA(int a)
	{
		this.a=a;
	}
	public int Cube()
	{
		return 6*this.a;
	}
}
class Cylinder extends Cube
{
	private int b;
	public void setData(int a,int b)
	{
		setA(a);
		this.b=b;
	}
	public double Cylinder()
	{
		return 2*3.14*this.a*this.b+2+3.14*this.a*this.a;
	}
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Cylinder ob = new Cylinder();
		System.out.println("Enter The Side:");
		int a=sc.nextInt();
		ob.setA(a);
		System.out.println("The Area OF Cube Is: "+ob.Cube());
		
		System.out.println("Enter The Two Sides of Cylinder:");
		a=sc.nextInt();
		int b = sc.nextInt();
		ob.setData(a,b);
		System.out.println("The Area Of Cylinder Is: "+ob.Cylinder());
	}
}