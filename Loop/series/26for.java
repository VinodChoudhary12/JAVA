//2/x^2-4/x^4+6/x^6-8/x^8=0.181
import java.util.Scanner;
class Test
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n,y,j=1,i=1;
		double pow=1;
		double sum=0;
		System.out.println("Enter The number");
		n = sc.nextInt(); 
		System.out.println("Enter The Power");
		y = sc.nextInt(); 
		
		for(i=1;i<=y;i++)
		{ 
		  pow=pow*n;
		   if(i%2!=0)
		   {
		    
		    sum=sum+(2*i)/pow;
		    System.out.print("+"+(2*i)+"/"+n+"^"+(2*i));
		    }
		    
		    else
		    {
		    sum=sum-2*i/pow;
		    System.out.print("-"+(2*i)+"/"+n+"^"+2*i);
		    }
		    j++;
		
		}			
		System.out.print("="+sum);
	  }
}

	  
		    
		     
		     
		     
