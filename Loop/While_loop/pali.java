
 import java.util.Scanner;
 
 class Test
{
	public static void main(String[] args)
	{
		int n, b, rev = 0;
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the Palindrome No N:");
		//int a = sc.nextInt();
		//System.out.print("Palindrome numbers from 1 to N:");
		int i=1;
		while(i <= 1000)
		{
		 i++;
			n = i;
			while (n > 0)
			{
				b = n % 10;
				rev = rev * 10 + b;
				n = n / 10;
			}
			if (rev == i)
			{
				System.out.print(i + " ");
			}
			rev = 0;
		}
	}
 
}
