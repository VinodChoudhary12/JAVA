import java.util.Scanner;
 
 class Test
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n = sc.nextInt();
		int i=1;
		int j=1;
		char y='y';
	do
	{
	
		System.out.println((i*2)+" ");
		i++;
	}
	
	while(i<=n);
	 		
	System.out.println("Do You Want To n Odd Number");
	System.out.println("Then Press y");
	 y=sc.next().charAt(0);
	if(y=='y'){
		System.out.println("Enter The Number");
		int N = sc.nextInt();
		i=1;
		
	do
	{
		System.out.println((i*2-1)+" ");
		i++;
		
	}
	while(i<=N);
	}
	}
	}
	
	
