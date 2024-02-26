class MyThred extends Thread
{
	public void run()
	{
		int i;
		
		for(i=0;i<=10;i++)
		{
			System.out.println(this.getName()+"="+i);
		}
	}
}
class Test
{
	public static void main(String args[])
	{
		MyThred ob1 = new MyThred();
		MyThred ob2 = new MyThred();
		MyThred ob3 = new MyThred();
		MyThred ob4 = new MyThred();
		MyThred ob5 = new MyThred();
	
	ob1.start();
	ob2.start();
	ob3.start();
	ob4.start();
	ob5.start();
	}
}