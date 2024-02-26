//								1
//  						  1 2 1
					//		1 2 3 2 1
					//	  1 2 3 4 3 2 1
				//      1 2 3 4 5 4 3 2 1
				
class Test
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			int k=1;
			for(int j=1;j<=9;j++)
			{

				if(j>=6-i&&j<=4+i)
				{
					System.out.print(" "+*+" ");
					int x=(j<5?k--:k++);
				}
				else
					System.out.print("   ");
			}
			System.out.println(" ");
			
		}
	}
}