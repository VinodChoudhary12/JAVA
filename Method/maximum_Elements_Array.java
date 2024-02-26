import java.util.Scanner;
class Test
{
	int max,secmax;
	public static void main(String[]args)                                  
	{ 
		Scanner sc = new Scanner (System.in);
	  	System.out.println("How Much Elements Do You want to Enter");
	  	int n= sc.nextInt();
	  	int a[] = new int[n];
	  	System.out.println("The Elements Are");
	  	for(int i = 0 ; i<n ;i++)
	  	{
	  		
	  		a[i]=sc.nextInt();
	  		System.out.println("a["+i+"]="+a[i]);
	  	}
		Test ob = new Test();
	  	//int max=ob.max(a,n);  if it is retrun type without argument
	  	System.out.println("The Maximum Elemets of This Array Is "+ob.max(a,n));	 		
	}
	
	
	 // with return type with argument
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
	 
	// public int secMax(int a[],int n,int max)
	 //{
	 
	 
	 
	 //}
	 	
	 

	 
	  
}
