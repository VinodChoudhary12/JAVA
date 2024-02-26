import java.util.Scanner;
class A
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in); 
System.out.println("Enter two numbers");
 int a =sc.nextInt();
 int b =sc.nextInt();

if(a>=b)
{
System.out.println(a +"Is big Number");
}
if(a<=b)
{
System.out.println(b + "Is big number");
}

else {
System.out.println("The numbers are Same");
}
}
}

