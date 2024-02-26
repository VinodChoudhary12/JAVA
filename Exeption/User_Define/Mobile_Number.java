class Number extends Exception
{
	Number()
	{
		
	}
	Number(String msg)
	{
		super(msg);
	}
}
class Test
{
	public static void main(String args[])
	{
		int i=0;
		int a []=new int[10];
		try
		{
			if(a[0]!=9||a[0]!=8||a[0]!=7)
				throw new Number("Number Start with 9 or 8 or 7:");
			else
			{
			
			for(;i<args.length;i++)
			{
				a[i]=Integer.parseInt(args[i]);
				// System.out.println(a[i]);
			}
			}
		}
		 catch(IndexOutOfBoundsException ref)
		 {
			 System.out.println("Number Should Be 10:");
		 }
			catch(Number ref)
			{
				System.out.println(ref);
			}
			
	}
}