import java.util.Scanner;
class Switch
{
  public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
     
     
     System.out.println(" Enter First Number  -->");
     double a=sc.nextDouble();
     System.out.println(" Enter Second Number -->");
     double b=sc.nextDouble();
     double res;
     System.out.println(" Your Choices Are -->");
     System.out.println("\t Press 1 for Addition. \n\t Press 2 for Subtraction.");
     System.out.println("\t Press 3 for Multiplication. \n\t Press 4 for Division. \n\t Press 5 for Modulous.\n");
     
     System.out.println(" Enter Your Choice -->");
     int ch=sc.nextInt();
     switch(ch)
     {
       case 1 : res=a+b ;
       	 System.out.println(" Addition is "+res); 
                break;
       
       case 2 : res=a-b ;
       	 System.out.println(" Subtraction is "+res); 
               break;
       	 
       case 3 : res=a*b ;
       	 System.out.println(" Multiplication is "+res); 
     		break;
     
       case 4 : res=a/b ;
       	 System.out.println(" Division is "+res); 
       	break; 
       	 
       case 5 : res=a%b ;
       	 System.out.println(" Modulous is "+res); 
       	 break;
       	  
       default : System.out.println(" Wrong Choice  ...."); 
     }
     
  }
}
