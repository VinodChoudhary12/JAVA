import java.util.Scanner;
class Greatest
{
	private double a,b,c,d;
	public void setData(int a,int b,int c,int d)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	public void grt()
	{
		if(a>b && a>c && a>d)
			System.out.println("A Is Greatest");
		else if(b>c && b>d)
			System.out.println("B Is Greatest");
		else if(c>d)
			System.out.println("C Is Greatest");
		else
			System.out.println("D Is Greatest");
	}
}
class Test
{
	public static void main(String args[])
	{
		Greatest ob = new Greatest();
		ob.setData(1,3,5,8);
		ob.grt();
	}
}	
	
	
	
	
	
	
	
	














