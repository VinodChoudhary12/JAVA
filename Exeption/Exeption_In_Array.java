class Test
{
	public static void main(String args[])
	{
		int a[] = new int[5];
		int i=0;
		try
		{
			for(;i<args.length;i++)
			{
				a[i]=Integer.parseInt(args[i]);
				// System.out.println(a[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException ref)
		{
				System.out.println("Value Should be 5");
		}
		catch(NumberFormatException ref)
		{
				System.out.println("Value Shouls be integer");
		}
		catch(Exception ref)
		{
				System.out.println(""+ref);
		}
		// for(int j=0;j<i;j++)
		// {
			// System.out.println(a[j]);
		// }
		
		
		
		
	}
}