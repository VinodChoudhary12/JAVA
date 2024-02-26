import java.util.Scanner;
class Test
{
	Scanner sc =new Scanner(System.in);
	
	public static void main(String args[])
	{
		Test ob = new Test();	
		ob.print();
	}
	public void Pattern1(int n)
	{
		for(int i=1; i<=n ;i++)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print("* ");
			}
				
				System.out.println();
		}
	}
	public void Pattern2(int n)
	{
		System.out.println("Your Result is:");
		for(int i =1; i<=n ;i++)
		{	
			for(int j=1; j<=n-i+1;j++)
			{
				System.out.print(j+" ");
			}	
				System.out.println();
		}	
	} 
	public void Pattern3(int n)
	{
		System.out.println("Your Result is:");
		for(int i =1; i<=n ;i++)
		{	
			for(int j=1; j<=n-i+1;j++)
			{
				System.out.print("* ");
			}	
				System.out.println();
		}
	}	
	public void Pattern4(int n)
	{
		for(int i =1; i<=n ;i++)
		{	 
			for( int j=1; j<=n;j++)
			{       
				if(j>=i)
				System.out.print((n+1-j)+" ");
				else
				System.out.print("  ");
			}	
				System.out.println();
		}		
	
	 }
	 public void Pattern5(int n )
	{
		for(int i =1; i<=n ;i++)
		{ 
			for( int j=1; j<=n;j++)
			{      
				if(j>=i)
				System.out.print("* ");
				else
				System.out.print("  ");
			}	
				System.out.println();
		}		
	 }
	 public void Pattern6(int n)
	 {
		for(int i =1; i<=n ;i++)
		{ 
			for( int j=1; j<=n;j++)
			{       
				if(j>=i)
				System.out.print((j)+" ");	
				else
				System.out.print("  ");
			}	
				System.out.println();
		}
	 }
	 public void Pattern7(int n)
	 {
		for(int i =1; i<=n ;i++)
		{	 
			for( int j=1; j<=n;j++)
			{     
				if(j>=i)
				System.out.print((i)+" ");
				else
				System.out.print("  ");
			}	
				System.out.println();
		}	
	 }
	 public void Pattern8(int n)
	 {
		for(int i =1; i<=n ;i++)
		{
			for( int j=1; j<=i*2;j++)
			{
				System.out.print("*");
					
			}	
				System.out.println();
		}
	}	
		
	 public void Pattern9(int n)
	 {
		for(int i =1; i<=n ;i++)
		{ 
			for( int j=1; j<=i*2-1;j++)
			{
				System.out.print("*");
					
			}	
				System.out.println();
		}	
	 }
	
	public void Pattern10(int n )
	{
		int sum=1;
		for(int i =1; i<=n ;i++)
		{          
			for( int j=1; j<=sum;j++)
			{	
				System.out.print("*");	
			}
				sum=sum+i;
				System.out.println();
		}	
	}
	public void print()
	{
	  	Scanner sc =new Scanner(System.in);
	  	boolean x=true;
		System.out.println("Your Result is:");
		System.out.println("Press 1 For \n* \n* *\n* * *\n* * * *\n* * * * *");
		System.out.println("Press 2 For \n1 2 3 4 5\n 1 2 3 4 \n 1 2 3\n 1 2\n 1");
		System.out.println("Press 3 For \n* * * * *\n * * * * \n * * *\n * *\n *"); 
		System.out.println("Press 4 for\n5 4 3 2 1\n 4 3 2 1\n  3 2 1\n   2 1\n    1");
		System.out.println("Press 5 for\n* * * * *\n  * * * *\n   * * *\n    * *\n     *");
		System.out.println("Press 6 for\n1 2 3 4 5\n 2 3 4 5\n  3 4 5\n   4 5\n    5 ");
		System.out.println("Press 7 for\n1 1 1 1 1\n 2 2 2 2\n  3 3 3\n   4 4\n    5 ");
		System.out.println("Press 8 for\n**\n****\n******\n********\n********** ");
		System.out.println("Press 9 for\n*\n***\n*****\n*******\n********* ");
		System.out.println("Press 10 for\n*\n**\n****\n*******\n*********** ");
		System.out.println("Press 11 for EXIT");	
	do
	{
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		System.out.println("How many Lines You want to Enter");
		int n = sc.nextInt();	
		System.out.println("Your Result is:");
		switch(choice)
		{
			case 1:
				this.Pattern1(n);
				break;
			case 2:
				this.Pattern2(n);
				break;
			case 3:
				this.Pattern3(n);
				break;
			case 4:
				this.Pattern4(n);
				break;
			case 5:
				this.Pattern5(n);
				break;
			case 6:
				this.Pattern6(n);
				break;
			case 7:
				this.Pattern7(n);
				break;
			case 8:
				this.Pattern8(n);
				break;
			case 9:
				this.Pattern9(n);
				break;
			case 10:
				this.Pattern10(n);
				break;
			case 11:
				x=false;
				break;
			default:
				System.out.println("Press Again");
				break;
		}
	}while(x);
		
		
	}
}
