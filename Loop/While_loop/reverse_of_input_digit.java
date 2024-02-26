//Reverse of input Digit

import java.util.Scanner;
class Test
{
	public static void main(String args[])
{
	Scanner sc = new  Scanner(System.in);
	System.out.println("Enter The Number");
	int n=sc.nextInt();
	int sum=0, rem,rev=0;
	
	while(n>0)
{
	rem=n%10;
	n=n/10;
	rev=rev*10+rem;
}
	
	System.out.println(rev);
}
}
	
	
	
