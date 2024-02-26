import java.util.Scanner;
class Test
{
	public static void main(String args[])
{
	Scanner sc = new  Scanner(System.in);
	System.out.println("Enter Any Number");
	int n=sc.nextInt();
	int i=1;
	int sum=0;
	while(i<=n)
{
	sum=sum+i;
	System.out.print(i+"+");
	i++;
	
}
	System.out.print("="+sum);	
}
}

