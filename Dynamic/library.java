import java.util.Scanner;
class Library
{
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the days of issue book");
     int Days=sc.nextInt();
     
     if(Days<=15)
     { 
     Days=15
     System .out .println("No extra charges"+Days);
     }
     else if(Days<20){
      int v=Days-15;
      float f=Days+(v*0.5f);
     System .out .println("extra charges add0.50 paise"+f);
     }
     else if(Days<30)
     {
     int v=Days-15;
     int s=Days+(v*1);
     System .out .println("extra charges add 1 rs."+s);
     }
     else if (Days<=60)
     {
     int v=Days-15;
     int t=Days+(v*5);
     System .out .println("extra charges add 5 rs."+t);
     }
     else 
     	System .out .println("your membership  is cancelled bcoz you are delay in returnig the book:");
   }
}
