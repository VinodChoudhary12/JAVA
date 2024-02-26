
//WAP Fectoriyal Serices sum -1!/2 + 2!/3 - 3!/4 + 4!/5 + 5!/6 = -16.533333
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

		for(i=1;i<=y;i++)
		{
			fact*=i;
			if(i%2==0)
			{
				sum=sum+(fact/(i+1));
				System.out.print(" - "+i+"!/"+(i+1));
			}
			else
			{
				sum=sum-(fact/(i+1));
				if(i>1)
				{
					System.out.print(" + ");
				}
				System.out.print(i+"!/"+(i+1));
			}

			
		}
		System.out.println(" = "+sum);
	}
}

