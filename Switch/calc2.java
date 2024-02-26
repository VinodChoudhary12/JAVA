import java.util.Scanner;
class Test
{
	public static void main(String args [])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("\tPress 1 for Addition:\n\tPress 2 For subtraction:");
	System.out.println("\tPress 3 for Multiplication:\n\tPress 4 For Division:");
	System.out.println("\tPress 3 for Modulas:");
	System.out.println("Enter your Choice:");
	int ch=sc.nextInt();
	if (ch<0 || ch>5){
	   System.out.println("You Entred Wrong ");
	   //ch=sc.nextInt();
	}
	else if(ch>=1||ch<=5){
	System.out.println("Enter any Two Numbers:");
	double a=sc.nextDouble();
	double b=sc.nextDouble();
	double res;
	switch(ch)
{
	case 1:
	 {
		res=a+b;
		System.out.println("The Addition of Two numbe is: "+res);
		break;
	 }
	 	
	 case 2:
	 {
		res=a=b;
		System.out.println("The Subration of Two numbe is: "+res);
		break;
	 }
	 case 3:
	 {
		res=a*b;
		System.out.println("The Multiplication  of Two numbe is: "+res);
		break;
	 }
	 case 4:
	 {
		res=a/b;
		System.out.println("The Division of Two numbe is: "+res);
		break;
	 }
	 case 5:
	 {
		res=a%b;
		System.out.println("The Modulas of Two numbe is: "+res);
		break;
	 }
	 }}else
	 {	
	 	System.out.println("You Entred Wrong Choice:");
	 }
	


}
}


	 	
	 
	 
		
	 

