import java.util.Scanner;
class Test
{
	public static void main(String[]args)                                  
	{
		int matrix=1;
		Scanner sc = new Scanner(System.in);
		int a[][]= new int[20][20];
		int min = 0;
		System.out.println("Enter size of First Metrix row");
		int n = sc.nextInt();
		
		System.out.println("Enter size of First Metrix Colom");
		int m = sc.nextInt(); 
			
		System.out.println("Enter Element of First Metrix : ");
		for(int i=0; i<n; i++)
		{
			for(int j = 0; j<m; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		  
		 for(int i=0; i<n;i+2 ) 
		 {
		   
		     for(int l=2;l>=0;l--)
		     {
		       int j=0;
		       int k=2;
		       a[j][i]=a[j][i]
		       System.out.print(a[j][i]+" ");
		    }
		    
		    System.out.println();
		  }
		  
		   //System.out.print("The sum of matrix is "+matrix);
		   
	}
}
		  
		 
