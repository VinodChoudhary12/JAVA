
//WAP Fectoriyal Serices sum 2/1! + 3/2! + 4/3! + 5/4! + 6/5! = 4.425
import java.util.Scanner;
class Test
{
	public static void main(String[]args)                                  
	{
		int n,i=1;
		float sum=0,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		while (i<=n)
		{
			fact=fact*i;
			
			sum=sum+((i+1)/fact);
				if(i>1)
				{
					System.out.print(" + ");
				}
				System.out.print((i+1)+"/"+i+"!");
			
		}
		System.out.println(" = "+sum);
	}
}

