// Type 1 --> No returntype without argument method.

import java.util.Scanner;
class Div
{
    public void div()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Performing Division -->");
        System.out.print("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b = sc.nextInt();
        int c = a/b;
        System.out.println("Division is "+c+"\n");
    }
    
    
    public static void main(String args[])
    {
        Div ob = new Div();
        System.out.println("Welcome to main method...");
        ob.div();
        
        System.out.println("Main method end...");
    }
}
