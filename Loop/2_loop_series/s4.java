import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		int i,fact=1,n1=1,sum=0,j;
		for(i=1;i<=n;i++)
		{
			 fact=1;
			for(j=1;j<=n1;j++)
			{
			  fact=fact*j;
			}
			  sum=sum+fact;
			System.out.print(n1+"!");
			  if(i<n)
			  {
			   System.out.print("+");
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
		int fact=1,sum=0,j,n1=1;
		  for(int i=1;i<=n;i++)
	    	{
		    	fact=1;
				
					for(j=1;j<=n1;j++)
					{
				      fact=fact*j;
					}
			if(i%2==0)
			{
				sum=sum-fact;
				System.out.print(" - "+n1+"!");
			}else
				{
				sum=sum+fact;
				
				if(i>1)
				System.out.print("  +  ");
				System.out.print(n1+"!");
				
				}
			      n1=n1+2;
			
			}
			System.out.print("  = "+sum);
	}
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		int fact=1,sum=0,j,n1=1;
		for(int i=1;i<=n;i++)
		{
				fact=1;
				for(j=1;j<=n1;j++)
				{
				 fact=fact*j;
				}if(i%2==0)
				{
					sum=sum+fact;
					System.out.print(" + "+n1+"!");
				}else
				{ 
                     sum=sum-fact;
					System.out.print(" - "+n1+"!");
				}
				 n1=n1+2;
		}
     		System.out.print(" = "+sum);
	}
}
