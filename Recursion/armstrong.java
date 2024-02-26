import java.util.Scanner;
class arm
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		Arm ob = new Arm();
		System.out.println(ob.pow(2,5));
	}
	
	public  int pow(int x,int y)
	{
		int s;
		if(y==1)
			s=x;
		else
			s=pow(x,y-1)*x;
		return s;	
	}
	public int rem(int n)
		int s;
		if(n>0)
			n=n%10;
			
}
