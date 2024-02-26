class Test
{
	public static void main(String ags[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1||i==j||i==n)
					System.out.print("* ");
				else
					System.out.print("  ");	
					
			}
				System.out.print("\n");	
		}
	}
}