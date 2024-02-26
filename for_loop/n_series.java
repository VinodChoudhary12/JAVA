import java.util.Scanner;
class Test
{
	public static void main(String[]args)                                  
	{
		int n,i=1,N;
		char y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  number for Even Natural Series");
		n = sc.nextInt();
		
	for(i=1;i<=n;i++)
{
		int j=i*2;
		System.out.print(j+" ");
		}
	
		System.out.println("Press Y If you want to Odd Natural Number series");
		y=sc.next().charAt(0);
		System.out.println("Enter  number for Even Natural Series");
		N = sc.nextInt();
		
	for(i=1;i<=N;i++)
{
	int j=i*2-1;
		System.out.print(j+" ");
		}

}
}
		
