// import java.util.Scanner;
class Area 
{
	int l,b;
	public Area(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	public int A()
	{
		return this.l*this.b;
	}
}
class Volume extends Area
{
	int h;
	public Volume(int l,int b,int h)
	{
		super(l,b);
		this.h=h;
	}
	public int V()
	{
		return A()*h;
	}
}
class Density extends Volume
{
	 private double m;
	public Density(int l,int b,int h,double m)
	{
		super(l,b,h);
		this.m=m;
	}
	public double D()
	{
		return V()/m;
	}
}
class Test
{
	// public static void main(String args[])
	public static void main(String[] args)
	{
		// Scanner sc = new Scanner(System.in);
		Density ob = new Density(2,2,2,98.5);
		// System.out.println("Enter TWO Number For Area");
		// int a =sc.nextInt();
		// int b =sc.nextInt();
		// ob.setData(a,b);
		// System.out.println("Enter Three Number For Volume");
		// a =sc.nextInt();
		// b =sc.nextInt();
		// int c =sc.nextInt();
		// ob.setData(a,b,c);
		// System.out.println("Enter Mass");
		// double m=sc.nextInt();
		// ob.setData(a,b,c,m);
		// ob.Density();
		System.out.println("The Area Is:"+ob.A());
		System.out.println("The Volume Is:"+ob.V());
		System.out.println("The Density Is:"+ob.D());
	}
}
		

		