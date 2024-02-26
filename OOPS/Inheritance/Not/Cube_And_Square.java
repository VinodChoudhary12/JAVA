import java.util.Scanner;
 //cube a*a+b*b+c*c+2*a*b+2*b*c+2*c*a
 //square = a*a+b*b+2*a*b;
 class Sq
 {
	 int a,b;
	 public void setAB(int a,int b)
	 {
		 this.a=a;
		 this.b=b;
	 }
	public int Sq()
	{
		return this.a*this.a+this.b*this.b+2*this.a*this.b;
	}
 }
 class Cu extends Sq
 {
	 private int c;
	 public void setABC(int a,int b,int c)
	 {
		 setAB(a,b);
		 this.c=c;
	 }
	public int Cu()
	{
		return this.a*this.a+this.b*this.b+this.c*this.c+2*this.a*this.b+2*this.b*this.c+2*this.c*this.a;
	}
}
class Test
{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		 Cu ob = new Cu();
		 System.out.println("Enter The Value of A");
		 int a = sc.nextInt();
		 System.out.println("Enter The Value of B");
		 int b = sc.nextInt();
		 ob.setAB(a,b);
		 System.out.println("The Square Formula is: "+ob.Sq());
		 System.out.println("Enter The Value of A");
		 a = sc.nextInt();
		 System.out.println("Enter The Value of B");
		 b = sc.nextInt();
		 System.out.println("Enter The Value of C");
		 int c = sc.nextInt();
		 ob.setABC(a,b,c);
		 System.out.println("The Cube Formula is: "+ob.Cu());
	}
 }
		 
		 
		 