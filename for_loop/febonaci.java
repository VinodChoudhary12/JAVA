import java.util.Scanner;
class Cube
{
  public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int n = sc.nextInt();
		int i=1;
		int a=0,b=1,c=0;
	for(i=1;i<=n;i++)
	{
		a=b;
		b=c;
		c=a+b;
		System.out.print(c+" ");
	}
	}
	}
	
		
		
	
