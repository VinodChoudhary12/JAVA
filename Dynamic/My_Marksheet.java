import java.lang.String;
import java.lang.System;
import java.util.Scanner; 
class Marksheet
{
    public static void main(String args[])
    {
    	
    	Scanner sc =new Scanner(System.in);
    	System.out.println("Enter your name");
    	String Name =sc.next();
    	System.out.println("Enter your Roll no.");
    	int Roll =sc.nextInt();
    	System.out.println("Enter your Fathe's Name");
    	String FName =sc.next();
    	System.out.println("Enter your Mothers Name");
    	String MName = sc.next();
    	System.out.println("Enter your Course");
    	String Course=sc.next();
    	System.out.println("Enter your Branch");
    	String Branch=sc.next();
    	System.out.println("Enter your Year");
    	String Year=sc.next();
    	System.out.println("Enter your Semester");
    	String Sem=sc.next(); 
    	System.out.println("Enter your Hindi opt Marks");
    	int op1=sc.nextInt();
    	System.out.println("Enter your English opt Marks");
    	int op2=sc.nextInt();
    	System.out.println("Enter your Maths opt Marks");
    	int op3=sc.nextInt();
    	System.out.println("Enter your Physics opt Marks");
    	int op4=sc.nextInt();
    	System.out.println("Enter your Chemesty opt Marks");
    	int op5=sc.nextInt();
    	System.out.println("\n\n\t\t\t\tRGPV-BHOPAL\n");
    	System.out.println("    Roll:" +Roll +   "\t\t\t\t\t\t\t Course :"+Course);
    	System.out.println("    Name:" +Name +   "\t\t\t\t\t\t\t Branch :"+Branch);
    	System.out.println("    FName:" +FName+  "\t\t\t\t\t\t\t Sem    :"+Sem);
    	System.out.println("    MName:" +MName+  "\t\t\t\t\t\t\t Year   :"+Year);
    	int total=(op1+op2+op3+op4+op5);
    	
    	System.out.println("\tSubCode     SubName     MaxMarks   MinMarks    ObtMarks");
    	System.out.println("\tCSE-501     Hindi         70         21        "+op1);
    	System.out.println("\tCSE-502     English       70         21        "+op2);
    	System.out.println("\tCSE-503     Maths         70         21        "+op3);
    	System.out.println("\tCSE-504     Physics       70         21        "+op4);
    	System.out.println("\tCSE-505     Chemistry     70         21        "+op5);
    	System.out.println("__________________________________________________________________________________________");
    	System.out.println( " \t\t\t\t\t\t\t                  TOTAL Marks:"+total);                            
    }
}
