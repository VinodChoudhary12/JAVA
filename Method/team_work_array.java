
//count the enterd elements is present or not... if yes than how many times its present 
import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
	    
	    	boolean x =true;
		System.out.println("Press 1 for sum of elements of array");
		System.out.println("Press 2 for reverse the array");
		System.out.println("Press 3 for find minimum elemts of aray");
		System.out.println("Press 4 for find maximum elemrnts of array");
		System.out.println("Press 5 for second minimum in array ");
		System.out.println("Press 6 for second maximum in array ");
		System.out.println("Press 7 for entered value between  150 to 250 in print");
		System.out.println("Press 8 for print value  greater then 200");
		System.out.println("Press 9 for print value smaller than 150:");
		System.out.println("Press 10 for Exit");
	do
	{
		System.out.println("Enter Your Choice");
		int ch =sc.nextInt();
		Test ob = new Test();
		System.out.println("How many elements do you want to entered");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Your Entered Elements is");
		for(int i =0; i<n; i++)
			a[i] = sc.nextInt();
		System.out.println("The Elements are");
		for(int i =0; i<n; i++)
			System.out.println("a["+i+"]="+a[i]);		
		switch(ch)
		{
			case 1:
				int sum=ob.sum(n,a);// calling sum method
				System.out.println("The Of All Elements is "+sum);
				break;
			case 2:
				int b[]=ob.rev(n,a);// Calling rev method
				for(int i =0; i<n; i++)
					System.out.println("a["+i+"]="+b[i]);
				break;
			case 3:
				int min=ob.min(n,a);
				System.out.println("The  minimum Elements is "+min);
				break;	
				
			case 4:
				int max=ob.max(n,a);
				System.out.println("The  maximum Elements is "+max);
				break;
			case 5:
				int secmin=ob.secMin(n,a);
				System.out.println("The Second Minimum is "+secmin);
				break;
			case 6:
				int secmax=ob.secMax(n,a);
				System.out.println("The Second Maximum is "+secmax);
				break;
			case 7:
				ob.between(n,a);
				break;
			case 8:
				ob.greater(n,a);
				break;
			case 9:
				ob.samaller(n,a);
				break;
			case 10:
				x=false;
			default:
				System.out.println("Wrong Input");
		}
	    }while(x);			
	}
	public int sum(int n,int a[])
	{
		int sum=0;
		for(int i=1; i<=n; i++)
			sum=sum+i;
		return sum;
	}
	public int[] rev(int n, int a[])
	{
		
		for(int i=0; i<n/2; i++)
		{
			int temp=a[i];
			a[i]=a[n-i-1];
			a[n-i-1]=temp;
		}
		System.out.println("Reverse Elements are");	
		return a;
	}
	public int min(int n,int a[])
	{
		int min = a[0];
		for(int i = 1; i<n ; i++)
			if(min>a[i])
			{
				min=a[i];

			}
			return min;
	}
	public int max(int n,int a[])
	{
		int max = a[0];
		for(int i = 1; i<n ; i++)
			if(max<a[i])
			{
				max=a[i];

			}
			return max;
	}
	public int secMin(int n, int a[])
	{
	
		int min =a[0];
		int secmin=a[0];
		for(int i = 0 ; i < n; i++)
		{
			if(min>a[i])
			{
				secmin =min;
				min=a[i];
			}
			else if(secmin > a[i]&&min<a[i] )
			{
				secmin=a[i];
			}
		}
		return secmin;
		
	}
	public int secMax(int n, int a[])
	{
		int max =0;
		int secmax = 0;
		for(int i =0 ; i<n;i++)
		{
			if(max<a[i])
			{	
				secmax=max;
				max=a[i];
			}
			 else if(secmax<a[i]&&max>a[i])
			{
				secmax=a[i];
			}
		}
			return secmax;
	}
	public void between(int n,int a[])
	{
		System.out.println("between 150 & 250 Elements are");
		for(int i=0;i<n;i++)
		{
			if(a[i]>150&&a[i]<250)
				System.out.println("a["+i+"]="+a[i]);
		}
	}	
	public void greater(int n,int a[])
	{
		System.out.println(" greater then 200 are");
		for(int i=0;i<n;i++)
		{
			if(a[i]>200)
				System.out.println("a["+i+"]="+a[i]);
		}
	}
	
	public void samaller(int n,int a[])
	{
		System.out.println(" smaller then 150 are");
		for(int i=0;i<n;i++)
		{
			if(a[i]<150)
				System.out.println("a["+i+"]="+a[i]);
			
		}
	}		
}
	
	
