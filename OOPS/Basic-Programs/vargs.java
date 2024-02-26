class Test 
{
	public  void m1(int... x)
	{
		int total=0;
		for(int x1:x)
		{
			total=x1+total;
		}	
		System.out.println(total);
		
	}
	// public static void m1(double a)
	// {
		// System.out.println("v....");
	// }
	public static void main(String args[])
	{
		Test ob = new Test();
		ob.m1(10,20,30);
		
		
	}
} 
