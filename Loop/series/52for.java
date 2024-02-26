//1/!2+2/!4+3/!6+4/!4=0.5875

import java.util.Scanner;
class Test
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		int i=1,j=1;
		float fact=1,sum=0;
   	   for(i=1;i<=n;)
   	   {
   	     	fact=fact*j;
   	      if(j%2==0)
   	      {
   	      	sum=sum+i/fact;
   	      	System.out.print(i+"/!"+j);
   	      	if(i<n)
   	      	System.out.print("+");
   	      	i++;
   	      }
   	       j++;
   	    }
   	    	System.out.print("="+sum);
   	  }
 }
 
 
 
