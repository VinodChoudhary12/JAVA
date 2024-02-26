import java.util.Scanner;
class Test
{
    public static void main(String[]args)                                  
    { 
	int a[]=new int[10];
	int n,i,j,pos=0,min=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the element of Array");
	n=sc.nextInt();
	System.out.println("\tthe element of Array is");
	
	for(i=0;i<n;i++)
	{
	    //System.out.print("Element "+j+" : ");
	    a[i]=sc.nextInt();
	}
	System.out.println("\tThe Array is");
	for(i=0;i<n;i++)
	{
	    System.out.println("\ta["+i+"]="+a[i]);
	}
	for( i=0;i<n;i++)
	{
	    min=a[i];
	    pos=i;
	    for( j=i+1;j<n;j++)
	    {
	        if(min>a[j])
	    	{	
	            min=a[j];
	            pos=j;
	        }      
	    } 
	   	    a[pos]=a[i];
	            a[i]=min;
	            
	}
	     System.out.println("\tThe Sorted Array is");
	     
	for(i=0;i<n;i++)
	    System.out.println("\ta["+i+"]"+a[i]);
	  
    }
}

