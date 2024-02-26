import java.util.Scanner;
class Test
{
	public static void main(String[]args)                                  
	{ 
	    int a[]=new int[5];
	       int n,i,j,min=0,sec=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element of Array");
		n=sc.nextInt();
		System.out.println(" the element of Array is");
	  for(i=0;i<n;i++)
		 a[i]=sc.nextInt();
		min=a[0];
		System.out.println("The Array is");
	    for(i=0;i<n;i++)
		System.out.println("a["+i+"]="+a[i]);
	       for( j=0;j<i;j++)
	       {
	         if(min>a[j])
	         {
	          min=a[j];
	         }
	         
	         if(sec>a[j]&&min)
	       }   
	         
	         System.out.println((min)+"a["+a[j]+"]is The Second minimum");

	}
}


































	          
