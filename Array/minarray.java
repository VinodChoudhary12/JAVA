import java.lang.String;
import java.util.Scanner;
class Array
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("How many element you want to enter:");
		int n=sc.nextInt();
		int min=0;
		
		System.out.println("\tenter the element:");
		
		for(int i=0;i<n;i++)
			
		a[i]=sc.nextInt();
		
		min=a[0];
		
		for(int i=0;i<n;i++)
		{
				if(min>a[i])
				{
					min=a[i];
				}
		}
		System.out.println("\tarray min element="+min);
	}
}