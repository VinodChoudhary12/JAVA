class Test
{
	public static void main(String args[])
	{
		try
		{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			MyClass ob = new MyClass(a,b);
			ob.div();
		}
		catch(ArithmeticException ref)
		{
			System.out.println(ref);
			System.out.println(ref.getMessage());
		}
	}
	
}
class MyClass
{
	int a,b;
	MyClass()
	{
		
	}
	MyClass(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void div() throws ArithmeticException  
	{
		int c=a/b;
		System.out.println(c);
	}
}