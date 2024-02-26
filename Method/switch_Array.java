import java.util.Scanner;
class Test
{
	public static void main(String argxs[])
	{
		Test ob = new Test();
		System.out.println("Press 1 for Sum All Elements in Array");
		System.out.println("Press 2 for Find Maximum  Elements in Array");
		System.out.println("Press 3 For Find Minimum Elements in Array");
		//System.out.println("Press 4 for");
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Elemrents Do Want To Enter");
		int n = sc.nextInt();
		int a[] = new int [n];
		for(int i=0 ; i<n; i++)
			a[i]=sc.nextInt();
		for(int i=0 ; i<n; i++)
			System.out.println("a["+i+"]="+a[i]);
		System.out.println("Enter Your Choice");
		int ch.nextInt();
			
		switch(ch)
		{
		case 1:ob.sum();
		break;
		case 2:
		
		
		}
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
	public int max(int a[],int n)
	 {
	  	 max=a[0];
	  	for (int i=0; i<n; i++)
	  	{
	  		if(max<a[i])
	  		{
	  			max=a[i];
	  		}	
	  	}
	  		
	 	return max;
	 }	
	
	}
	
	
	
}

