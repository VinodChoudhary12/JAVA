class MyValid extends Exception
{
	MyValid()
	{
		
	}
	MyValid(String msg)
	{
		super(msg);
	}
}
class Square
{
	public static void main(String args[])
	{
		try
		{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			if(a<0 || b<0 )
				throw new MyValid("invalid value... ");
			else if(a==b)
				System.out.println("Square... ");
			else
				System.out.println("Not a Square...");
		}
		catch(MyValid ref)
		{
			System.out.println(ref);
		}
		catch(Exception ref)
		{
			System.out.println(ref.getMessage());
		}
	}
}