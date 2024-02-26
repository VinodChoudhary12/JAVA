import java.util.Scanner;

class Swap
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter any two no.");
  int a= sc.nextInt();
  int b=sc.nextInt();
  a=a^b;
  b=b^a;
  a=a^b;
  System.out.println("after swappig a="+a+"b="+b);
  }
  }
