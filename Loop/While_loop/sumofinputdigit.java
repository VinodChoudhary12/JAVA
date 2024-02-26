//Find the sum of input digit


import java.util.Scanner;
class Test
{
	public static void main(String args[])
{
	Scanner sc = new  Scanner(System.in);
	System.out.println("Enter The Number");
	int n=sc.nextInt();
	int sum=0, r;
	
	while(n>0)
{
	r=n%10;
	sum=sum+r;
	n=n/10;
}
	System.out.println("Sum="+sum);
}
}

