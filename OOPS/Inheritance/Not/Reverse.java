import java.util.Scanner;
class Reverse
{
	int n;
	public void setData(int n)
	{
		this.n = n;
	}
	public int getData()
	{
		return this.n;
	}
	public int reverse()
	{
		int rev = 0;
        	int temp = this.n; // Store the original number in a temporary variable
        	while (temp != 0) 
		{
            		int rem = temp % 10;
            		rev = rev * 10 + rem;
            		temp = temp / 10;
		}
		return rev;
	}
}
class Palindrome extends Reverse
{
	public boolean palindrome()
	{
		setData(n);
		return getData()==reverse();		
	}	
}
class Test 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Palindrome ob  = new Palindrome();
		System.out.println("Enter The Number");
		int n = sc.nextInt();
		ob.setData(n);
		System.out.println("Reverse = "+ob.reverse());
		System.out.println("Enter The Number");
		n = sc.nextInt();
		ob.setData(n);
		System.out.println("Number is palindrome = "+ob.palindrome());
	}
}
