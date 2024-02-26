import java.util.Scanner;
class Test
{
	public static void main(String agrs[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		int a=sc.nextInt();
		int j,k,n1=1;
		float pow=1,sum=0,fact=1;
		for(int i=1;i<=n;i++)
		{
			 pow=1;
			 fact=1;
			for(j=1;j<=n1;j++)
			{
				pow*=a;
				fact=fact*(j+1);
			}
		    sum=sum+fact/pow;
			System.out.print((n1+1)+"!/"+a+"^"+n1);
			if(i<n)
				System.out.print(" + ");
			   n1=n1+2;
		}
		   System.out.print(" = "+sum);
	}
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		int a=sc.nextInt();
		int j,k,n1=1;
		float pow=1,sum=0,fact=1;
		for(int i=1;i<=n;i++)
		{
			pow=1;
			fact=1;
			for(j=1;j<=n1;j++)
			{
				pow*=a;
				fact=fact*(j+1);
			}
			if(i%2==0)
				{
				  sum=sum-fact/pow;
				  System.out.print(" - "+(n1+1)+"!/"+a+"^"+n1);
				}else{
					sum=sum+fact/pow;
					if(i>1)
						System.out.print(" + ");
						System.out.print((n1+1)+"!/"+a+"^"+n1);
				}
				    n1=n1+2;
		}
		        System.out.print(" = "+sum);
	}
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		int a=sc.nextInt();
		int j,n1=1,k;
		float pow=1,sum=0,fact=1;
		for(int i=1;i<=n;i++)
		{
			pow=1;
			fact=1;
			for(j=1;j<=n1;j++)
			{
				pow*=a;
				fact=fact*(j+1);
			}	
			 if(i%2==0)
				{
				  sum=sum+fact/pow;
				  System.out.print(" + "+(n1+1)+"!/"+a+"^"+n1);
				}else{
					sum=sum-fact/pow;
						System.out.print(" - ");
						System.out.print((n1+1)+"!/"+a+"^"+n1);
				}
				    n1=n1+2;
		}
		        System.out.print(" = "+sum);
	}
}
