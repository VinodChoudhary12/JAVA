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
		int index=0,min=a[0],max=a[0],seclarg=a[0];
		
		System.out.println("\tenter the element:");
		
		for(int i=0;i<n;i++)
			
		a[i]=sc.nextInt();
		
		max=a[0];
		
		for(int i=0;i<n;i++)
		{
				if(max<a[i])
				{
					max=a[i];
				}
				else
				{
					min=a[i];
				}
				seclarg=min;
		}
		    for(int i=0;i<n;i++)
		  {
			if(a[i]>seclarg&&a[i]<max)
			{
				seclarg=a[i];
				index=i;
			}
		  }
		System.out.println("\tsecond large element is: a["+index+"]="+seclarg);
	}
}
