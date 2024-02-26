class Parent
{
	public void methodOne(int ...i)
	{
		System.out.println("Parent Method");
		
	}
}
class Child extends Parent
{
	public void methodOne(int i)
	{
		System.out.println("Child Method");
		
	}
}

class Test
{
	public static void main(String args[])
	{
		Parent p = new Parent();
		p.methodOne(10); //Parent
		Child c = new Child();
		c.methodOne(10);//child
		
		Parent p1 = new Child();
		p1.methodOne(10);//Parent
	}













}