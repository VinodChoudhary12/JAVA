//- x^2/2  + x^4/4  - x^6/6  = -105

class Series_8_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int n1 = sc.nextInt();
		
		int i,pow=1,x=2,sum=0;
		for(i=1;i<=n;i++)
		{	
			pow=1;
			for(int j=1;j<=x;j++)
			{
				pow*=n1;
				
			}
			if(i%2==0)
			{
				sum+=pow/x;
				System.out.print(" + "+x+"/"+x);
			}
			else
			{
				sum-=pow/x;
				
				System.out.print(" - "+x+"/"+x);
			}			
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}
