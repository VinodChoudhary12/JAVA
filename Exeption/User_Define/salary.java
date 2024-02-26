class Salary extends Exception
{
	Salary()
	{
		
	}
	Salary(String msg)
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
			double sal = Double.parseDouble(args[0]);
			if(sal<=1000&&sal>0)
				throw new Salary("Salary Should Be Greater Than Thousand:");
			else if(sal<=0)
				throw new Salary("Salary is Not in Negetive:");
			else
			{
				double PF=(sal*12)/100;
				double DA=(sal*7.8)/100;
				double TA=(sal*3.6)/100;
				double Gross =((PF+DA+TA)-sal);
				System.out.println("PF is :" +PF);
				System.out.println("DA is:" +DA);
				System.out.println("TA is :" + TA);
			}
		}
		catch(NumberFormatException ref)
		{
			System.out.println("Please Input Fractional value");
			
			
		}
		catch(Salary ref)
		{
			System.out.println("PLease Inpur Vaild ");
		}
		
	}
}