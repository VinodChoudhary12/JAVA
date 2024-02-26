import java.util.Scanner;
class Test
{
	public static void main(String[]args)                                  
	{
		Scanner sc = new Scanner(System.in);
		int a[][]= new int[20][20];
		int min = 0;
		System.out.println("Enter size of First Metrix row");
		int n = sc.nextInt();
		
		System.out.println("Enter size of First Metrix Colom");
		int m = sc.nextInt(); 
			
		System.out.println("Enter Element of First Metrix : ");
		int temp=0;
		for(int i=0; i<n; i++)
		{
			for(int j = 0; j<m; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		 
		 for(int i=0; i<n; i++)
		{
			for(int j = 0; j<m; j++)
			{
			 for(int k=0; j<m;i++)
			 {
			                
			   if(a[i][j+1]>a[i][j])
			   {
			   	temp=a[i][j+1];
			   	a[i][j+1]=a[i][j];
			   	a[i][j]=temp;
			   }
			   System.out.print(a[i][j]+" ");
			   
			}
			 System.out.println(); 
		}
	}
}
		 
