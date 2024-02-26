import java.util.Scanner;
class Area
{
	int lenght;
	int wirth;
	public void setData(int lenght,int wirth)
	{
		this.lenght=lenght;
		this.wirth=wirth;
	}
	public int Area()
	{
		return this.lenght*this.wirth;
	}
}
class Volume extends Area
{
	private int hieght;
	public void setData(int lenght,int wirth,int hieght)
	{
		setData(lenght,wirth);
		this.hieght=hieght;
	}
	public int Volume()
	{
		return Area()*this.hieght;
	}
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Volume ob = new Volume();
		System.out.println("Enter TWO Number For Area");
		int a =sc.nextInt();
		int b =sc.nextInt();
		ob.setData(a,b);
		System.out.println("The Area Is:"+ob.Area());
		System.out.println("Enter Three Number For Volume");
		a =sc.nextInt();
		b =sc.nextInt();
		int c =sc.nextInt();
		ob.setData(a,b,c);
		System.out.println("The Volume Is:"+ob.Volume());
	}
}
		