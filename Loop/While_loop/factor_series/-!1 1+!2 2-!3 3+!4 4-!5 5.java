//   -!1 1+!2 2-!3 3+!4 4-!5 5

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
	while(i<=n){
	fact=fact*i;
	a=fact/i;
	if(i%2==0){
		System.out.print("+!"+i+"/"+i);
		sum=sum+a;}
	else {
		System.out.print("-!"+i+"/"+i);
		sum=sum-a;}
		
		i++;

}
	System.out.print("="+ sum);
}
}

	
	
