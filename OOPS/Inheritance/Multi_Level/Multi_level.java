import java.util.Scanner;
class Area 
{
	int l,b;
	public void setData(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	public int Area()
	{
		return this.l*this.b;
	}
}
class Volume extends Area
{
	int h;
	public void setData(int l,int b,int h)
	{
		setData(l,b);
		this.h=h;
	}
	public int Volume()
	{
		return Area()*h;
	}
}
class Density extends Volume
{
	 private double m;
	public void setData(int l,int b,int h,double m)
	{
		setData(l,b,h);
		this.m=m;
	}
	public double Density()
	{
		return Volume()/m;
	}
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Density ob = new Density();
		System.out.println("Enter TWO Number For Area");
		int a =sc.nextInt();
		int b =sc.nextInt();
		//ob.setData(a,b);
		System.out.println("Enter Three Number For Volume");
		//a =sc.nextInt();
		//b =sc.nextInt();
		int c =sc.nextInt();
		//ob.setData(a,b,c);
		System.out.println("Enter Mass");
		double m=sc.nextInt();
		ob.setData(a,b,c,m);
		System.out.println("The Area Is:"+ob.Area());
		System.out.println("The Volume Is:"+ob.Volume());
		System.out.println("The Density Is:"+ob.Density());
	}
}
		

		