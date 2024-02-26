import java.util.Scanner;

class Calculator
{
   public void add()
   {
   	Scanner sc = new Scanner(System.in);
   	System.out.println("Performing Addition -->");
   	System.out.print(" Enter 1st Number : ");
   	 int a = sc.nextInt();
   	System.out.print(" Enter 2nd Number : ");
   	 int b = sc.nextInt();
   	
   	System.out.println("\n Addition is "+(a+b));
   	
   }
   public void sub()
   {
        Scanner sc = new Scanner(System.in);
        System.out.println("Performing Subtraction -->");
        System.out.print(" Enter 1st Number : ");
   	 int a = sc.nextInt();
        System.out.print(" Enter 2nd Number : ");
   	 int b = sc.nextInt();
   	
   	System.out.println("\n Subtraction is "+(a-b));
   }
   public void mul()
   {
   	Scanner sc = new Scanner(System.in);
        System.out.println("Performing Multiplication -->");
        System.out.print(" Enter 1st Number : ");
   	 int a = sc.nextInt();
        System.out.print(" Enter 2nd Number : ");
   	 int b = sc.nextInt();
   	
   	System.out.println("\n Multiplication is "+(a*b));
   }
   public void div()
   {
        Scanner sc = new Scanner(System.in);
        System.out.println("Performing Division -->");
        System.out.print(" Enter 1st Number : ");
   	 int a = sc.nextInt();
        System.out.print(" Enter 2nd Number : ");
   	 int b = sc.nextInt();
   	
   	System.out.println("\n Division is "+(a/b));
   }
   public void mod()
   {
        Scanner sc = new Scanner(System.in);
        System.out.println("Performing Modulous -->");
        System.out.print(" Enter 1st Number : ");
   	 int a = sc.nextInt();
        System.out.print(" Enter 2nd Number : ");
   	 int b = sc.nextInt();
   	
   	System.out.println("\n Modulous is "+(b%a));
   }
   
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      Calculator c = new Calculator();
      
      System.out.println("\n\n\t  -CALACULATOR-   \n");
      
      System.out.println("Press 1 for Addition .");
      System.out.println("Press 2 for Subtraction .");
      System.out.println("Press 3 for Multiplication .");
      System.out.println("Press 4 for Division .");
      System.out.println("Press 5 for Modulous .");
      
      System.out.print("\nEnter a Choice :");
      int n=sc.nextInt();
      
      switch(n)
      {
          case 1 : c.add();
                   break;
                   
          case 2 : c.sub();
                   break;
                   
          case 3 : c.mul();
                   break;
                   
          case 4 : c.div();
                   break;
                   
          case 5 : c.mod();
                   break;
                   
          default : System.out.println("Wrong Choice..");
      }     
      
      
   }
}
