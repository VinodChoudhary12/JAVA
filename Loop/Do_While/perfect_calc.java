import java.util.Scanner;
class Test
{
	public static void main(String args [])
{
	char y;
do
{
	Scanner sc=new Scanner(System.in);
	System.out.println("\tPress 1 for Addition:\n\tPress 2 For subtraction:");
	System.out.println("\tPress 3 for Multiplication:\n\tPress 4 For Division:");
	System.out.println("\tPress 5 for Modulas:");
	System.out.println("Enter your Choice:");
	int ch=sc.nextInt();
	if (ch<0 || ch>5){
	   System.out.println("You Entred Wrong ");
	   //ch=sc.nextInt();
	}
	else if(ch>=1||ch<=5){
	System.out.println("Enter any Two Numbers:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	double res;
	switch(ch)
{
	case 1:
	 {
		res=a+b;
		System.out.println("The Addition of " +a +"  And "+ b+" Is "+res);
		break;
	 }
	 	
	 case 2:
	 {
		res=a-b;
		System.out.println("The Subration of " +a +"  And "+ b+" Is "+res);
		break;
	 }
	 case 3:
	 {
		res=a*b;
		System.out.println("The Multiplication  of " +a +"  And "+ b+" Is "+res);
		break;
	 }
	 case 4:
	 {
		res=a/b;
		System.out.println("The Division of " +a +"  And "+ b+" Is "+res);
		break;
	 }
	 case 5:
	 {
		res=a%b;
		System.out.println("The Modulas of " +a +"  And "+ b+" Is "+res);
		break;
	 }
	 }
	 
	 }else
	 {	
	 	System.out.println("You Entred Wrong Choice:");
	 }	
	
	System.out.println("Do you Want to Perform more opration");
	System.out.println("Then press Y");
	   y=sc.next().charAt(0);

} 
	while(y =='y'||y=='Y');
}
}


	 	
	 
	 
		
	 

