import java.util.Scanner;
class Test
{
	public static void main(String [] args)
	{
		int k=0,a;
		String b=" ";
		Scanner sc = new Scanner(System.in);
		System.out.println("How much data You want to enter");
		int n = sc.nextInt();
		String name = new String[n];
		int roll[] = new int[n];
		for(int i=0;i<n;i++)
		{
			name[i]=sc.nextInt();
			roll[i]=sc.nextInt();	
		}
		System.out.println("Enter Roll Number Do You want to Search");
		int num=sc.nextInt();
		System.out.println("Enter  Name Do You want to Search");
		int nam=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(name[i]==nam)
			{
				k=1;
				b=name[i];	
				
			}	
			
		}
		if(k==1)
		{
			System.out.println("The Name Is "+b);
		}
		else
				System.out.println("Number Is Not Exist:");
			k=0;
			
	
		for(int i=0;i<n;i++)
		{
			if(roll[i]==num)
			{
				k=1;
				a=i;
			}
			
		}
			
			if(k==1)
				System.out.println("The Roll Number Is "+roll[a]);
			else
				System.out.println("The Roll Number Is Not Exist:");
	}
}