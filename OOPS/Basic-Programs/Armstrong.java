import java.util.Scanner;
class Reverse
{
	int n,c,sum=0,r=0,k;
	public int setData(Scanner sc)
	{
		System.out.println("Enter any number");
		int n = sc.nextInt();
		c=n;
		this.n=n;
		return c;
	}
	public int rev()
	{
	    for( ; n>0;)
	    {
		   r=n%10;
		   k=r*r*r;
		   sum=sum+k;
		   n=n/10;
		}
        return sum;		
	}
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Reverse ob = new Reverse();
		int c=ob.setData(sc);
		int res = ob.rev();
		//int c=ob.setData(s)
		if(c==res)
		{
			System.out.println("Armstrong Num");
		}
		else
		{
			System.out.println("not a Armstrong Num");
		}
		
	}
}
