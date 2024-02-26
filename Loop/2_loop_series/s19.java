import java.util.Scanner;
class Test
{
	public static void main(String agrs[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		int n1=1,n2=1,j;
		float fact=1,sum=0;
		for(int i=1;i<=n;i++)
		{
			fact=1;
			for(j=1;j<=n2;j++)
			{
				fact=fact*j;
			}
			 sum=sum+(fact/n1);
			 System.out.print(n2+"!/"+n1);
			 if(i<n)
			 {
				 System.out.print(" + ");
			 }
			    n1=n1+1;
			   n2=n2+2;
		}
		  System.out.print(" = "+sum);
	}
}
class Test
{
	public static void main(String agrs[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		int n1=1,n2=1,j;
		float fact=1,sum=0;
		for(int i=1;i<=n;i++)
		    {
				fact=1;
			  for(j=1;j<=n2;j++)
			  {
				fact=fact*j;
	    	  }if(i%2==0)
				{ 
			      sum=sum-fact/n1;
				  System.out.print(" - "+n2+"!/"+n1);
				}else
				{
					sum=sum+fact/n1;
					if(i>1)
					System.out.print(" + ");
				    System.out.print(n1+"!/"+n1);
				}
			       n1=n1+1;
				   n2=n2+2;
			}
				System.out.print(" = "+sum);
	}
}
class Test
{
	public static void main(String agrs[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		int n2=1,n1=1,j;
		float fact=1,sum=0;
		for( int i=1;i<=n;i++)
		{
			fact=1;
			for(j=1;j<=n2;j++)
			{
				fact=fact*j;
			}if(i%2==0)
			{
				sum=sum+fact/n1;
				System.out.print(" + "+n2+"!/"+n1);
			}else
			{
				sum=sum-fact/n1;
				System.out.print(" - "+n2+"!/"+n1);
			}
			  n1=n1+1;
			  n2=n2+2;
		}
		   System.out.print(" = "+sum);
	}
}
