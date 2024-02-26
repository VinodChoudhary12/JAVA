//!1 x^1+ !2 x^2+ !3 x^3+ !4  x^4+ !5 x^5+

import java.util.Scanner;
class Test
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int x = sc.nextInt();
		System.out.println("Enter the Power:");
		int y= sc.nextInt();
		int pow=1;
		double fact=1;
		double sum=0;
		int i=1;
	do 
	{
	if(i==y)
	{	fact=fact*i;
		pow=pow*x;
		sum=sum+(fact/pow);
		System.out.print("!"+i+"/"+x+"^"+i+" = ");
	}
	else
	{
		fact=fact*i;
		pow=pow*x;
		sum=sum+(fact/pow);
		System.out.print("!"+i+"/"+x+"^"+i+" + ");
	
	}
		i++;
	}
	while(i<=y);
		System.out.print(sum);
	}
	}
	
	
