class Test
{
	static  int count =0;
	public Test()
	{
		count++;
	}
	public static int getCount()
	{
		return count;
	}
}
class TestMain
{
	public static void main(String args[])
	{
		for(int i = 1; i<=4; i++)
		{
			Test ob  = new Test();
		}
		System.out.println("Total objects are "+Test.getCount());
	}
}