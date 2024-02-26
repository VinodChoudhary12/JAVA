// 2/!1 + 3/!2 +4/!3 + 5/!4 + 6/!5

import java.util.Scanner;
class Test
{
	public static void main(String args[])
{
	Scanner sc = new  Scanner(System.in);
	System.out.println("Enter The line");
	int n=sc.nextInt();
	int i=1;
	double fact=1;
	double sum=0;
	double a=0;
	
	while(i<=n)
{  	fact=fact*i;
	a=(i+1)/fact;

	if(i==n){
	System.out.print((i+1)+"/!"+i);
	sum=sum+a;
	i++;
	
	
	}
	else{
	System.out.print((i+1)+"/!"+i+"+ ");
	sum=sum+a;
	i++;	}	
}
	System.out.print("="+sum);
}
}

