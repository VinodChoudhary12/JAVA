import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
	
		sum ob = new sum();
		ob.setData();
		ob.getData();
		int n = ob.EvenSum(n);
	}
	
}
class Sum
{
	private int n;
	public int setData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number:");
		int n = sc.nextInt();
		this.n=n;
	}
	public void getData()
	{
		System.out.println("You Enter:"+n);
	}
	public int EvenSum(n)
	{
		if(n==0)
			return 0;
		int Esum=EvenSum((n-1)*2)+(n*2);
		return Esum;	
	}




}
