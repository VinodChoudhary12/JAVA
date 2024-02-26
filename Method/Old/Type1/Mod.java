// Type 1 --> No returntype without argument method.

import java.util.Scanner;
class Mod
{
    public void mod()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Performing Modulous -->");
        System.out.print("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b = sc.nextInt();
        int c = a%b;
        System.out.println("Modulous is "+c+"\n");
    }
    
    
    public static void main(String args[])
    {
        Mod ob = new Mod();
        System.out.println("Welcome to main method...");
        ob.mod();
        
        System.out.println("Main method end...");
    }
}
