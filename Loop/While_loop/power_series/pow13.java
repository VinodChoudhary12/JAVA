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
		double sum=0;
		double j=0;  
		
		while(i<=y)
		{	
		if(i==y){
			pow=pow*x;
			j=(i+1)/pow;
			sum=j+sum;
		  	System.out.print((i+1)+"/"+x+"^"+i+"=");
		  }
		  
		else{	
			pow=pow*x;
			j=(i+1)/pow;
			sum=j+sum;		
			System.out.print((i+1)+"/"+x+"^"+i+"+");
			}
			i++;
			}
			System.out.print(sum);
			
			}
			}
			
