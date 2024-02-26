//WAP to -2/x^1 + 3/x^2 - 4/x^3 + 5/x^4 - 6/x^5  =  - 0.625
import java.util.Scanner;
class Test
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int x,y,i=1;
		float pow=1,sum=0;
		System.out.println("Enter any two number");
		x = sc.nextInt();
		y = sc.nextInt();
		for(i=1;i<=y;i++)
		{
			pow = pow*x;
			if(i%2==0)
			{
				sum+=(i+1/pow);
				System.out.print(" + "+i+1+"/"+x+"^"+i);
			}
			else 
			{
				sum-=(i+1/pow);
				
				System.out.print(" - "+i+1+"/"+x+"^"+i);
			}	
			
		}
		System.out.println(" = "+sum);
	}
}
