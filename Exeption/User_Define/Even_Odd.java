class EvenOdd extends Exception
{
	public EvenOdd()
	{
		
	}
	public EvenOdd(String msg)
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
			int a=Integer.parseInt(args[0]);
			if(a<=0)
				throw  new EvenOdd("The Number Should be Greater Than Zero");
			else if(a%2==0)
			{
				System.out.println(a+ "Is Even");
			}
			else
				System.out.println(a+ " Is Odd");
				
		}
		catch(NumberFormatException ref)
		{
			System.out.println("Enter The Intger Number:");
		}
		catch(EvenOdd ref)
		{
			System.out.println(ref);
		}
		
	}
}