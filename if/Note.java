import java.util.Scanner;
class Note
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter The amount");
int am =sc.nextInt();
if(am>=500){
n=am/500;
am=am%500;
System.out.println("not 500 = "+n);
  }
 if(am>=200){
n=am/200;
am=am%200;
System.out.println("not 200 = "+n);
}
if(am>=100){
n=am/100;
am=am%100;
System.out.println("not 100 = "+n);
}
if(am>=50){
n=am/50;
am=am%50;
System.out.println("not 50 = "+n);
}
if(am>=20){
n=am/20;
am=am%20;
System.out.println("not 20 = "+n);
}
if(am>=10){
n=am/10;
am=am%10;
System.out.println("not 10 = "+n);
}
if(am>=05){
n=am/05;
am=am%05;
System.out.println("not 05 = "+n);
}
if(am>=2)
{
n=am/2;
am=am%2;
System.out.println("not 2 = "+n);
}
if(am>=1){
n=am/1;
am=am%1;
System.out.println("not 1 = "+n);
}

}
}
