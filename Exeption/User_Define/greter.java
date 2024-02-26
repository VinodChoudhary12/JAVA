class Greatest extends Exception
{
	Greatest()
	{
		
	}
	Greatest(String msg)
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
			 int b = Integer.parseInt(args[1]);
			 int c = Integer.parseInt(args[2]);
			 int d = Integer.parseInt(args[3]);
			 
			if(a<0||b<0||c<0||d<0)
				throw new Greatest("Number Should be Greter Than Zero");
			else
			{
			if(a>b && a>c && a>d)
			System.out.println("A Is Greatest");
			else if(b>c && b>d)
				System.out.println("B Is Greatest");
			else if(c>d)
				System.out.println("C Is Greatest");
			else
				System.out.println("D Is Greatest");
			}
		}
		catch(NumberFormatException ref)
		{
			System.out.println("Number Should Be Integerger:");
		}
		catch(Greatest ref)
		{
			// System.out.println(ref);
			System.out.println("Number Should Be Integerger:");
		}
	}
}