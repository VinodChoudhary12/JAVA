import java.util.Scanner;
class Fibon
{
	int n,sum=0,a=0,b=1;
	public void setData(Scanner sc)
	{
		System.out.println("Enter any number");
		int n = sc.nextInt();
		this.n=n;
	}
	public int fibo()
	{
		int fibo=0;
		for(int i=1; i<=n ; i++)
		{
			System.out.print(" "+fibo);
			a=b;
			b=fibo;
			fibo=a+b;
		}
		return fibo;
	}
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Fibon ob = new Fibon();
		ob.setData(sc);
		int res = ob.fibo();
		
	}
}
