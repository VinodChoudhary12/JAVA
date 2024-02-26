// Type 1 --> No returntype without argument method.

import java.util.Scanner;
class Mul
{
    public void mul()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Performing Multiplication -->");
        System.out.print("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b = sc.nextInt();
        int c = a*b;
        System.out.println("Multiplication is "+c+"\n");
    }
    
    
    public static void main(String args[])
    {
        Mul ob = new Mul();
        System.out.println("Welcome to main method...");
        ob.mul();
        
        System.out.println("Main method end...");
    }
}
