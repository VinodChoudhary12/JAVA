import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		int a[]= new int[10];
		System.out.println("How many elements do you want to store in Array");
		int n = sc.nextInt();
		System.out.println("The Elements are");
		for(int i=0; i<n ;i++)
		{
			a[i]= sc.nextInt();
		
		}
		System.out.println("The Array Is");
		for(int i=0; i<n ;i++)
		{
		
			System.out.println("a["+i+"]="+a[i]);
		}
		Test ob = new Test();
		System.out.println("The Minimum Elements:"+ob.min(a,n));
			
	}
	
	public int min(int a[],int index)
	{
	int  min;
		if (index==1)
			return a[0];
		
		else 
		{
			 min = min(a,index-1);
		 	if(min<a[index-1])
			{ 
				return  min;
			}
			else
				return a[index-1];
		}
	}
}
