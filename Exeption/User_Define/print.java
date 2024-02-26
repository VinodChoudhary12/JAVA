class Test
{
	public static void main(String args[])
	{
		try
		{
			for(int i=0;i<args.length;i++)
			{
				System.out.println(" "+args[i]);
			}
		}
		catch(Exception ref)
		{
			System.out.println(ref);
		}
	}
}