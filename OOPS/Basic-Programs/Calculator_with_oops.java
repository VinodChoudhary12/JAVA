import java.util.Scanner;
class CalculatorPojo
{
	private double a,b,c;
	Scanner sc = new Scanner(System.in);
	
	public void setA(int a)
	{
		
		this.a=a;
	}
	public void setB()
	{
		System.out.println("Enter The Number");
		b=sc.nextInt();
		this.b=b;
	}
	public void setC()
	{
		System.out.println("Enter The Number");
		c=sc.nextInt();
		this.c=c;
	}
	public double getA()
	{
		return this.a;
	}
	public double getB()
	{
		return this.b;
	}
	public double getC()
	{
		return this.c;
	}
}

class opration
{
	public void square(CalculatorPojo ref)
	{
		System.out.println(ref.getA()*ref.getA());
	}
	public void cube(CalculatorPojo ref)
	{
		System.out.println(ref.getA()*ref.getA()*ref.getA());
	}
	
	public void addTwo(CalculatorPojo ref)
	{
		System.out.println(ref.getA()+ref.getB());
	}
	public void addThree(CalculatorPojo ref)
	{
		System.out.println(ref.getA()+ref.getB()+ref.getC());
	}
	public void subTwo(CalculatorPojo ref)
	{
		System.out.println(ref.getA()-ref.getB());
	}
	public void subThree(CalculatorPojo ref)
	{
		System.out.println(ref.getA()-ref.getB()-ref.getC());
	}
	public void multiTwo(CalculatorPojo ref)
	{
		System.out.println(ref.getA()*ref.getB());
	}
	public void multiThree(CalculatorPojo ref)
	{
		System.out.println(ref.getA()*ref.getB()*ref.getC());
	}
	public void divTwo(CalculatorPojo ref)
	{
		System.out.println(ref.getA()/ref.getB());
	}
	public void modTwo(CalculatorPojo ref)
	{
		System.out.println(ref.getA()%ref.getB());
	}
	
}	

class Test
{
	public void input(CalculatorPojo ob)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("The Square  Is:");
		int n = sc.nextInt();
		ob.setA(n);
		double a= ob.getA()*ob.getA();
		System.out.println("The Square  Is:"+a);
		
		
	}
	public static void main(String args[])
	{
		int ch;
		CalculatorPojo ob = new CalculatorPojo();
		opration clo = new opration();
		Test  t = new Test();
		do{
		
			Scanner sc = new Scanner(System.in);
		
		
			
		
			System.out.println("__________________________________________________________________________________________");
			System.out.println("|\tPress 1 For Square \t\t\t Press 2 For Cube			 |");
			System.out.println("|\tPress 3 For Addition Of Two Number  \t Press 4 For Addition Of Three Number    |");
			System.out.println("|\tPress 5 For Division Two Number  \t Press 6 For Modulas two Number		     |");
			System.out.println("|\tPress 7 For Multiply Two Number  \t Press 8 For Multiple Three Number|");
			System.out.println("|\tPress 9 For Exit                                                              	 |");
			System.out.println("|________________________________________________________________________________________|");
		
			System.out.println("Enter Your Choice:");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1:
						t.input(ob);
						break;
				/* case 2:
						ob.setA();
						System.out.println("The Cube  Is:");
						clo.cube(ob);
						break;
				case 3:
						ob.setA();
						ob.setB();
						System.out.println("The Addition Is:");
						clo.addTwo(ob);
						break;
				case 4:
						ob.setA();
						ob.setB();
						ob.setC();
						System.out.println("The Addition Is:");
						clo.addThree(ob);
						break;
				case 5:
						ob.setA();
						ob.setB();
						System.out.println("The Division Is:");
						clo.divTwo(ob);
						break;
				case 6:
						ob.setA();
						ob.setB();
						System.out.println("The Modulas Is:");
						clo.modTwo(ob);
						break;
				case 7:
						ob.setA();
						ob.setB();
						System.out.println("The Multiplication Is:");
						clo.multiTwo(ob);
						break;
				case 8:
						ob.setA();
						ob.setB();
						ob.setC();
						System.out.println("The Multiplication Is:");
						clo.multiThree(ob);
						break; */
			}										
		}while(ch!=9);
	}
}