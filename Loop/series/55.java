//!1/1+!3/2+!5/3+!7/4


import java.util.Scanner;
class Test
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		int i=1,j=1,fact=1;
		double sum=0;
	  for(i=1;i<=n;)
	  {
	    fact=fact*j;
		    
	     if(j%2!=0)
	     {
	       sum=sum+(fact/i);
	       System.out.print("!"+j+"/"+1);
	       if(i<n)
	       System.out.print("+");
	       i++;
	      }
	       j++;
	   }
	       System.out.print("="+sum);
	}
}
	       
	      
	         
