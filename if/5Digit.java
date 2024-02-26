import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 Digit Number");
        int a =sc.nextInt();
		int n=a/10000;
		int l=a%10;
		int s=n+l;
		int sq=s*s;
		int se=a/1000%10;
		int ls=a/10%10;
		int su=se+ls;
		int m=a/100%10;
		int sQ=su*su;

		if(100000>n)
		{
			System.out.println("First number is :" +n);
			System.out.println("Last number is :" +l);
			System.out.println("Sum of First and Last number is "+s);
			System.out.println("Sqaure of Sum is :"+ sq);
			System.out.println("Second Number is:"+se);
			System.out.println("Second Last number is :"+ls);
			System.out.println("Sum of Senocnd and Second Last number is :" + su);
			System.out.println("Square of Sum is :"+sQ);
			System.out.println("The middle number is :"+m);
		}
	}
}


