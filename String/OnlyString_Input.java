import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		boolean flag =false;;
		do
		{
			System.out.println("Enter Your Name");
			String s = sc.next();
			flag =false;
			for(int i=0;i<s.length();i++)
			{
				if((s.charAt(i)<97 || s.charAt(i)>122) & (s.charAt(i)<65 || s.charAt(i)>90))
				{
					System.out.println("Please Enter Vaild Username:");
					
					flag = true;
					break;
				}
				
			}
		}while(flag);
	}
	
}