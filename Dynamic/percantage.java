import java.util.Scanner;
	class Test
{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	  System.out.println("Enter Percantage");
	int per =sc.nextInt(); 
	if(per<0)
	  System.out.println("INVIALID PERCENTAGE........");
	else
    {
	if(per>100)
	  System.out.println("INVIALID PERCENTAGE........");
	  else
    {
    	if(per>=60)
    	   System.out.println("PASS IN FIRST DIVISOIN");
    	 else
    {
    	if(per>45)
    	  System.out.println("PASS IN SECOND DIVISOIN");
    	  
    	 else
    {
    	if(per>33)
    	  System.out.println("PASS IN THIRD DIVISOIN");
    	  
    	  else
    {
    	System.out.println(".....FAIL.......");
    }
    }
    }
    }
    }
}
}

    	  
    	                                   
    	                               
    	   	

