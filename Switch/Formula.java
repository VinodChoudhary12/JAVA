import java.util.Scanner;
class Calc {
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER YOUR CHOICE");
System.out.println("\tPress 1 for Area of Square: \n\tPress 2  for area of cube:");
System.out.println("\tPress 3 of Area of Cylinder: \n\tPress 4 for area of Cone:");
System.out.println("\tPress 5 for Area of Circle:\n\tPress  6 for area of rectangle");
int ch=sc.nextInt();
double res;
switch(ch)
{ 
	case 1:
	{
	System.out.println("Enter The Side");
	int a=sc.nextInt();
	res=(a*a);
	System.out.println("The Sqaure of  Is:" +res);
	}
	
	case 2:
	{
	System.out.println("Enter The Side");
	int a=sc.nextInt();
	res=(6*a);
	System.out.println("The area  of Cube Is:" +res);
	break;
	}
	
	case 3:
	{
	System.out.println("Enter The radius of Cylinder");
	int a=sc.nextInt();
	System.out.println("Enter The Height of Cylinder");
	int b=sc.nextInt();
	res=(2*3.14*a*b)+(2+3.14*a*a);
	System.out.println("The Area of Cylinder is:"+res);
	break;
	
	}
	
	case 4:
	{
	System.out.println("Enter The radius of Cone");
	int a=sc.nextInt();
	System.out.println("Enter The Height of Cone");
	int b=sc.nextInt();
	res=(3.14*a*b)+(3.14*a*a);
	System.out.println("The area  of Cone Is:" +res);
	break;
	}
	
	case 5:{
	System.out.println("Enter The radius of Cirlce");
	int a=sc.nextInt();
	res=(3.14*a*a);
	System.out.println("The area of circle"+res);
	break;
	}
	
	case 6:
	{
	System.out.println("Enter The Lenth of Ractangle");
	int a=sc.nextInt();
	System.out.println("Enter The Width of Ractangle");
	int b=sc.nextInt();
	res=(a*b);
	System.out.println("The area of ractangle is  of "+res);
	break;	
        }
}



}
}


	
	
	
	
	
	
	
	
	

