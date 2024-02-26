import java.util.Scanner;
class Prime
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
	int i=1;
	int count=0;
	public int prime(Prime pr)
	{
	    while(i<=pr.getN())
		{

		   if(pr.getN()%i==0)
		   {
		     count++;
		   }
		   i++;
		}
        return count;		
	}
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Prime ob = new Prime();
		Opration op = new Opration();
		System.out.println("Enter any number");
		int n = sc.nextInt();
		ob.setN(n);
		int res = op.prime(ob);
		if(res==2)
		{
			System.out.println("Prime Num");
		}
		else
		{
			System.out.println("not a Prime Num");
		}
		
	}
}
