import java.util.Scanner;
class Add
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
//int a,b,result;
System.out.println("Enter The principal");
int p =sc.nextInt();
System.out.println("Enter The time in year");
int t =sc.nextInt();
System.out.println("Enter The rate of intrest");
int r =sc.nextInt();
System.out.println("Enter The time");
int time =sc.nextInt();

int ci=p*((1+r/100)t));

System.out.println("The Compund intrest is :"+ci);
}
}

