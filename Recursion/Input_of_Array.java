import java.util.Scanner;
class Test
{	
	int a[]= new int[10];
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How Many Elements Do You Want To Enter");
		int n= sc.nextInt();
		Test ob = new Test();
		int x[]= new int[10];
		x=ob.input(n-1,0);
		System.out.println("The Elements Are:");
		for(int i=0;i<n;i++)
		System.out.println("\ta["+i+"]="+x[i]);
	
	}
	public int[] input(int n,int i)
	{
		Scanner sc = new Scanner(System.in);
		if(n==0)
			 a[i]=sc.nextInt();
		else
		{
			a[i]=sc.nextInt();
			input(n-1,i+1);
		}
			return a;
	}
}
	
