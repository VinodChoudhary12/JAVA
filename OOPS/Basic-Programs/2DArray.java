import java.util.Scanner;
class TwoDArray
{
	private int a[][]= new int[3][3];
	private int row,col;
	public void setData(int a[],int row,int col)
	{
		this.row=row;
		this.col=col;
		this.a=new int [row][col];
	}
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<this.row;i++)
		{
			for(int j=0;i<this.col;j++)
			{
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
	
	}
	public void output()
	{
		for(int i=0;i<this.row;i++)
		{
			for(int j=0;i<this.col;j++)
			{
				System.out.println(a[i][j]);
			}
			System.out.println();
		}
	
	}
}

class Test
{
	public static void main(String []args)
	{
		TwoDArray ob = new TwoDArray();
		int a=ob.setData(a,3,3);
		System.out.println(a);
		
		ob.input();
		ob.output();
	}
}
		
		
		