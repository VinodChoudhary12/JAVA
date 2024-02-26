import java.util.Scanner;
class Square
{
	 int a;
	public void setA(int a)
	{
		this.a=a;
	}
	public int Square()
	{
		return this.a*this.a;
	}
}
class Additon extends Square
{
	private int b;
	public void setData(int a,int b)
	{
		setA(a);
		this.b=b;
	}
	public int add()
	{
		return this.a+this.b;
	}
	
	
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Additon ob = new Additon();
		System.out.println("Enter The number For Square:");
		int n=sc.nextInt();
		ob.setA(n);
		System.out.println("Enter The number For Addition:");
		n=sc.nextInt();
		int p=sc.nextInt();
		ob.setData(n,p);
		System.out.println("Square="+ob.Square());
		System.out.println("Addition="+ob.add());
	}
}
		
	