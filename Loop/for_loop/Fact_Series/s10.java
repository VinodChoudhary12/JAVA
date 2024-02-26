
//WAP Fectoriyal Serices sum 1!/2 + 2!/3 + 3!/4 + 4!/5 + 5!/6 =  27.466666666
import java.util.Scanner;
class Test
{
	public static void main(String[]args)                                  
	{
		int n,i=1,fact=1;
		float sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
			
			sum=sum+(fact/(i+1));
				if(i>1)
				{
					System.out.print(" + ");
				}
				System.out.print(i+"!/"+(i+1));
			
		}
		System.out.println(" = "+sum);
	}
}

