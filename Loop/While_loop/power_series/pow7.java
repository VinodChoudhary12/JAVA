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
		double pow=1;   
		double sum=0,j;
		while(i<y)
		{
			pow=pow*x;
			j=(i/pow);
			sum=sum+j;
			System.out.print(i+"/"+x+"^"+i+"+");
			i++;
			if(i==y)
			{
			pow=pow*x;
			j=(i/pow);
			sum=sum+j;
			System.out.print(i+"/"+x+"^"+i+"="+sum);
			}
		}
		
		}
		}
		
