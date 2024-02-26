//WAP to x^1/2 + x^2/3 + x^3/4 + x^4/5 + x^5/6 = 12.866
import java.util.Scanner;
class Test
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int x,y,i=1;
		float pow=1,sum=0;
		System.out.println("Enter any two number");
		x = sc.nextInt();
		System.out.println("Enter The power");
		y = sc.nextInt();
		
	  for(i=1;i<=y;i++)
	   {
	   	pow*=x;
	   	sum+=pow/(i+1);
	   	System.out.print(x+"^"+i+"/"+(i+1));
	   	  if(i<y)
	   	  	System.out.print("+");
	   }
	   	System.out.print("="+sum);
	}
}
	   	
	   	
	  	
	  
