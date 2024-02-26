import java.util.Scanner;
	class Divide
{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter The 1st number");
	int a=sc.nextInt();
	System.out.print("Enter The 2st number");
	int b=sc.nextInt();
	a=a^b;
	b=a^b;
	a=a^b;
	System.out.println(a);
	System.out.println(b);
	 
}
}

