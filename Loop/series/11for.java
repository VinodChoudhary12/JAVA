
// 1!/1  - 3!/3  + 5!/5  = 23

class Series_5_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int i,x=1;
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
				sum-=fact/x;
				System.out.print(" - "+x+"!/"+x);
			}
			else
			{
				sum+=fact/x;
				if(i>1)
				System.out.print(" + ");
				System.out.print(x+"!/"+x);
			}
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}

