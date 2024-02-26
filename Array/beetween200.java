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

		System.out.println("\tenter the element:");
		
		for(int i=0;i<n;i++)
	    a[i]=sc.nextInt();
	
	    System.out.println("enter element beetween 150 & 250");
		
		for(int i=0;i<n;i++)
		{
			if(a[i]>200)
			{
				System.out.println(a[i]);
			}
		}
	}
}