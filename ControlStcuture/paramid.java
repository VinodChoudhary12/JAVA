public class paramid 
{
    // public static void main(String[] args) {
        
    //     for(int i =1;i<=5;i++)
    //     {
    //         int k =1;
    //         for(int j=1;j<=9;i++)
    //         {
    //             if(j>=6-i&&j<=4+i)
	// 			{
	// 				System.out.print(" + ");
	// 				int x=(j<5?k--:k++);
	// 			}
    //             else
    //             {
    //                 System.out.print("");
    //             }

    //         }
    //         System.out.println();
    //     }
    // }
    
    public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			int k=1;
			for(int j=1;j<=9;j++)
			{

				if(j>=6-i&&j<=4+i)
				{
					System.out.print(" "+"*"+" ");
					int x=(j<5?k--:k++);
				}
				else
					System.out.print("   ");
			}
			System.out.println(" ");
			
		}
        for(int i=5;i<=1;i--)
		{
			int k=1;
			for(int j=9;j<=1;j--)
			{

				if(j>=6-i&&j<=4+i)
				{
					System.out.print(" "+"*"+" ");
					int x=(j<5?k--:k++);
				}
				else
					System.out.print("   ");
			}
			System.out.println(" ");
			
		}
        
	}
}
