
//WAP to x^1/1! + x^2/2! + x^3/3! + x^4/4! + x^5/5!  =  6.266667
import java.util.Scanner;
class Series_22
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int x,y,i=1;
		float sum=0,pow=1,fact=1;
		System.out.println("Enter any two number");
		x = sc.nextInt();
		y = sc.nextInt();
		do
		{
			pow = pow*x;
			fact*=i;
			sum=sum +(pow/fact);
			
			System.out.print(x+"^"+i+"/"+i+"!");
			if(i<y)
				System.out.print(" + ");
	
			i++;
		}while(i<=y);
		System.out.println(" = "+sum);
	}
}