import java.lang.String;
import java.util.Scanner;
class Test
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("How many element you want to enter:");
		int n=sc.nextInt();
		int count=0;
	
		System.out.println("\tenter the element:");
		
		for(int i=0;i<n;i++)
			
		a[i]=sc.nextInt();
		System.out.println("Enter searching element:");
		int num=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(num==a[i])
			{
				count++;
				System.out.println(i);
			}	
		}
		System.out.println("Repitaion of array element "+num+" is "+count+" time");
	}
}
		
			
