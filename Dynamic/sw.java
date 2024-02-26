class Swap
{
  public static void main(String args[])
  {
  java.util.Scanner sc=new java.util.Scanner(System.in);
  System.out.println("Enter the first number");
  int a=sc.nextInt();
  
  System.out.println("Enter the Second number");
  int b=sc.nextInt();
  
   System.out.println("Before Swaping A="+a+" B="+b);
      //b=a+b;
      //a=b-a;
      //b=b-a;
      a=a*b;
      b=a/b;
      a=a/b;
       System.out.println("After Swaping A="+a+  " B="+b);
       }
       }
