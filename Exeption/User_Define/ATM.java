class ATM extends Exception
{
	ATM()
	{
		
	}
	ATM(String msg)
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
			double rs = Double.parseDouble(args[0]);
			if (rs<0)
				throw new ATM("Amount Is Not is Negetive");
				
				
			else if(rs>10000)
				throw new ATM("Your One Time limit IS 10000:");
		
			else
			{
				System.out.println(rs +"Rs Is Debited in Your Account:");
				System.out.println("Thank You For Choosing our ATM:");
			}
		}
		catch(NumberFormatException ref)
		{
			System.out.println("Plese Enter Real Value:");
		}
		catch(ATM ref)
		{
			System.out.println(ref);
			// System.out.println("You Can Only Withrwal 10000 At a Time");
		}
	}
}