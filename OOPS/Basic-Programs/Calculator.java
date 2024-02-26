import java.util.Scanner;
class Calculator
{
	private double a,b;
	public void setData(double a,double b)
	{
		this.a=a;
		this.b=b;
	}
	public double add()
	{
		return this.a+this.b;
	}
	public double sub()
	{
		return this.a-this.b;
	}
	public double multi()
	{
		return this.a*this.b;
	}
	public double div()
	{
		return this.a/this.b;
	}
	public double mod()
	{
		return this.a%this.b;
	}
}
class Test
{
	public static void main(String args[])
	{
		int x,y,ch;
		double res;
		Scanner sc = new Scanner(System.in);
		Calculator ob = new Calculator();
		
	do
	{
		System.out.println("\tPress 1 for Addition\n\tpress 2 for Subtraction"); 
		System.out.println("\tPress 3 for Multiplication\n\tpress 4 for Division"); 
		System.out.println("\tPress 5 for Modules\n\tpress 6 for Exit"); 
		System.out.println("\tEnter Your Choice:"); 
		ch = sc.nextInt();
		switch(ch)
		{
			case 1:
				System.out.println("Enter The First Number");
				x=sc.nextInt();
				System.out.println("Enter The Two Number");
				y=sc.nextInt();
				ob.setData(x,y);
				res=ob.add();
				System.out.println("Result:"+res);
				break;
			case 2:
				System.out.println("Enter The First Number");
				x=sc.nextInt();
				System.out.println("Enter The Two Number");
				y=sc.nextInt();
				ob.setData(x,y);
				res=ob.sub();
				System.out.println("Result:"+res);
				break;
			case 3:
				System.out.println("Enter The First Number");
				x=sc.nextInt();
				System.out.println("Enter The Two Number");
				y=sc.nextInt();
				ob.setData(x,y);
				res=ob.multi();
				System.out.println("Result:"+res);
				break;
			case 4:
				System.out.println("Enter The First Number");
				x=sc.nextInt();
				System.out.println("Enter The Two Number");
				y=sc.nextInt();
				ob.setData(x,y);
				res=ob.div();
				System.out.println("Result:"+res);
				break;
			case 5:
				System.out.println("Enter The First Number");
				x=sc.nextInt();
				System.out.println("Enter The Two Number");
				y=sc.nextInt();
				ob.setData(x,y);
				res=ob.mod();
				System.out.println("Result:"+res);
				break;
			}
		}
		while(ch!=6);
	}
}
			
				
				
		
	
	
