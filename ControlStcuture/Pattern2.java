
import java.util.Scanner;
public class Pattern2{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any No.");
		int no=sc.nextInt();
		for(int i=1;i<=no;i++)
		{
			for(int k=1;k<=(no+1)-i;k++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *  ");
			}
			System.out.println();
		}
		for(int i=no-1;i>=1;i--)
		{
			for(int k=1;k<=(no+1)-i;k++)
			{
				System.out.print("  ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(" *  ");
			}
			
			System.out.println();
        }
        sc.close();
    }
}