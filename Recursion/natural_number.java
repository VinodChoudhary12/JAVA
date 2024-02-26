import java.util.Scanner;
class Test
{
	/*public void increase(int n)
	{
		int s;
		if(n==1)
			s=1;
		else
		increase(n-1);
		System.out.println(n+" ");
	}
	public static void main(String args [])
	{
	 	Test ob = new Test();
	 	
	 	ob.increase(5);
	}*/
	
	//With Return Type
	public int increase(int n)
	{
		int s;
		if(n==1)
			s=1;
		else
		s=increase(n-1);
		System.out.println(n+" ");
		return s;
	}
	public int Dicresing(int n)
	{
		int s;
		if(n==1)
		{	s=1;
			System.out.println(n+" ");
		}
		else
		{
		System.out.println(n+" ");
		s=Dicresing(n-1);}
		
		return s;
	}
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
	 	Test ob = new Test();
	 	ob.increase(50);
	 	System.out.println("Do you want to Reverse This Numbers Then Press 1");
	 	int ch=sc.nextInt();
	 	if(ch==1)
	 	ob.Dicresing(50);
	 	else
	 	System.out.println("Your program has been Completed");
	 	
	}
	
	
	
}
