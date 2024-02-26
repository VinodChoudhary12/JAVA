import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Elements Do You Want To Enter");
		int n = sc.nextInt();
		int a[] = new int[10];
		System.out.println("Enter Array Elements ");
		for (int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("The Result is");
		for(int i=0;i<n;i++)
			System.out.println("a["+i+"]="+a[i]);
		Test ob = new Test();
		System.out.println("The Sum Off Elements Are: "+ob.sum(a,n));
	}
	
	
	public int sum(int a[],int n)
	{
		int sum=0;
		if(n==0)
			sum= a[0];
		else if(n>0)
			sum=sum(a,(n-1))+a[n];
		return sum;    
			
	}
	
}
