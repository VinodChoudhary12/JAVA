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
		return this.a*this.a*this.a;
	}
}
class Ractangle extends Cube
{
	private int b;
	public void setData(int a,int b)
	{
		setA(a);
		this.b=b;
	}
	public int Ractangle()
	{
		return this.a*this.b;
	}
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Ractangle ob = new Ractangle();
		System.out.println("Enter The Side");
		int a = sc.nextInt();
		ob.setA(a);
		System.out.println("The Cube of "+a+" Is "+ob.Cube());
		System.out.println("Enter The Lenth of Ractangle");
		a=sc.nextInt();
		System.out.println("Enter The Width of Ractangle");
		int b=sc.nextInt();
		ob.setData(a,b);
		System.out.println("The area of ractangle is  of "+ob.Ractangle());
	}
}