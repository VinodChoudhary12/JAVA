class MyException extends Exception
{
	MyException()
	{
		
	}
	MyException(String msg)
	{
		super(msg);
	}
}
class Test
{
	public static void main(String args[])
	{
		try
		{
			int a= Integer.parseInt(args [0]);
			if(a>100)
				
				throw new MyException("Value Is Greter Than 100");
			else if(a<0)
				throw new MyException("Value Is Negetive");
			else
				System.out.println("Value "+a);
		}
		catch(MyException ref)
		{
			
			System.out.print("Wrong Input Bro:");
			System.out.print(" "+ref+":");
		}
	}
}