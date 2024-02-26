//   2 !1 + 4 !2 + 6 !3 +8 !4 +10 !5

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

	while(i<=n)
{
	fact=fact*i;
	j=i*2;
	a=j/fact;
	System.out.print(j+"/!"+i+" +");
	sum=sum+a;
	i++;
	if(i==n){
	fact=fact*i;
	j=i*2;
	a=j/fact;
	System.out.print(j+"/i"+i+"=");
	sum=sum+a;
	i++;	
}
}
	System.out.print(sum);
}
}

	
