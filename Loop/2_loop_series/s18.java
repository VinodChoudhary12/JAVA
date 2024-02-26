import java.util.Scanner;
class Test
{
	public static void main(String agrs[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		int n1=1,n2=2,j;
		float fact=1,sum=0;
		for(int i=1;i<=n;i++)
		{
			fact=1;
			for(j=1;j<=n2;j++)
			{
				fact=fact*j;
			}
			 sum=sum+n1/fact;
			 System.out.print(n1+"/"+n2+"!");
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
		int n1=1,n2=2,j;
		float fact=1,sum=0;
		for(int i=1;i<=n;i++)
		    {
				fact=1;
			  for(j=1;j<=n2;j++)
			  {
				fact=fact*j;
	    	  }if(i%2==0)
				{ 
			      sum=sum-n1/fact;
				  System.out.print(" - "+n1+"/"+n2+"!");
				}else
				{
					sum=sum+n1/fact;
					if(i>1)
					System.out.print(" + ");
				    System.out.print(n1+"/"+n2+"!");
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
		int n2=2,n1=1,j;
		float fact=1,sum=0;
		for( int i=1;i<=n;i++)
		{
			fact=1;
			for(j=1;j<=n2;j++)
			{
				fact=fact*j;
			}if(i%2==0)
			{
				sum=sum+n1/fact;
				System.out.print(" + "+n2+"!/"+n1);
			}else
			{
				sum=sum-n1/fact;
				System.out.print(" - "+n2+"!/"+n1);
			}
			  n1=n1+1;
			  n2=n2+2;
		}
		   System.out.print(" = "+sum);
	}
}
