import java.util.Scanner;
class Test
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		int a=0;
		int i=1;
		while(i<=n)
		{
			if(n%i==0)
				a=a+1;
		  	i++;
		}
		if(a==2)
		  System.out.println("The Number is Prime");
		  else
		  	System.out.println("The Number is not prime");
		}
		}
		
		

//2nd Type


/*import java.util.Scanner;
class Test
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		int i=2;
		while(i<=n)
		{
			if(n%i==0)
		  	break;
		  	i++;
		}
		if(i==n)
		  System.out.println("The Number is Prime");
		  else
		  	System.out.println("The Number is not prime");
		}
		}*/

/*3rd Type
import java.util.Scanner;
class Test
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		int i=2,flag=1;
		if (n==1||n==0||n<=0){
			System.out.println("The Number Invaild");
		
		while(i<n)
		{
			if(n%i==0){
			flag=0;
		  	break;}
		  	i++;
		}
		}
		else if(flag==1)
		  System.out.println("The Number is Prime");
		  else
		  	System.out.println("The Number is not prime");
		}
		}
/*
		
		
		
