import java.util.Scanner;
class Cal
{
   public static void main(String args[])
   {
   char y;
   do
   {
   	
      Scanner sc = new Scanner(System.in);
      System.out.println("\t Your Choices Are -->");
      System.out.println("\t Press 1 for Addition. \n\t Press 2 for Subtraction.");
      System.out.println("\t Press 3 for Multiplication. \n\t Press 4 for Division. \n\t Press 5 for Modulous.\n");
      
      System.out.println("\t Enter Your Choice -->");
      int ch=sc.nextInt();
      
      if(ch==1)
      {
         System.out.println("\t First Number  -->");
         double a=sc.nextDouble();
         System.out.println("\t Second Number -->");
	 double b=sc.nextDouble();
	 double res=a+b;
	 System.out.println("\t Addition is "+res);
	  
      }
      else if(ch==2)
      {
         System.out.println("\t First Number  -->");
         double a=sc.nextDouble();
         System.out.println("\t Second Number -->");
	 double b=sc.nextDouble();
	 double res=a-b;
	 System.out.println("\t Subtraction is "+res);
	  
      }
      else if(ch==3)
      {
         System.out.println("\t First Number  -->");
         double a=sc.nextDouble();
         System.out.println("\t Second Number -->");
	 double b=sc.nextDouble();
	 double res=a*b;
	 System.out.println("\t Multiplicatiion is "+res);
	  
      }
      else if(ch==4)
      {
         System.out.println("\t First Number  -->");
         double a=sc.nextDouble();
         System.out.println("\t Second Number -->");
	 double b=sc.nextDouble();
	 double res=a/b;
	 System.out.println("\t Division is "+res);
	  
      }
      else if(ch==5)
      {
         System.out.println("\t First Number  -->");
         double a=sc.nextDouble();
         System.out.println("\t Second Number -->");
	 double b=sc.nextDouble();
	 double res=a%b;
	 System.out.println("\t Moodulous is "+res);
	  
      }
      else
      {
        System.out.println("\t Your Choice is Wrong.");
      }
      
      System.out.println("Do You want to perform more opration");
      System.out.println("Then Press Y");
      y=sc.next().charAt(0); 
    
   }
   while(y=='Y'||y=='y');
   
}
}
