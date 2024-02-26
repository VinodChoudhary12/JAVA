//x^1/!1+ x^2/!2 +x^3/!3+ x^4/!4 +x^5/!5=6.266 

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
		double k=1;
		double sum=0;
		int i=1;
	while(i<=y)
	{
		if(i==y){
			fact=fact*i;
			pow=pow*x;
			sum=sum+(pow/fact);
			System.out.print(x+"^"+i+"/!"+i+"=");
			
			}
		
		else{
			fact=fact*i;
			pow=pow*x;
			sum=sum+(pow/fact);
			System.out.print(x+"^"+i+"/!"+i+"=");
			}
			i++;
		
	}
		System.out.print(sum);
		
	}
	}
	
			
