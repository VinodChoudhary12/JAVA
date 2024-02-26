
import java.util.Scanner;
 
 class Test
{
	public static void main(String[] args)
	{
		int r,rem,arm = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
	 	int c=n;
	 	int i=1;
	 while(n>0)
	 {
	 	
	 	rem=n%10;
		n=n/10;
		arm=arm+(rem*rem*rem);
		i++;
		
	}
	
	if(arm==c)
		System.out.println("The Number Is Armstong");
	else
		System.out.println("The number is not Armstrong");
		
	}
	}
	
	
	 	
	
