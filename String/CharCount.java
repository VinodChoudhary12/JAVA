import java.lang.String;
import java.util.Scanner;
public class CharCount
{
	public static void main(String []args)
	{
			CharCount ob = new CharCount();
			System.out.println(ob.charCount());
	}	
	public int charCount()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		char c = sc.next().charAt(0);	
		String s1 = "Nitin";
		int count = 0;
		for(int i=0;i<s1.length();i++)
		{
			if(c==s1.charAt(i))
				count++;	
		}
		return count;
	}
}