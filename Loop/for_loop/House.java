import java.util.Scanner;
// class Test
// {
	// public static void main(String args[])
	// {
		//Scanner sc=new Scanner (System.in);
		// int i=6,j=6;
		
		// for(i=6;i<=1;i--)
		// {
		   // for(j=12;j<=1;j--)
		   // {
		   	// if(j>=6+i)
		   
		   	// System.out.print(" *");
		   	// else
		   	// System.out.print(" ");
		   	
		   // }
		   	// System.out.println();
		// }
		   		
	// }
// }

class Main
{
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
		   for(int j=1;j<=5;j++)
		   {
		   	if(j>=6-i)
		   {
		   	System.out.print("  * ");
		   }
		   	else
		   	{System.out.print("  ");}
		   	
		   }
		   	System.out.println();
		}
		for(int i =1;i<=9;i++)
		{
		    if(i==1)
		    {
		        System.out.print(" ");
		    }
		    System.out.print(" *");
		}
			System.out.println();
		
		for(int i=1;i<=5;i++)
		{
		   for(int j=1;j<=5;j++)
		   {
		   	if(j<=6+i)
		   
		   	System.out.print("  * ");
		   	else
		   	System.out.print("  ");
		   	
		   }
		   	System.out.println();
		}
		for(int i =1;i<=9;i++)
		{
		    if(i==1)
		    {
		        System.out.print(" ");
		    }
		    System.out.print(" *");
		}
		System.out.println();
		System.out.println("House For Rent❤️");
		
		
	}
}

