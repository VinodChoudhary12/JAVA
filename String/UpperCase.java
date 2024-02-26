import java.util.Scanner;
class UpperCase
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any lower case character");
char a = sc.next().charAt(0);
if(a>=97 && a<= 122)
{
System.out.println("This is an lower case character");
}else
{
System.out.println("This is not an lower case character");
}
int ascii = a;
ascii = ascii-32;
char b = (char)(ascii);
System.out.println(b);
}
}

