/*      Reverse array
        a[0]=7;
		a[1]=2;
		a[2]=5;
		a[3]=8;
		a[4]=9;
		*/
		
import java.lang.String;
import java.util.Scanner;
class Array
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
	    int n=5;
		int temp;
		int a[]=new int[10];
		a[0]=9;
		a[1]=8;
		a[2]=5;
		a[3]=2;
		a[4]=7;
		
		System.out.println("before array Element:");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		for(int i=0;i<n;i++)
			System.out.println("\ta["+i+"]="+a[i]);
		for(int i=0;i<(n/2);i++)
		{
		      	temp=a[i];      //i==0,a[i]=9 ki  value temp me store karwaai temp ki value 9
		      	
		      	a[i]=a[n-1-i];	// a[n-1-i]=a[5-1-0]=a[4],7 ki value a[i]means a[0] me store karwa di 
		      	
	          	a[n-1-i]=temp; // temp ki value 9 usko a[n-1-i] means a[0] me store karwa di
	          	
	          			//final value a[4]=9 && a[0]=7
		}	System.out.println("revers of array element:");
			
			for(int i=0;i<n;i++)
				System.out.println(a[i]+"");
	}
}
	
		 
