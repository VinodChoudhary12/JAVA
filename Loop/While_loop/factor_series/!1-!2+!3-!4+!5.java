//!1-!2+!3-!4+!5=101
//factotial=1-2+6-24+120=101

import java.util.Scanner;
class Test
{
	public static void main(String args[])
{
	Scanner sc = new  Scanner(System.in);
	System.out.println("Enter The line");
	int n=sc.nextInt();
	int i=1;
	int fact=1;
	int sum=0;
	while(i<=n)
{
	fact=fact*i;
	if(fact%2==0)
	sum=sum-fact;
	 else
	     sum=sum+fact;
}

System.out.println(sum);
}
}
	     
	
	
	
