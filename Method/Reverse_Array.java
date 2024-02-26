import java.util.Scanner;
class Test
{
	public static void main(String[]args)                                  
	{ 
		
		Test ob = new Test();
		ob.Rev(5);
      }
      
      public void Rev(int n)
      {
      		Scanner sc=new Scanner(System.in);
		int temp=1;
		
		//System.out.println("Enter The Element in array");
		//int n=sc.nextInt();
		int a[]=new int[5];
		System.out.println(" The element array are");
	    for(int i=0;i<n;i++) 
	     {
	          a[i]=sc.nextInt();
		   
	     }
	     	System.out.println("Actual Array are...");
	    for(int i=0;i<n;i++) 
	     {
	         
	      System.out.println("\t a["+i+"]="+a[i]);		   
	     }
	     for(int i=0;i<(n/2);i++)
	      {
	        temp=a[i];
	       a[i]=a[n-(i+1)];
	       a[n-(i+1)]=temp;
	       
	     }
	     System.out.println(" Reverse Order -->");
	     for(int i=0;i<n;i++) 
	     {
	        System.out.println("\t a["+i+"]="+a[i]);
	     }
      		//return ;
      }
}
