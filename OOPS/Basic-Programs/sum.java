import java.util.Scanner;
class Addition
{
	private int a,b;
	public void setData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int x=sc.nextInt();
		System.out.println("Enter Second Number");
		int y=sc.nextInt();
		this.a=x;
		this.b=y;
	oo	//System.out.println("A="+a+" "+"B="+b);
	}
	public void getData()
	{
		System.out.println("A="+this.a+" "+"B="+this.b);
	}
	public int add()
	{
	
		int c=this.a+this.b;
		return c;
	}
}
class Test
{
	public static void main(String args[])
	{
		
		System.out.println("Welcome in main");
		Addition ob = new Addition();
		ob.getData(); 
		ob.setData();
		ob.getData(); 
		int res = ob.add();
		System.out.println("Addition ="+res);
	}
}

















