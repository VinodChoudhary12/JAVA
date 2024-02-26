import java.lang.String;
import java.util.Scanner;
class Test
{
	public static void main(String[]args)
	{
		int i,j=0;
	 	
		Scanner sc=new Scanner(System.in);
	    	int a [][]=new int[5][5];
	    	int b [][]=new int[5][5];
	    	int c [][]=new int[5][5];
	    	System.out.println("Enter dimantion of first matrix");
	    	System.out.println("Enter the Row");
		int row1=sc.nextInt();
		
		System.out.println("Enter the colum");
		int col1=sc.nextInt();
		
		for(i=0;i<row1;i++)
		{
		  for(j=0;j<col1;j++)
		  {
		    a[i][j]=sc.nextInt();
		  }
		}
		
		System.out.println("Enter dimantion of second matrix");
		System.out.println("Enter the Row");
		int row2=sc.nextInt();
		
		System.out.println("Enter the colum");
		int col2=sc.nextInt();
		
		  
		
	       for(i=0;i<row2;i++)
	       {
		  for(j=0;j<col2;j++)
		  {
		    b[i][j]=sc.nextInt();
		  }
		}

		System.out.println("\t First matrix is");
		for(i=0;i<row1;i++)
		{
		  for(j=0;j<col1;j++)
		  {
		    System.out.print(a[i][j]+" ");
		  }
		    System.out.println();
		}
		 System.out.println("\t Second matrix is");
		
		  for(i=0;i<row2;i++)
		{
		  for(j=0;j<col2;j++)
		  {
		    System.out.print(b[i][j]+" ");
		  }
		    System.out.println();
		}  
		for(i=0;i<row1;i++)
		{
		  for( j=0;j<col1;j++)
		  {
		    c [i][j]=0;
		    for(int k=0;k<row1;k++)
		   {
		      c[i][j]+=a[i][k]*b[k][j];
		   }   
		     System.out.print(c[i][j]+" ");
		  }
		  System.out.println();
		} 
	}
}	     
		 
