import java.util.Scanner;
class Calc
{
	int a,b,n;
	
	public static void main(String args[])
	{	int a,b;
	   	Scanner sc= new Scanner(System.in);
		System.out.println("Press 1 for Addition");
		System.out.println("Press 2 for Subtrction" );
		System.out.println("Press 3 for multiplication");
		System.out.println("Press 4 for Division");
		int n=sc.nextInt();
		System.out.println("Entet two numbers");
		System.out.println("The First numbers is");
		 a=sc.nextInt();
		System.out.println("The Second numbers is");
		 b=sc.nextInt();
		 Calc ob = new Calc(); 
		 switch(n)
	   {
	   	
	     	case 1: ob.add(a,b);
	     	break;
	     	case 2: ob.min(a,b);
	     	break;
	     	case 3: ob.multi(a,b);
	     	break;
	     	case 4: ob.div(a,b);
	     	break;
	     	default:
	     	System.out.println("You Enterd Wrong key");			 	
	   }
		
	}
	 public void add(int a,int b)
	 {	
	 	System.out.println("The sum of " +a+"And "+b+" Is "+(a+b));	
	 }
	 public void add(double a,int b)
	 {	
	 	System.out.println("The sum of " +a+"And "+b+" Is "+(a+b));	
	 }
	 public void add(int  a,double b)
	 {	
	 	System.out.println("The sum of " +a+"And "+b+" Is "+(a+b));	
	 }
	 public void min(int a,int b)
	 {	
	 	System.out.println("The Subtraction of " +a+"And "+b+" Is "+(a-b));	
	 }
	 public void min(double a,int b)
	 {	
	 	System.out.println("The Subtraction of " +a+"And "+b+" Is "+(a-b));	
	 }
	 public void min(int a,double b)
	 {	
	 	System.out.println("The Subtraction of " +a+"And "+b+" Is "+(a-b));	
	 }
	 
	 public void multi(int a,int b)
	 {	
	 	System.out.println("The Multiplication of " +a+"And "+b+" Is "+(a*b));	
	 }
	 public void multi(double a,int b)
	 {	
	 	System.out.println("The Multiplication of " +a+"And "+b+" Is "+(a*b));	
	 }
	 public void multi(int a,double b)
	 {	
	 	System.out.println("The Multiplication of " +a+"And "+b+" Is "+(a*b));	
	 }
	 public void div(int a,int b)
	 {	
	 	System.out.println("The Division of " +a+"And "+b+" Is "+(a/b));	
	 }
	 public void div(double a,int b)
	 {	
	 	System.out.println("The Division of " +a+"And "+b+" Is "+(a/b));	
	 }
	 public void div(int a,double b)
	 {	
	 	System.out.println("The Division of " +a+"And "+b+" Is "+(a/b));	
	 }
	 
	
}
	 
