import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		Test ob = new Test();
		//System.out.println(num(n));
		ob.num(n);
		
	}
	
	static void num(int n)
	{
		if(n==1)
			System.out.println(1);
		num(n-1);
		System.out.println(n);
				
	}
}
