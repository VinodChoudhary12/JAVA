
import java.util.Scanner;
class Test
{
	int sum = 0;
	public static void main(String args[])
	{	
		Test ob = new Test();
		System.out.println("The sum of elements are"+ob.sum());
		
	}
	
	public void sum()
	{
	
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
			System.out.println("The Sum of All Elements is "+sum);
	}
}
		
	
