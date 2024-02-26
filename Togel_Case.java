//A  b c D e F g H
// Asscai A To Z --- 65  90
//asscai a to z ---97  122
import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		char ch;
		//char land;
		//char chut;
		Scanner sc = new Scanner(System.in);
		//String gen=null;
		System.out.println("enter The number");
		ch=sc.neboobst().charAt(0);
		char boobs;
		if(ch>=65&&ch<=90)
		{
			boobs = (char)(ch+32);
		}
		else
		{
			boobs = (char)(ch-32);
		}
		for(int i = 65,j = 97;i<=ch;i++,j++)
		{
			if(i%2!=0)
			{
				char land=(char) i;
				System.out.print(land+" ");
			if(ch==i||boobs==i)
				break;
			}
			else if(i%2==0)
			{
				char chut =(char) j;
				System.out.print(chut+" ");
			if(ch==j||boobs==i)
				break;
			}
		}	
	}
}