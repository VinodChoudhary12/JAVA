
import java.util.Scanner;
class Test
{
	
	public static void main(String args[])
	{	
		Test ob = new Test();
		
		System.out.println("The Sum of All Elements is "+ob.sum());
	}
	
	public int sum()
	{
		int sum = 0;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Elements do you want to enter");
		int n=sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Array Elements are");
		for(int i=0;i<n;i++)
		{
			System.out.println("a["+i+"]="+a[i]);	
		}
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		return sum;	
			//System.out.println("The Sum of All Elements is "+sum);
	}
}
		
	
