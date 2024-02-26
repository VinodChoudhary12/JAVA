// Type 1 --> No returntype without argument method.

import java.util.Scanner;
class DMType1
{
    public void add()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Performing Addition -->");
        System.out.print("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("Addition is "+c+"\n");
    }
    
    public void show()
    {
        System.out.println("Hello show...");
    }
    
    public static void main(String args[])
    {
        AddMethod ob = new AddMethod();
        System.out.println("Welcome to main method...");
        ob.add();
        ob.show();
        System.out.println("Main method end...");
    }
}
