//find The sum of natural number
import java.util.Scanner;
class Sum
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Nmber");
		int n = sc.nextInt();
		Sum ob =new Sum();
		
		
		System.out.println(ob.sum(5));
	}
	public int sum(int n)
	{	
		int sum=0;
		int s=1;
		if(n==1)
			 s=1;
		else
			
			s=sum(n-1)+n;	
		return s;
	
	
	}
}
