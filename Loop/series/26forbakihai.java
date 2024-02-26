//2/x^2-4/x^4+6/x^6-8/x^8=0.181
import java.util.Scanner;
class Test
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n,y,i=1;
		double pow=1;
		double sum=0;
		System.out.println("Enter The number");
		n = sc.nextInt(); 
		System.out.println("Enter The Power");
		y = sc.nextInt(); 
		
	   for(i=1;i<=y;i++)
	   {  
	   	pow=pow*n;
	       if(i%2==0)
	       {
	          System.out.print("-"+(2*i)+"/"+n+"^"+(2*i));
	          sum=sum-((i*2)/pow);
	          }
	       
	        else
	       { 
	           System.out.print("+"+(i*2)+"/"+n+"^"+(i*2));
	          sum=sum+((i*2)/pow);
	       }
	   }
	   	System.out.print("="+sum);
	}
}

	     
	      
	          
	         
	       
		 
		
