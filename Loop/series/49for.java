//!2/1+!4/2+!6/3+!8/4=254

import java.util.Scanner;
class Test
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		int i=1,j=1,fact=1,sum=0;
	   for(i=1;i<=n;)
	   {
	     fact=fact*j;
	    if(j%2==0)
	      {
	     	sum=sum+fact/i;
	     	System.out.print("!"+j+"/"+i);
	        if(i<n)
	        System.out.print("+");
	   	i++;
	       }
	 	j++;
	   }
	   	System.out.print("="+sum);
	}
}
	   
	   
	  
