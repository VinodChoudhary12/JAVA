//WAP to -x^1/2 + x^2/3 - x^3/4 + x^4/5 - x^5/6  = - 3.8000002
import java.util.Scanner;
class Series_12
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int x,y,i=1;
		float pow=1,sum=0;
		System.out.println("Enter The number");
		x = sc.nextInt();
		System.out.println("Enter The Power");
		y = sc.nextInt();
	  	for(i=1;i<=y;i++)
	   	{
	   	    if(i%2!=0)
	  	    {    
	  	      sum-=pow/(i+1);
	    	      System.out.print("+"+x+"^"+i+"/"+(i+1)+"-");
	    	    }
	    	    else
	    	    {  
	    	        sum+=pow/(i+1);
	    	        System.out.print(x+"^"+i+"/"+(i+1));
	    	    }
	        }
	    	System.out.print(sum);
	}
}
