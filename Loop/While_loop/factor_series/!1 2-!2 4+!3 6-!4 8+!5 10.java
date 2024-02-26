//!1 2-!2 4+!3 6-!4 8+!5 10

import java.util.Scanner;
class Test
{
	 public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter The Number");
	int n=sc.nextInt();
	int j=1;
	int i=1;
	double fact=1;
	double sum=0;
	double a=1;
	while(i<=n)
{
	if(i%2==0){
	fact=fact*i;
	j=i*2;
	a=fact/j;
	System.out.print("-!"+i+"/"+j);
	sum=sum-a;
	i++;
} 
	else{
	fact=fact*i;
	j=i*2;
	a=fact/j;
	System.out.print("-!"+i+"/"+j);
	sum=sum+a;
	i++;}


}
	System.out.print("="+sum);
}
}
	
