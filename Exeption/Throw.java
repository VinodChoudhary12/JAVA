class Test
{
	public static void main(String args[])
	{
		try
		{
			int a= Integer.parseInt(args[0]);
			int b= Integer.parseInt(args[1]);
			if(b==0)
				throw new ArithmeticException("The Value of b Never be Zero");
			else
			{
				int c=a/b;
				System.out.println(c);
			}                           
		}
		catch(ArithmeticException ref)
		{
			//System.out.println(ref);
			 System.out.println(ref.getMessage());
			// System.out.println(ref.class());());//Isme Error aa rhi hai
			//System.out.println(ref.printStackTrace());//Isme Error aa rhi hai
		}
		finally
		{
			System.out.println("Fianlly Block..");
		}
		System.out.println("Hii..");
	}
}