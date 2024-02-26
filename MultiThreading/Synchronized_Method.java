class Threadsyn
{
	public void Test(String msg)
	{
		System.out.print("India is a "+msg);
		try
		{
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			
		}
		System.out.println("Country:");
	}	
}
class ChildThread extends Thread
{
	String message;
	Threadsyn tob;
	public ChildThread(Threadsyn tob,String msg)
	{
		this.tob=tob;
		this.message=msg;
		this.start();
	}
	public void run()
	{
		tob.Test(message);
	}
}
class Test
{
	public static void main(String args[])
	{
		Threadsyn ts=new Threadsyn();
		ChildThread ob1 = new ChildThread(ts,"Great:");
		ChildThread ob2 = new ChildThread(ts,"Beautifull:");
	}
}