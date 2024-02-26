import java.lang.System;
import java.util.Scanner;
class Samagra
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("\t\t SAMAGRA PORTAL \t");
System.out.println("\t SAMAGRA SAMAJIK SURAKSHA MISHAN M.P. \t");
System.out.println("\t\t SAMAGRA ID CARD \t");
System.out.println("Enter YOUR FAMILY SAMAGRA ID");
int Family=sc.nextInt();
System.out.println("ENTER YOUR FAMILY CHIEF MEMBER");
String Chief=sc.next();
System.out.println("Enter Your Addresss");
String Add=sc.next();
System.out.println("ENTER Adhar card number of 1st member");
String ad1=sc.next();
System.out.println("ENTER Adhar card number of 2st member");
String ad2=sc.next();
System.out.println("ENTER Adhar card number of 3st member");
String ad3=sc.next();
System.out.println("ENTER Adhar card number of 4st member");
String ad4=sc.next();
System.out.println("ENTER 1st Member Name");
String Name1=sc.next();
System.out.println("ENTER 2st Member Name");
String Name2=sc.next();
System.out.println("ENTER 3st Member Name");
String Name3=sc.next();
System.out.println("ENTER 4st Member Name");
String Name4=sc.next();
System.out.println("Samagra Family ID : 123456");
System.out.println("Family Cheif Name:ABCDE");
System.out.println("Current address 111 INDIA");
System.out.println("\t\t Detail of Family Menmbers\t");
System.out.println("_____________________________________________________________");
System.out.println("|SR.|    Adhar number    |Name of Member|Age    |Gender |");
System.out.println("|___|____________________|_________________________|_______|");
System.out.println("| 1 |     "+ad1 +"\t\t |    "+Name1+"\t |  35      |  M    |");
System.out.println("|___|____________________|_________________________|_______|");
System.out.println("| 2 |     "+ad2 +"\t\t |    "+Name2+"\t |  30      |  M    |");
System.out.println("|___|____________________|_________________________|_______|");
System.out.println("| 3 |     "+ad3 +"\t\t |    "+Name3+"\t |  12      |  F    |");
System.out.println("|___|____________________|_________________________|_______|");
System.out.println("| 4 |     "+ad4 +"\t\t |    "+Name4+"\t | 15       |  F    |");
System.out.println("|___|____________________|_________________________|_______|");

}
}

