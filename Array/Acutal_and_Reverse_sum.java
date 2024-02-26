import java.lang.String;
import java.util.Scanner;
class Test
{
	public static void main(String[]args)
	{
	       int  i=0,temp=0;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int b[]=new int[10];
		int c[]=new int[10];
		System.out.println("\tenter the element:");
		int n=sc.nextInt();
		System.out.println("\tThe Elements are ");
	  for( i=0;i<n;i++)	
	     {
		a[i]=sc.nextInt();
	     }
	      
	      for( i=0;i<n;i++)	
	     {
		b[i]=a[i];
		
	     }
	     System.out.println("\tThe Acutal Array is ");
	   
	    
	    for( i=0;i<n/2;i++)
	     {
	      temp=a[i];
	      a[i]=a[n-(i+1)];
	      a[n-(i+1)]=temp;
	     }
	    
	    for( i=0;i<n;i++)
	    {
	     System.out.println("\ta["+i+"]="+b[i]);
	     //System.out.println("\tThe Reverse Array is");
	      //for(int i=0;i<n;i++)
	    System.out.println("\ta["+i+"]="+a[i]);
	    //System.out.println("Sum of Array index");
	    System.out.println("\tThe sum of"+a[i]+" And "+b[i]+" Is "+(c[i]=(a[i]+b[i])));
	   }
	    
	     
	    }
	    
}

	       
	    
	    
