// A
// BB
// CCC
// DDDD
// CCC
// BB
// A





class Test {
    public static void main(String[] args)
	{
        //String str = "ABCD";
        for (int x = 0; x < 5; x++) 
		{
			
            for (int y = 0; y <= x; y++) 
			{
                System.out.print(str.charAt(y));
            }
            System.out.println();
        }
        for (int x = 5; x >= 0; x--)
			{
            for (int y = 0; y <= x; y++) {
                System.out.print(str.charAt(y));
            }
            System.out.println();
        }
    }
}