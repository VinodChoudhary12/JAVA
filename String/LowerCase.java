import java.util.Scanner;
class LowerCase
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any Upper case character");
char a = sc.next().charAt(0);
if(a>=65 && a<=90 )
{
System.out.println("This is an Upper case character");
}else
{
System.out.println("This is not an Upper case character");
}
int ascii = a;
ascii = ascii+32;
char b = (char)(ascii);
System.out.println(b);
}
}


