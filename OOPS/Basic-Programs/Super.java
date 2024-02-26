class Test
{
	int x;
	public Test(int x)
	{
		this.x=x;
		System.out.println("Test Constructor");
	}
	void Display()
	{
		System.out.println("Test Class x="+this.x);
	}
}
class Test1 extends Test
{
	int x;
	public Test1(int x1,int x2)
	{
		super(x1);
		this.x=x2;
		System.out.println("Test1 Cunstroctor");
	}
	void Display()
	{
		super.Display();
		System.out.println("Test1 Class x="+this.x);
	}
}
class Test2 extends Test1
{
	int x;
	public Test2(int x1,int x2,int x3)
	{
		super(x1,x2);
		this.x=x3;
	}
	void Display()
	{
		super.Display();
		System.out.println("Test2 Class x="+this.x);
	}
}
class Main
{
	public static void main(String args[])
	{
		Test2 ob = new Test2(7,3,10);
		ob.Display();
	// Base class reference is to be eligible for hold object reference its all derived classes
		Test ref;
		Test ob = new Test(7)
	
	}
}
	
	