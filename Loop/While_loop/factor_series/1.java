import java.util.Scanner;
class Test
{
	public static void main(String args[])
{
	Scanner sc = new  Scanner(System.in);
	System.out.println("Enter The Number");
	int N=sc.nextInt();
	int sum=0, n,b,rev=0;
	//int c=n;
	int i=1;
	/*while(i<=n)
{
	n=i;
	i++;
	{
	while(n>0)
	{ 
	rem=n%10;
	n=n/10;
	rev=rev*10+rem;
	i++;
	System.out.println("The Reverse is "+rev);
	i++;
	}
	if(rev==i)
	{
		System.out.println(i+" ");
	}
	rev=0;	
}
}
}
}*/

	while(i<=N)
	
		{
			n = i;
			i++;
			while (n > 0)
			{
				b = n % 10;
				rev = rev * 10 + b;
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





	
