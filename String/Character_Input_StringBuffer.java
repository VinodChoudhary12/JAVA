import java.util.Scanner;

 class Test
 {
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char inputChar = sc.next().charAt(0);

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(inputChar);

        System.out.println("Character input: " + stringBuffer.toString());

    }
}


