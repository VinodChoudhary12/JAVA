import java.util.Scanner;
interface Calculator
{
	public abstract int Calculate(int a,int b);
	public abstract int Calculat(int a);
	
}
class MyCalculate  // BL Class
{
	Calculator ref1 = new Calculator()//Ananomus class with having reference:
	{
		//@override 
		public int Calculate(int a,int b)
		{
			return a+b;
		}
		public int Calculat(int a)
		{
			return 0;
		}
	};//Semi coloun Is compolsary for Ananomus class
	Calculator ref2 = new Calculator()
	{
		//@override
		public int Calculate(int a,int b)
		{
			return a-b;
		}
		public int Calculat(int a)
		{
			return 0;
		}
	};//Semi coloun Is compolsary for Ananomus class
	Calculator ref3 = new Calculator()
	{
		//@override
		public int Calculate(int a,int b)
		{
			return a*b;
		}
		public int Calculat(int a)
		{
			return 0;
		}
	};//Semi coloun Is compolsary for Ananomus class
	 Calculator ref4 = new Calculator()
	 {
		//@override
		 public int Calculat(int a)
		{
			 return a*a;
		 }
		 public int Calculate(int a,int b)
		{
			return 0;
		}
	};   //Semi coloun Is compolsary for Ananomus class
	Calculator ref5 = new Calculator()
	{
		
		//@override
		public int Calculat(int a)
		{
			return ref4.Calculat(a)*a;
		}
		public int Calculate(int a,int b)
		{
			return 0;
		}
	};//Semi coloun Is compolsary for Ananomus class
}
class Test
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int ch;
	do
	{
		MyCalculate ob = new MyCalculate();
		System.out.println("\tPress 1 For Addition:");
		System.out.println("\tPress 2 For Subtraction:");
		System.out.println("\tPress 3 For Multiplication:");
		System.out.println("\tPress 4 For Square:");
		System.out.println("\tPress 5 For Cube:");
		System.out.println("\tPress 6 For Exit:");
		System.out.println("Enter Your Choice:");
		ch = sc.nextInt();
		switch(ch)
		{
			case 1:
					System.out.println("Enter The First Number:");
					int a =sc.nextInt();
					System.out.println("Enter The Second Number:");
					int b = sc.nextInt();
					System.out.println("The Result Is: "+ob.ref1.Calculate(a,b));
					break;
			case 2:
					System.out.println("Enter The First Number:");
					a = sc.nextInt();
					System.out.println("Enter The Second Number:");
					b = sc.nextInt();
					System.out.println("The Result Is: "+ob.ref2.Calculate(a,b));
					break;
			case 3:
					System.out.println("Enter The First Number:");
					a = sc.nextInt();
					System.out.println("Enter The Second Number:");
					b = sc.nextInt();
					System.out.println("The Result Is: "+ob.ref3.Calculate(a,b));
					break;
			case 4:
					System.out.println("Enter The First Number:");
					a = sc.nextInt();
					System.out.println("The Result Is: "+ob.ref4.Calculat(a));
			case 5:
					 System.out.println("Enter The First Number:");
					 a = sc.nextInt();
					 System.out.println("The Result Is: "+ob.ref5.Calculat(a));
					
					
					
		}
	}while(ch!=5);
	}
}
	