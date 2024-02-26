//x^1/1+x^3/3+x^5/5=60

import java.util.Scanner;
class Test
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		int i=1,j=1,pow=1,sum=0;
		for(i=1;i<=n;)
		{ 
		  pow=pow*n;
		  if(j%2!=0)
		  {
		   sum=sum+pow/j;
		   System.out.print(n+"^"+i+"/"+i);
		   if(i<n)
		   	System.out.print("+");
		   
		   i++;
		   
		  }
		  j++;
		}
		System.out.print("="+sum);
	}
}

