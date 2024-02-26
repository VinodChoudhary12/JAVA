import java.util.Scanner;
class Test
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int x = sc.nextInt();
		System.out.println("Enter the Power:");
		int y= sc.nextInt();
		int i=1;
		int pow=1;
		int sum=0;
		while(i<y)
		{
		System.out.print(x+"^"+i+"+");
		pow=(pow*x);
		sum=sum+pow;
		i++;
		if(i==y){
		  System.out.print(x+"^"+i+"=");
		pow=(pow*x);
		  sum=sum+pow;}
		  
		}
		System.out.print(sum);
		}
		}
		 
