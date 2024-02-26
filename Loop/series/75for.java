//-2!/2+4!/4-6!/6=-138.0

import java.util.Scanner;
class Test
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		int i=1,j=1;
		double fact=1,sum=0;
		
	    for(i=1;i<=n;)
	    {
	      fact=fact*j;
	      if(j%2==0)
	      {
	        if(i%2!=0)
	        {
	          sum=sum-fact/(2*i-1);
	      	  System.out.print("-"+j+"!/"+(2*i));
	      	 }
	      	else
	      	{
	          sum=sum+fact/(2*i-1);
	      	  System.out.print("+"+j+"!/"+(2*i));
	      	 }
	      	 i++;
	      }
	      j++;
	     }
	     	 System.out.print("="+sum);
	   }
}
	    
