import java.util.Scanner;
class Largest
{
	private int a,b,c;
	public void setData(Scanner sc)
	{
		System.out.println("Enter The First Number");
		int a = sc.nextInt();
		this.a=a;
		System.out.println("Enter The Second Number");
		int b = sc.nextInt();
		this.b=b;
		System.out.println("Enter The Third Number");
		int c = sc.nextInt();
		this.c=c;
		System.out.println("A="+a+"B="+b+"C="+c);
	}
	public void getData()
	{
	   System.out.println("A="+a+"B="+b+"C="+c);
	}
	public int Large()
	{
		if(a>b&&a>c)
			return a;
		else if(a<b&&c<b)
			return b;
		else 
			return c;
	}
}
class Test
{
	public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		Largest ob = new Largest();
		ob.setData(sc);
		ob.getData();
		int res = ob.Large();
		System.out.println("Result="+res);
	}
}
