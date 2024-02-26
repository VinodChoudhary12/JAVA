
//WAP Fectoriyal Serices sum 1!/2 + 2!/4 + 3!/6 + 4!/8 + 5!/10 =  17.0
import java.util.Scanner;
class Test
{
	public static void main(String[]args)                                  
	{
		int n,i=1;
		float sum=0,fect=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		for(i=1;i<=y;i++)
		{
			fect=fect*i;
			
			sum=sum+(fect/(i+1));
				if(i>1)
				{
					System.out.print(" + ");
				}
				System.out.print(i+"!/"+(i+1));
			
			
		}
		System.out.println(" = "+sum);
	}
}

