import java.util.Scanner;
 
 class Test
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
	 	int c=n,count=0;
	 	
	  while(n>0)
	 {
	  	count++;
	  	n=n/10;
	 }
	 	 	
	 	n=c;
	 	int arm=0;
 	  while(n>0)
 	 {
 	 	  int rem=n%10;
 	 	  int i=1, pow=1;
 	   while(i<=count)
	 {
	 	  pow=pow*rem;
	 	  i++;
	 }
	 	arm=arm+pow;
	 	n=n/10;
	 }
	 	
	 if(arm==c)
		System.out.println("The Number Is Armstong");
	 else
		System.out.println("The number is not Armstrong");
		
	}
	}
