//fabonaci series
import java.util.Scanner;
 
 class Test
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The number");
		int n = sc.nextInt();
		int i=1,a=0,b=1,c=0,sum=0;
		char Y='y';
		while(i<=n)
	{
		
		System.out.print(c+" ");
		a=b;
		b=c;
		c=a+b;
		i++;
		sum=sum+b;
	}
		System.out.println("\nPress Y if you want to Sum all this number");
		Y=sc.next().charAt(0);
		if(Y=='y')
		System.out.println("The Sum of This series is:="+sum);
		
	}
	}
	
