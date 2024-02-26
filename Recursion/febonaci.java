//for nth Term
import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		Test ob = new Test();
		System.out.println("Enter the Number");
		int n =sc.nextInt();
		System.out.println("The Result is");
		for(int i=0;i<n;i++)
		System.out.println(ob.fibo(i));
		
	}
	public int fibo(int n)
	{
		int s;
		if(n==0)
			s= 0;
		else if(n==1)
			s=1;
		else
			s=fibo(n-1)+fibo(n-2);
			return s;

	}
	
	
}
