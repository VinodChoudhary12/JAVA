import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your array");
		n=sc.nextInt();
		System.out.println("\tthe element of Array is");
		
		for(i=0,j=1;i<n;i++,j++)
		{
			System.out.print("Element "+j+" : ");
			a[i]=sc.nextInt();
		}
			
		System.out.println("\tThe Array is");
		for(i=0;i<n;i++)
		{
			System.out.println("\ta["+i+"]="+a[i]);
		}
		for( i=0;i<n;i++)
		{
			for( j=i+1;j<n;j++)
			{	
				if(a[i]>a[j])
				{
					temp=a[i];
	          			a[i]=a[j];
	          			a[j]=temp;
				}
			}		
		}
		
			
	
	}
}
