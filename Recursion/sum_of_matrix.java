import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[5][5];
		int b[][] = new int[5][5];
		int c[][] = new int[5][5];
		System.out.println("Enter The First Matrix Elements");
		System.out.println("How Many Rows Do You Want ");
		int r1 = sc.nextInt();
		System.out.println("How Many Columns Do You Want");
		int c1 = sc.nextInt();
		System.out.println("Enter Second  Matrix Elements");
		System.out.println("How Many Rows Do You Want ");
		int r2 = sc.nextInt();
		System.out.println("How Many Columns Do You Want");
		int c2 = sc.nextInt();
		
		
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				a[i][j]=sc.nextInt();	
			}
			
		}
		System.out.println("The First Matrix Is:");
		
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				System.out.print(a[i][j]+" ");	
			}
			System.out.println();
		}
		System.out.println("The Second Matrix Elements:");
		
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("The Second Matrix Is:");
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
				System.out.println();
		}
		
		Test ob = new Test();
		System.out.print(ob.c[i][j]);
		
			
	}
	public void sum(int a[][],int b[][],int r1,int c1,int r2,int c2 )
	{
		if(n<0)
		return 0;
		
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
			
				c[i][j]=sum(a((r1-1)(c1-1))+b((r2-1)(c2-1)))+a[i][j]+b[i][j];
			}
			
			System.out.print();
		}
	
	
	
	
	}
	
	
	
	
}
