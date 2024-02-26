//Duplicate_delete element
import java.lang.String;
import java.util.Scanner;
class Test
{
	public static void main(String[]args)
	{
		int i,j,x;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("\tenter the element:");
		int n=sc.nextInt();
		System.out.println("\tThe Elements are ");
	  for( i=0;i<n;i++)	
	     {
		a[i]=sc.nextInt();
		
	     }
	    for( i=0;i<n;i++)
	    System.out.println("\ta["+i+"]="+a[i]);
	    
	    for(i=0,x=0;i<n;i++)
	    {
	    	if(a[i]!=-1)
	    	{
	      		for(j=i+1;j<=n;j++)
	      		{
	      		   if(a[i]==a[j])
	      		   {
	      		     a[j]=-1;
	      		   }
	      		 }
	      		  a[x]=a[i];
	      		  x++;
	      	}
	   }
	}   	
}
