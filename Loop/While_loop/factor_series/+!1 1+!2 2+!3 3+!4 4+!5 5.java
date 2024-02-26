//+!1 1+!2 2+!3 3+!4 4+!5 5

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
	int a=1;
	
	while(i<=n)
{
	if(i==1){
	         fact=fact*i;
	         sum=sum+fact/i;
		System.out.print("!"+i+"/"+i);
		}
		
	else	{
		fact=fact*i;
		sum=sum+fact/i;
		System.out.print("+!"+i+"/"+i); }
	i++;
}
	System.out.print("="+sum);
}
}

	
