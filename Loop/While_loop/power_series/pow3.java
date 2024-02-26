//-2^1+2^2-2^3+2^4-2^5=

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
		int i=1;
		int pow=1; int sum=0;
		while(i<=y){
		if(i%2!=0){
			pow=(pow*x);
			sum=sum-pow;
			System.out.print("-"+x+"^"+i);}
		else if(i==1){
			System.out.print("-"+x+"^"+i);
			pow=(pow*x);
			sum=sum-pow;
		}
		else{
			System.out.print("+"+x+"^"+i);
			pow=(pow*x);
			sum=sum+pow;
		}
		i++;
		}
		
		System.out.print("="+sum);
		}
		}
		
