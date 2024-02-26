import java.util.Scanner;
class Test
{
	 public static void main(String args[])
{
	char y;
	int n;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter The Number");
	int N=sc.nextInt();
	int i=1;
	int rev=0;
	int c=N;
	for(i=1;N>0;i++)
{
	int rem=N%10;
	N=N/10;
	rev=rev*10+rem;
}
if(c==rev)
	System.out.println("THe NUmber Is Palindrom");
else
	System.out.println("THe NUmber Is not Palindrom");
	
	System.out.println("Do You want to palindrom number from 1 to your number ");
	System.out.println("Then Press Y");
	y=sc.next().charAt(0);
if(y=='Y'||y=='y'){
	
	for( i=1;i<=c;i++)
		{
			n = i;
			while (n > 0)
			{
				int rem = n % 10;
				rev = rev * 10 + rem;
				n = n / 10;
			}
			if (rev == i)
			{
				System.out.print(i + " ");
			}
			rev = 0;
}
}
}
}


 
	
	

	
	
	



