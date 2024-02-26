//!2+!4+!6=746
import java.util.Scanner;
class Test
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n,i=1;
		int k=1,sum=0,fact=1;
		System.out.println("Enter The number");
		n = sc.nextInt();    
		  
		      while(k<=n)
		   {
		      fact=fact*i;
		      if(i%2==0)
		      {
		      	sum=sum+fact;
		      	k++;
		      
		      		System.out.print("!"+i);
		       if(k<=n)
			      	System.out.print("+");
		      }
		      
		      i++;
		   }
		   
		    System.out.print("="+sum);
	}
}

 	/*for(i=1;i<=n;)
		{
			fact=fact*j;
		  if(j%2==0)
		    {
		      sum=sum+fact;
		      i++;
		          System.out.print("!"+j);
		       if(i<=n)
			      	System.out.print("+");
		      }
		      j++;
		  }
		     System.out.print("="+sum); */
		     
		     
		     
		   
		  	  
		
