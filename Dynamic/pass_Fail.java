import java.util.Scanner;
	class Test
{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER YOUR MARKS IN PYSCICS");
	int phy =sc.nextInt(); 
	System.out.println("ENTER YOUR MARKS IN CHEMESTRY");
	int che =sc.nextInt(); 
	System.out.println("ENTER YOUR MARKS IN MATHS");
	int math =sc.nextInt();
	System.out.println("ENTER YOUR MARKS IN HINDI");
	int hindi =sc.nextInt();
	System.out.println("ENTER YOUR MARKS IN ENGLISH");
	int english =sc.nextInt();
	
	  if(phy<33)
	    if (che<33)
	      if(math<33)
	        if(hindi<33)
	          if(english<33)
	   		System.out.println("YOU FAIL IN ALL SUBJECT");
	   
	   else
     {
	    System.out.println("YOU FAIL IN 4 SUBJECT");
	    System.out.println("YOU FAIL IN PHYsics,CHEMISTRY MATHS,HINDI");
     }
     	
           
           
	  
	   
	  }
	  }
	 
	  
	  
	 
	  
	    
	     
	
	
	
	
	
	
	 
