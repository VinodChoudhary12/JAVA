class Swap
{
   public static void main(String args[])
   {
   java.util.Scanner sc=new java.util.Scanner(System.in);
   System.out.println("Enter first number");
   int a=sc.nextInt();
   System.out.println("Enter Second number");
   int b=sc.nextInt();
     System.out.println("Before Addition A= "+a+"B= "+b);
     int temp=a;
         a=b;
         b=temp;
           System.out.println("After Swapping A= "+a+ "B= "+b);
           }
      }
   
