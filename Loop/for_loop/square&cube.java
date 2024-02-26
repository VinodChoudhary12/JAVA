import java.util.Scanner;
class Test
{
	public static void main(String[]args)                                  
	{
		int n,i=1,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		System.out.println("The square of "+ n+ " Is "+(n*n));
		System.out.println("Enter 1 for Cube If You Want to");
		char y=sc.next().charAt(0);
		if(y=='y'||y=='Y')
		System.out.println("The square of "+ n+ " Is "+(n*n*n));	
	}
	}
	
		
	
