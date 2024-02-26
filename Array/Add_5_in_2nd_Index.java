import java.lang.String;
import java.util.Scanner;
class Test
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("\tenter the element:");
		int n=sc.nextInt();
		System.out.println("\tThe Elements are ");
	  for(int i=0;i<n;i++)	
	     {
		a[i]=sc.nextInt();
		
	     }
	    for(int i=0;i<n;i++)
	    System.out.println("\ta["+i+"]="+a[i]);
	     for(int i=0;i<n;i++)
	       {
	        
	         if(a[i]%2!=0)
	         {
	           System.out.println("\ta["+i+"]="+(a[i]+5));
	         }
	         else
	          System.out.println("\ta["+i+"]="+a[i]);
	       }
	 }
}
		
