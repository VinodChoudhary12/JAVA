import java.util.Scanner;
class Test
{
	public static void main(String args[])
{
	Scanner sc = new  Scanner(System.in);
	System.out.println("Enter number");
	int n=sc.nextInt();
	int esum=0; 
	int osum=0;
	int i=1;
	if(n>0)
		System.out.println("This is not a Integer Number");
	
	while(i<=n)
	{
	if(i%2==0)
	  System.out.println("This is not a Prime Number");
	 else
	  System.out.println("This is  a Prime Number");
	  i++;
	  }
	  
	
	}
	}
	
	
	
	
	
	
	
	
