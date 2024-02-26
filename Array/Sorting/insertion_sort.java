import java.util.Scanner;
class Test
{
    public static void main(String[]args)                                  
    { 
	int a[]=new int[10];
	int n,i,j=0,temp=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the element of Array");
	n=sc.nextInt();
	System.out.println("\tthe element of Array is");
	
	
	
	for(i=0;i<n;i++)
	{
	    a[i]=sc.nextInt();
	    System.out.println("\ta["+i+"]="+a[i]);
	    
	    temp=a[i];
	    j=i;
	        
	    
	    for(;j>0&&a[j-1]>temp;j--)
	    {
	      a[j]=a[j-1];  
	    }
	      a[j]=temp;
	      
	 }		
	      System.out.println("The sorted array is");
	      for(i=0;i<n;i++)
	      System.out.println("\ta["+i+"]="+a[i]);
	}
}
