import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
	
		Fact ob = new Fact();
		int n=ob.setData();
		ob.getData();
		System.out.println("The Factorial of "+n+" is:"+ob.fact(n));
		//Calling By ForLoop
		//System.out.println("The Factorial of "+n+" is:"+ob.Fact());
		System.out.println("Do You Want To Sum OF From 1 to "+n+" Then Press 1");
	}

}

class Fact
{
	private int n;
	public int setData()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int n = sc.nextInt();
		this.n=n;
		return n;
	}
	public void getData()
	{
		System.out.println("The Number is: "+n);
	}
	public int fact(int n)
	{
		//with Recursion
		int fact=1;
		if(n==0)
			return 1;
		else
			return fact(n-1)*n;
	}
	

	public int Fact()
	{
		//with Loop
		int i,f;
		for(i=1,f=1;i<=this.n;f=f*i,i++);
		return f;
	}
}
	
		
	
	
	
	
	
