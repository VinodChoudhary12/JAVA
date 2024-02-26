import java.util.Scanner;
class AdharCard
{
public static void main (String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter The name of Candidate");
String Name=sc.nextLine();
System.out.println("DATE OF BIRTH");
String DOB =sc.nextLine();
System.out.println("Enter The GENDER");
String Gen=sc.nextLine();
System.out.println("Enter The ADHAR NUMBER");
String Adh=sc.nextLine();
System.out.println("Enter The VID NUMBER");
String Vid=sc.nextLine();
System.out.println(" __________________________________________________");
System.out.println("|\t       Government of India                 |");
System.out.println("|__________________________________________________|");
System.out.println("|                                                  |");
System.out.println("|\t ________    NAME  :       "+Name+"           |");
System.out.println("|\t|        |   DOB   :       "+DOB+"       |");
System.out.println("|\t|        |   Gender:       "+Gen+"            |");
System.out.println("|\t|        |              "       +"                   |");
System.out.println("|\t|________|             "        +"                    |");
System.out.println("|\t    ADHAR NUMBER   :"       +Adh       +"              |");
System.out.println("|\t    VID            :"       +Vid	+"               |");
System.out.println("|__________________________________________________|");

}

}


