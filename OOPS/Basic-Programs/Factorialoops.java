import java.util.Scanner;
class factorialPojo
{
	private int n;
	public void setN(int n)
	{
		this.n=n;
	}
	public int getN()
	{
		return this.n;
	}
}
class Opration
{
	int fact=1;
	public void Facts(factorialPojo ref)
	{
		for(int i=1;i<=ref.getN();i++)
		{
			fact=fact*i;
		}
		System.out.println("The Factorial is: "+fact);
	}
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		 factorialPojo ob = new factorialPojo();
		 Opration clo = new Opration();
		 System.out.println("Enter The Number:");
		int n = sc.nextInt();
		ob.setN(n);
		System.out.println("The Number Is:"+ob.getN());
		clo.Facts(ob);
		//clo.Recursion(getN(),ob);
		
	}
}