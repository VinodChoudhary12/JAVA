import java.util.Scanner;
class Test
{
	public static void main(String agrs[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		int a=sc.nextInt();
		int j,n1=2,n2=1;
		float pow=1,sum=0;
		for(int i=1;i<=n;i++)
		{
			pow=1;
			for(j=1;j<=n1;j++)
			{
				pow*=a;
			}
		    sum=sum+pow/n2;
			System.out.print(a+"^"+n1+"/"+n2);
			if(i<n)
				System.out.print(" + ");
			 n1=n1+2;
			 n2=n2+2;
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
		int j,n1=2,n2=1;
		float pow=1,sum=0;
		for(int i=1;i<=n;i++)
		{
			pow=1;
			for(j=1;j<=n1;j++)
			{
				pow*=a;
			}if(i%2==0)
				{
				  sum=sum-pow/n2;
				  System.out.print(" - "+a+"^"+n1+"/"+n2);
				}else{
					sum=sum+pow/n2;
					if(i>1)
						System.out.print(" + ");
						System.out.print(a+"^"+n1+"/"+n2);
				}
				    n1=n1+2;
					n2=n2+2;
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
		int j,n1=2,n2=1;
		float pow=1,sum=0;
		for(int i=1;i<=n;i++)
		{
			pow=1;
			for(j=1;j<=n1;j++)
			{
				pow*=a;
			}if(i%2==0)
				{
				  sum=sum+pow/n2;
				  System.out.print(" + "+a+"^"+n1+"/"+n2);
				}else{
					sum=sum-pow/n2;
						System.out.print(" - ");
						System.out.print(a+"^"+n1+"/"+n2);
				}
				    n1=n1+2;
					n2=n2+2;
		}
		        System.out.print(" = "+sum);
	}
}
