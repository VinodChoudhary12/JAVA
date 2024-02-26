import java.util.Scanner;
class pojo
{
	Scanner sc = new Scanner("System.in");
	private int n;
	private int a[];
	
	public void setA(int a)
	{
		this.a=a;
	}
	public int[] getA()
	{
		return a;
	}
	public void setN(int n)
	{
		
		this.n=n;
	}
	public int getN()
	{
		return this.n;
	}
}
class opration
{
	
	public void input(pojo ref[],int n)
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			ref[i].setA(sc.nextInt());
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("a["+i+"]="+ref[i].getA());
		}
	}
	
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner("System.in");
		int sum=0,i=0,n;
		pojo ob[] = new pojo[100];
		opration op = new opration();
		 ob[i] = new pojo();
		System.out.println("How Many Elements Do You Want To Store");
		n= sc.nextInt();
		//ob.setN(n);
		
		op.input(ob,n);
	}
	
	//for(int i=0;i<n;i++)
}

		
	
	
	
	
	