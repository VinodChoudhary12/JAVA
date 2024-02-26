//!1/2+!2/3+!3/4+!5/6+....

import java.util.Scanner;
class Test
{
	public static void main(String args[])
{
	Scanner sc = new  Scanner(System.in);
	System.out.println("Enter The line");
	double n=sc.nextDouble();
	double i=1;
	double fact=1;
	double sum=0;
	double a=0;
	
	while(i<=n)
{
	if(i==1){
		fact=fact*i;
		a=fact/(i+1);
		sum=sum+a;
		System.out.print("!"+i+"/"+(i+1));
		i++;}

	fact=fact*i;
	a=fact/(i+1);
	sum=sum+a;
	System.out.print("!+"+i+"/"+(i+1));
	i++;
	}
	
	System.out.print("="+sum);
}
}

