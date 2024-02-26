// Type 1 --> No returntype without argument method.

import java.util.Scanner;
class Sub
{
    public void sub()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Performing Subtraction -->");
        System.out.print("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b = sc.nextInt();
        int c = a-b;
        System.out.println("Subtraction is "+c+"\n");
    }
    
    
    public static void main(String args[])
    {
        Sub ob = new Sub();
        System.out.println("Welcome to main method...");
        ob.sub();
        
        System.out.println("Main method end...");
    }
}
