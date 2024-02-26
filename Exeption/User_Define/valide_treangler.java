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
class Trengle
{
	public static void main(String args[])
	{
		try
		{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=Integer.parseInt(args[2]);
			if(a<0 | b<0 | c<0)
				throw new MyValid("invalid value... ");
			else if(a+b+c==180)
				System.out.println("valid trengle... ");
			else
				System.out.println("Invalid Trengle...");
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