import java.util.Scanner;
class Test
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Test ob = new Test();
		//int result= ob.fact(5);
		//System.out.println("The Factorial is "+result);
		
		
		System.out.println("Enter the Number");
		int n =sc.nextInt();
		
		System.out.println(ob.fact(n));
	}
	
	/*public int fact(int n)
	{
		if(n==0)
		return 1;
		int ans=fact(n-1);
		int result=n*ans;
		return result;
	}*/
	
	
	//sir wali method
	
	public int fact(int n)
	{
		int s;
		if(n==1)
			s=1;
		else
		s=n*fact(n-1);
		return s;
	}
}



















