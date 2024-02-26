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
		int even=0,odd=0,esum=0,osum=0;
		
		System.out.println("\tenter the element:");
	  for(int i=0;i<n;i++)	
		a[i]=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
		  if(a[i]%2==0)
		  {
		     even++;
		     esum=esum+i;
		  }
		   else
		    odd++;
		    osum=osum+i;
		}
		
		System.out.println("Even Number Is "+even);
		//System.out.println("Even Number sum is Is "+esum);
		System.out.println("Odd number is "+odd);
		//System.out.println("Odd number sum is "+osum);
	}
}
		   
		
