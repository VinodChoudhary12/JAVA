import java.util.Scanner;
public class Length 
{
    public static void main(String[] args) 
    {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the String ");
                String s1 = new String(sc.nextLine());
                int length = lengthMethod(s1);
                System.out.println("Length of the string: " + length);
    }
        
            public static int lengthMethod(String s1) 
            {
                int length = 0;
                char[] charArray = s1.toCharArray();
                for (char c : charArray) {
                    length++;
            }
                return length;
    }
}
        
    
