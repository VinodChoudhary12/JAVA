//- 2/2!  + 4/4!  - 6/6!  = -115

class Series_3_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int i,x=2;
		float fact=1,sum=0;
		for(i=1;i<=n;i++)
		{	
			fact=1;
			for(int j=1;j<=x;j++)
			{
				fact*=j;
			}
			if(i%2==0)
			{
				sum+=x/fact;
				System.out.print(" + "+x+"/"+x+"!");
			}
			else
			{
				sum-=x/fact;
				
				System.out.print(" - "+x+"/"+x+"!");
			}			
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}
