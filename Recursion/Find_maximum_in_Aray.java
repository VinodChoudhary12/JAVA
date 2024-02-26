import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Test ob = new Test();
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
		
		System.out.println("Maximum Element is                    "+ob.max(a,n));
			
	}
	/*public int input(int a[],int index)
	{
		
	     if(index==0)
	     {
	      return a[0];
	     }
	     else
	     {
	      a[index-1]=in.nextInt();
	     } 
	      return a[index-1];
	}*/
	
	public int max(int a[],int index)
	{
	int  max;
		if (index==1)
			return a[0];
		
		else 
		{
			 max = max(a,index-1);
		 	if(max>a[index-1])
			{ 
				return  max;
			}
			else
				return a[index-1];
		}
	}
}



