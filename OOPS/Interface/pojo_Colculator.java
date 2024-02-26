import java.util.Scanner;
class pojo
{
	private int a,b,c;
	 public pojo()
	 {
		
	 }
	 public pojo(int a,int b,int c)
	 {
		this.a=a;
		this.b=b;
		this.c=c;
	 }
	 public pojo(int a,int b)
	 {
		this.a=a;
		this.b=b;
	 }
	 public void setA(int a)
	 {
		this.a=a;
	 }
	 public void  setB(int b)
	 {
		this.b=b;
	 }
	 public void setC(int c)
	 {
		this.c=c;
	 }
	 public int getA()
	 {
		 return this.a;
	 }
	 public int getB()
	 {
		 return this.b;
	 }
	 public int getC()
	 {
		 return this.c;
	 }

}

interface Calculator
{
	public abstract int calculate(int a,int b,int c);
	public abstract int calculate(int a,int b);
}
class BL
{
	pojo p;
	public BL(pojo p)
	{
		this.p=p;
	}
	Calculator ref1 = new Calculator()
	{
		public int calculate(int a,int b,int c)
		{
			return p.getA()+p.getB()+p.getC();
		}
		public int calculate(int a,int b)
		{
			return 0;
		}
	};
	Calculator ref2 = new Calculator()
	{
		public int calculate(int a,int b,int c)
		{
			return p.getA()-p.getB()-p.getC();
		}
		public int calculate(int a,int b)
		{
			return 0;
		}
	};
	Calculator ref3 = new Calculator()
	{
		public int calculate(int a,int b,int c)
		{
			return p.getA()*p.getB()*p.getC();
		}
		public int calculate(int a,int b)
		{
			return 0;
		}
	};
	Calculator ref4 = new Calculator()
	{
		public int calculate(int a,int b)
		{
			return p.getA()+p.getB();
		}
		public int calculate(int a,int b,int c)
		{
			return 0;
		}
	};
	Calculator ref5 = new Calculator()
	{
		public int calculate(int a,int b)
		{
			return p.getA()-p.getB();
		}
		public int calculate(int a,int b,int c)
		{
			return 0;
		}
	};
	Calculator ref6 = new Calculator()
	{
		public int calculate(int a,int b)
		{
			return p.getA()*p.getB();
		}
		public int calculate(int a,int b,int c)
		{
			return 0;
		}
	};
}
class Test
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		pojo p = new pojo();
		BL ob = new BL(p); 
		System.out.println("\t Press 1 For Input Two Numbers:");
		System.out.println("\t Press 2 For Input Three Numbers:");
		System.out.println("\t Enter The Choice:");
		int ch = sc.nextInt();
		switch(ch)
		{
			case 1:
					System.out.println("\t Press 1 For Addition:");
					System.out.println("\t Press 2 For Substraction:");
					System.out.println("\t Press 3 For Multiplication:");
					System.out.println("\t Enter The Choice:");
					int ca = sc.nextInt();
					switch(ca)
					{
						case 1:
								System.out.println("Enter First Number:");
								int a= sc.nextInt();
								System.out.println("Enter Second Number:");
								int b= sc.nextInt();
				
								System.out.println("The Rusult is: "+ob.ref1.calculate(a,b));
						case 2:
								System.out.println("Enter First Number:");
								a= sc.nextInt();
								System.out.println("Enter Second Number:");
								b= sc.nextInt();
								System.out.println("The Rusult is: "+ob.ref2.calculate(a,b));
						case 3:
								System.out.println("Enter First Number:");
								a= sc.nextInt();
								System.out.println("Enter Second Number:");
								b= sc.nextInt();
								System.out.println("The Rusult is: "+ob.ref3.calculate(a,b));			
					}
			case 2:
					System.out.println("\t Press 1 For Addition:");
					System.out.println("\t Press 2 For Substraction:");
					System.out.println("\t Press 3 For Multiplication:");
					System.out.println("\t Enter The Choice:");
					int two = sc.nextInt();
					switch(two)
					{
						case 1:
								System.out.println("Enter First Number:");
								int a= sc.nextInt();
								System.out.println("Enter Second Number:");
								int b= sc.nextInt();
								System.out.println("Enter Third Number:");
								int c= sc.nextInt();
								System.out.println("The Rusult is: "+ob.ref1.calculate(a,b,c));
						case 2:
								System.out.println("Enter First Number:");
								a= sc.nextInt();
								System.out.println("Enter Second Number:");
								b= sc.nextInt();
								System.out.println("Enter Third Number:");
								c= sc.nextInt();
								System.out.println("The Rusult is: "+ob.ref2.calculate(a,b,c));
						case 3:
								System.out.println("Enter First Number:");
								a= sc.nextInt();
								System.out.println("Enter Second Number:");
								b= sc.nextInt();
								System.out.println("Enter Third Number:");
								c= sc.nextInt();
								System.out.println("The Rusult is: "+ob.ref3.calculate(a,b,c));			
					}	
		}
		
	}
}