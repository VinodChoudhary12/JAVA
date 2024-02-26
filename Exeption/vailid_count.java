class Test
{
	public static void main(String args[])
	{
		int a []=new int[5];
		int i,j,count=0;
		for(i=0,j=0;i<args.length&&i<a.length;i++)
		{
			try
			{
				a[j]=Integer.parseInt(args[i]);
				j++;
			}
			
			catch(ArrayIndexOutOfBoundsException ref)
			{
					System.out.println("Value Is OverFlow");
			}
			catch(NumberFormatException ref)
			{
				count++;
			}
			catch(Exception ref)
			{
				System.out.println(""+ref);
			}
		}
			System.out.println("Total Valid Value "+(j));
			System.out.println("Total Invalid value "+(count));	
	}
}