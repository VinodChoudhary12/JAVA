//1/x^1+ 3/x^2+ 5/x^3 +7/x^4 +9/x^5=2.59

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
		double k=1;
		double sum=0;
		int i=1;
		
	while(i<=y)
	{	if(i==y){
			pow=pow*x;
			k=(i*2-1);
			sum=sum+(k/pow);
			System.out.print(k+"/"+x+"^"+i+"=");}
		
		else {
			pow=pow*x;
			k=(i*2-1);
			sum=sum+(k/pow);
			System.out.print(k+"/"+x+"^"+i+"+");}
		i++;
	}
			System.out.print(sum);
	}
	}
	
		
		
		
