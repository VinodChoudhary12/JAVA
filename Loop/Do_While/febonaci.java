import java.util.Scanner;
 
 class Test
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n = sc.nextInt();
		int a=0,b=1,c=0;
		int i=1;
	do
	{
		System.out.print(c+" ");
		a=b;
		b=c;
		c=a+b;
		i++;
	}
	while(i<=n);
	}
	}
	
		
