//!1/1+!3/3+!5/5+!7/7=

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
		 for(i=1;i<=n;)
		 {
		 	fact*=j;
		    if(j%2!=0)
		    {
		       sum+=(fact/j);
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
