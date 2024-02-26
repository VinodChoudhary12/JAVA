,import java.lang.String;
import java.util.Scanner;
class Test
{
	public static void main(String[]args)
	{
	
	       int  i=0,pos=0,temp=0;
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
	      
	     	System.out.println("\tThe Acutal Array is ");
	  for( i=0;i<n;i++)	
	     {
		System.out.println("a["+i+"]="+a[i]);
	     }
	     
	  for(i=0;i<n;i++)
	    {
	       //max=a[i];
	       //pos=i;
	      for(int j=0;j<n-i-1;j++)
	      {
	       	if(a[j]>a[j+1])
	       	{
	        		temp=a[j+1];
	    			a[j+1]=a[j];
	        		a[j]=temp;	
	            	}
	   
	    	
	    
	      }
	   }
	   	System.out.println("\tThe Sorted Array is");
	     
	  for(i=0;i<n;i++)
	    	System.out.println("\ta["+i+"]"+a[i]);
	 }
} 
	    
