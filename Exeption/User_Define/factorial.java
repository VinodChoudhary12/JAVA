class Fact extends Exception
{
	Fact()
	{
		
	}
	Fact(String sms)
	{
		super(sms);
	}
}
class Test
{
	public static void main(String args[])
	{
		try
		{
			int i,fact;
			int a= Integer.parseInt(args[0]);
			if(a<=0)
				throw new Fact("Number Should Greater Than Zero:");
			else
			{
				for( i=1,fact=1; i<=a;fact*=i,i++);
					System.out.println("Factorial of "+a+" Is = "+fact);	
			}
		}
		catch(NumberFormatException ref)
		{
			System.out.println("Value Should be An Integer:");
		}
		catch(Fact ref)
		{
			System.out.println("Enter A Valid Number");
		}
	}
}