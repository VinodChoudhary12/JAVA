//!2/x^1+!4/x^3+!6+x^5=4.5185

import java.util.Scanner;
class Test
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n,y,i=1,j=1;
		float pow=1,fact=1;
		float sum=0;
		System.out.println("Enter The number");
		n = sc.nextInt(); 
		System.out.println("Enter The Power");
		y = sc.nextInt();
		
		for(i=1;i<=y;)
		
		{
		   fact=fact*(j+1);
		   pow=pow*n;
		   if(j%2!=0)
		   {
		     sum=sum+(fact/pow);
		     System.out.print("!"+j+"/"+n+"^"+(j+1));
		     
		    i++;  
		   }
		   j++;
		}
			System.out.print("="+sum);
	}
}

		  
		  
		      
