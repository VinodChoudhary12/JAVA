//2 4 6 8 10
import java.util.Scanner;
class Test
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		Test ob = new Test();
		ob.even(5);
		System.out.println("DO You want to ODD Number Then print 1");
		int ch=sc.nextInt();
		if(ch==1)
		{
			ob.odd(5);
		}
	
	
	}
	
	public int even(int n)
	{
		
		
		int s=1;
		if(n==1)
			s=2;
		else
		
			s=even(n-1);
			System.out.print(n*2+" ");
		return s;			
	}
	
	public int odd(int n)
	{
		int s=1;
		if(n==1)
			s=1;
		else
			s=odd(n-1);
			System.out.print((n*2)-1+" ");
			return s;
	
	
	
	
	}
}
