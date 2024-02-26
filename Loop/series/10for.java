 //!1+!3+!5+!7=127

import java.util.Scanner;
class Test
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n,i=1;
		int j=1;
		int fact=1, sum=0;
		System.out.println("Enter The number");
		n = sc.nextInt();
		for(i=1;i<=n; )
		{ 
		   fact=fact*j;
		   if(j%2!=0)
		   {
		   	sum=sum+fact;
		     System.out.print("!"+j);
		     if(i<n)
		     System.out.print("+");
		     i++;
		   }
		   
		  j++;
		 }
		 System.out.print("="+sum);
	}
}
		 
		   
		   	
					
		

