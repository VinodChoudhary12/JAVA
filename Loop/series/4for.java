//!2/2+ !4/4+ !6/6=127


import java.util.Scanner;
class Test
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n,i=1;
		int j=1,fact=1;
		int sum=0;
		System.out.println("Enter The number");
		n = sc.nextInt();  
		for(i=1;i<=n;)
		{ 
		    fact=fact*j;
		  if(j%2==0)
		  {
		    sum=sum+(fact/j);
		    i++;
		     System.out.print("!"+j+"/"+j);
		    if(i<=n)
		    	System.out.print("+");
		   
		  }
		  j++;     
		}
			System.out.print("="+sum);  	
		
	}
}
