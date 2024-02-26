import java.util.Scanner;
class Shape
{
	int a;
	public void setA(int a)
	{
		this.a=a;
	}
	public int getA()
	{
		return a;
	}
}
 //class OneD extends Shape
 //{
	//private int b;
	//public void setData(int b)
	
		//this.b=b;
		
	// public int Square()
	// {
		// return getA()*getA();
	// }
	// public int Cube()
	// {
		// return Square()*getA();
	// }
// }
class TwoD extends Shape
{
	private int b;
	public void setB(int a,int b)
	{
		setA(a);
		this.b=b;
	}
	public int Area()
	{
		return this.a*this.b;
	}
}
// class ThreeD extends Shape
// {
		// private int c;
		// private void setC(int a,int b,int c)
		// {
			// setB(a,b);
			// this.c=c;
		// }
		// public int Volume()
		// {
			// return Area()*this.c;
		// }
// }
class Test
{
	public static void main(String args[])
	{ 	
		Scanner sc = new Scanner(System.in);
		//OneD  o = new OneD();
		TwoD  t = new TwoD();
		//ThreeD tree = new ThreeD();
		//System.out.println("Enter The Number:");
		//int a= sc.nextInt();
		//o.setA(a);
		//System.out.println("The Square of "+a+" Is"+o.Square());
		 System.out.println("Enter Two Number:");
		int a= sc.nextInt();
		int b = sc.nextInt();
		t.setB(a,b);
		System.out.println("The Area Is"+t.Area());
		// System.out.println("Enter Three Number:");
		// a= sc.nextInt();
		// b = sc.nextInt();
		// int c = sc.nextInt();
		// tree.setB(a,b,c);
		// System.out.println("The Square of "+a+" Is"+tree.Volume());
	}
}
		
		