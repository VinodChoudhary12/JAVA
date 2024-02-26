import java.util.Scanner;
class Test
{
	
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("How many elements do you want to entered");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Your Entered Elements is");
		for(int i =0; i<n; i++)
			a[i] = sc.nextInt();
		System.out.println("The Elements are");
		
		for(int i =0; i<n; i++)
			System.out.println("a["+i+"]="+a[i]);	
		int min =a[0];
		int secmin=a[0];
		for(int i = 0 ; i < n; i++)
		{
			if(min>a[i])
			{
				secmin=min;
				min=a[i];
			}
			else if(secmin >a[i]&&min<a[i])
			{
			
				secmin=a[i];
			}
		}
		System.out.println("Minimum "+secmin);	
		
		
		
		
		// i am on github
	}	
}	
		
	

 

     

 
 
 
