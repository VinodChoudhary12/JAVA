// -!1+!2-!3+!4-!5

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
	if(i%2==0){
	
		System.out.print("+!"+i);
		sum=sum+fact;}
	 else {
	 	
	     System.out.print("-!"+i);
	     sum=sum-fact;
	     }
	     
	     i++;
}

System.out.print("="+sum);
}
}


