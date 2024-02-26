import java.util.Scanner;
public class Pattern1{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any No.");
		int no=sc.nextInt();
		int x=1,y=0,j;
		
		for(int i=0;i<no;i++)
		{
			for(j=1;j<=y+x;j++)
			{
				System.out.print(" * ");
			}
				y=j-1;
			System.out.println();
			
				x=i+1;
		}   
    sc.close();          
	}
    
}