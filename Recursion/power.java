import java.util.Scanner;
class Test
{
	public int power(int x,int y)
	{
		int s;
		if(y==1)
			s=x;
		else
			s=power(x,y-1)*x;//s=this.(x,y-1)*x;
		return s;		
	}
	public static  void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int x = sc.nextInt();
		System.out.println("Enter The Power");
		int y = sc.nextInt();
		Test ob = new Test();
		System.out.println("The Answer is:");
		System.out.println(ob.power(x,y));
	
	
	}
}
