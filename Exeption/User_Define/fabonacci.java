class Febo extends Exception
{
	Febo()
	{
		
	}
	Febo(String msg)
	{
		super(msg);
	}
}

class Test
{
	public static void main(String args[])
	{
		int n= Integer.parseInt(args[0]);
		try
		{
			if(n<0)
				throw new Febo("Number Should Be An:");
			else
			{
				int a=0,b=1,c=0;
				for(int i=1;i<=n;i++)
				{
					a=b;
					b=c;
					c=a+b;
					System.out.print(c+" ");
				}
			}
		}
		catch(NumberFormatException ref)
		{
			//Ye nahi chal rha hai
			System.out.println("Number Should Be An Integer:");
		}
		catch(Febo ref)
		{
			System.out.println(ref);
		}
	}
}