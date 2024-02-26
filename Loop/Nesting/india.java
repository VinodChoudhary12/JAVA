// I
// IN
// IND
// INDI
// INDIA
// INDIA
// INDI
// IND
// IN
// I

class Main {
    public static void main(String[] args)
	{
        String str = "INDIA";
        for (int x = 0; x < 5; x++) 
		{
			
            for (int y = 0; y <= x; y++) 
			{
                System.out.print(str.charAt(y));
            }
            System.out.println();
        }
        for (int x = 4; x >= 0; x--)
			{
            for (int y = 0; y <= x; y++) {
                System.out.print(str.charAt(y));
            }
            System.out.println();
        }
    }
}