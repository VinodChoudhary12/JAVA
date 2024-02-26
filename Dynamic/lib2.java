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
     System .out .println("No extra charges"+Days);
     }
     else if(Days<=20&&Days>15){
      int ExtraDays=Days-15;
      float Amount=Days+(ExtraDays*0.5f);
     System .out .println("extra charges add0.50 paise"+Amount);
     }
     else if(Days<=30&&Days>20)
     {
     int ExtraDays=Days-15;
     int Amount=Days+(ExtraDays*1);
     System .out .println("extra charges add 1 rs."+Amount);
     }
     else if (Days<=60&&Days>30)
     {
     int ExtraDays=Days-15;
     int Amount=Days+(ExtraDays*5);
     System .out .println("extra charges add 5 rs."+Amount);
     }
     else 
     	System .out .println("your membership  is cancelled bcoz you are delay in returnig the book:");
   }
}
