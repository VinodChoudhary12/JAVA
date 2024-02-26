
//WAP to x^1/1 - x^2/3 + x^3/5 - x^4/7 + x^5/9 = 3.5365078
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
				sum-=(pow/(i+1));
				System.out.print(" - "+x+"^"+i+"/"+(i+1));
			}
			else 
			{
				sum+=(pow/(i+1));
				if(i>1)
					System.out.print(" + ");
				System.out.print(x+"^"+i+"/"+(i+1));
			}	
			
		}
		System.out.println(" = "+sum);
	}
}
