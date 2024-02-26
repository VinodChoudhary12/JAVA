import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		Test ob = new Test();
		System.out.println("Enter The number");
		int n = sc.nextInt();
		System.out.println("The Result Is ");
		System.out.println(ob.digit(n));
	
	}
	public int digit(int n)
	{
		int s;
		//if(n>=0&&n<=9)
		    //s=n;   
		if(n==0)
			s=0;
		else
			s=digit(n/10)+n%10;
		return s;
	
	}


}
