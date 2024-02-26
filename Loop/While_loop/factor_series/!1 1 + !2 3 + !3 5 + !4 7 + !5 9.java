//!1/1 + !2/3 + !3/5 + !4/7 + !5/9

import java.util.Scanner;
class Test
{
	public static void main(String args[])
{
	Scanner sc = new  Scanner(System.in);
	System.out.println("Enter The line");
	int n=sc.nextInt();
	int i=1;
	int j=1;
	double fact=1;
	double sum=0;
	double a=0;
	
	while(j<=n)
{	fact=fact*j;
	a=fact/i;
	sum=sum+a;
	System.out.print("!"+j+"/"+i+"+"); 
	i=i+2;
	j++;
	if(j==n){
	fact=fact*j;
	a=fact/i;
	sum=sum+a;
	System.out.print("!"+j+"/"+i+"="); 
	i=i+2;
	j++;		
}
}
 	System.out.print(sum);
}
}

