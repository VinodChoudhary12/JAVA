//1!/1 + 2!/2 + 3!/3 + 4!/4 + 5!/5 = 34
import java.util.Scanner;
class Test
{
	public static void main(String[]args)
	{
		int fact=1,i=1,n,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
	for(i=1;i<=n;i++)
	{
		fact*=i;
	if(i>1)
		System.out.print(" + ");	
		System.out.print(i+"!/"+i);
		sum+=fact/i;
	}
		System.out.print("="+sum);
		
	}
	}
	
		
