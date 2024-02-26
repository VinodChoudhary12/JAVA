class MyPositive extends Exception
{
	MyPositive()
	{
		
	}
	MyPositive(String msg)
	{
		super(msg);
	}
}
class Positive
{
	public static void main(String args[])
	{
		try
		{
			int a=Integer.parseInt(args[0]);
			if(a>0)
				throw new MyPositive("Number is Positive..");
			else if(a<0)
				throw new MyPositive("Number is Nagetive..");
			else
				System.out.println("Number is Zero...");
		}
		catch(MyPositive ref)
		{
			System.out.println(ref.getMessage());
		}
		catch(Exception ref)
		{
			System.out.println(ref.getMessage());
		}
	}
}