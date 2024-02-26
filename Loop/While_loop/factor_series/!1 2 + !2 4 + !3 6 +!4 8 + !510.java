//!1/2 + !2/4 + !3/6 +!4/8 + !5/10


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
	while(i<n)
{
		j=i*2;
		fact=fact*i;
		a=fact/j;
		System.out.print("!"+i+"/"+j+"+");
		sum=sum+a;
		i++;
	if(n==i){
		j=i*2;
		fact=fact*i;
		a=fact/j;
		System.out.print("!"+i+"/"+j+"=");
		sum=sum+a;
		i++;}	
		
			
}
	System.out.print(sum);
	
}
}

