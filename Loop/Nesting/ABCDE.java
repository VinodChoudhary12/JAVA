//A
//BB
//CCC
//DDDD
//CCC
//BB
//A

class Test
{
	public static void main(String args[])
	{
		for(int i=1;i<=7;i++)
		{
			//int numChars = i < 6 ? i + 1 : rows * 2 - i - 1;
			int k=1;
			int x=(k>=4?k--:k++);
			for(int j=1;j<=4;j++)
			{
				if(j==k)
					char letter = (char) ('A' + k);
					System.out.print(letter + " ");
					System.out.print("* ");
					//int x=(k<3?k++:k--);	
				else
					 System.out.print(" ");
			}
					
			System.out.println(" ");
		}
	}	
}

// class Test
 // {
    // public static void main(String[] args) {
        // int rows = 4; // Number of rows in the pattern

        // for (int i = 0; i < rows * 2 - 1; i++) {
            // int numChars = i < rows ? i + 1 : rows * 2 - i - 1;

            // for (int j = 0; j < numChars; j++) {
                // char letter = (char) ('A' + i);
                // System.out.print(letter);
            // }

            // System.out.println();
        // }
    // }
// }
