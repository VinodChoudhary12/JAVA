import java.util.Scanner;
class Test
{
	public static void main(String args[])
{
	Scanner sc = new  Scanner(System.in);
	System.out.println("Enter The line");
	int n=sc.nextInt();
	int c=n;
	int rev=0,rem;
	int i=1;
	do
	{
		rem=n%10;
		n=n/10;
		rev=(rev*10)+rem;
		i++;
	}
	while(n>0);
	if(c==rev){
		System.out.println("Number Is Palidrom");}
	else{
		System.out.println("Number Is not Palidrom");}
	}
	}
	
