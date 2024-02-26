import java.util.Scanner;
class Even
{
	private int n,s;
    public void setData(Scanner sc)
	{
		System.out.println("Enter any number");
		int n = sc.nextInt();
		this.n=n;
	}
    public int even()
	{
		for(int i=1; i<=n ; i++)
		{
			 s=2*i;
			 System.out.print(" "+s);
		}
		return s;
	}	
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Even ob = new Even();
		ob.setData(sc);
		int res = ob.even();
		
	}
}
