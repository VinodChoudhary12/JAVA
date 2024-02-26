import java.util.Scanner;

class If
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("fail in physics");
	int p=sc.nextInt();
	System.out.println("fail in chemistry");
	int c=sc.nextInt();
	System.out.println("fail in maths");
	int m=sc.nextInt();
	System.out.println("fail in english");
	int e=sc.nextInt();
	System.out.println("fail in hindi");
	int h=sc.nextInt();
	if(p<33)
	  if(c<33)
	    if(m<33)
	      if(e<33)
	        if(h<33)
		   System.out.println("fail in all subject");
		else
		   System.out.println("fail in p,c,m,e");
// english
              else
	         if(h<33)
	         	System.out.println("fail in p,c,m,h");
	         else
	         	System.out.println("fail in p,c,m");
// maths
	    else
	        if(e<33)
		    if(h<33)
			System.out.println("fail in p,c,e,h");
		    else
			System.out.println("fail in p,c,e");
		else
		    if(h<33)
			System.out.println("fail in p,c,h");
		    else
		    	System.out.println("fail in p,c");
// chemistry
	  else
	     if(m<33)
	       if(e<33)
		  if(h<33)
		     System.out.println("fail in p,m,e,h");
	 	  else
	 	     System.out.println("fail in p,m,e");
	       else
	          if(h<33)				         	  	
		     System.out.println("fail in p,m,h");
      		 else
      		     System.out.println("fail in p,m");
      	    else
      	       if(e<33)
      	           if(h<33)
      	             System.out.println("fail in p,e,h");
      	           else   
      	             System.out.println("fail in p,e");
      	       else
      	          if(h<33)
      	             System.out.println("fail in p,h");
      	          else
      	             System.out.println("fail in only p");
 
      	             
      	   	     
		     
		     
	
	
	
	
	}
}


















