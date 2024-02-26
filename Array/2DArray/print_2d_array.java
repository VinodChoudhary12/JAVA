import java.lang.String;
import java.util.Scanner;
class Test
{
	public static void main(String[]args)
	{
	 	
		Scanner sc=new Scanner(System.in);
	    	int a [][]=new int[3][3];
	    	System.out.println("Enter the Row");
		int row=sc.nextInt();
		System.out.println("Enter the colum");
		int col=sc.nextInt();
		System.out.println("\tthe element of Array is");
	
	for(int i=0;i<row;i++)
	{
	  for( int j=0;j<col;j++)
	
	    a[i][j]=sc.nextInt();
	  }

		System.out.println("Matrix elements are");
	    
	  for(int i=0;i<row;i++)  
	  {
	   for( int j=0;j<col;j++) 
	   {
	     System.out.print("\t"+a[i][j]);
	     
	   }
	   
	    System.out.println();
	 }
	 
	   System.out.println("The transpose of this matrix is");
	  
	 
	   for(int i=0;i<col;i++)  
	  {
	   for( int j=0;j<row;j++) 
	   {
	     System.out.print("\t"+a[j][i]);
	     
	   }
	   
	    System.out.println();
	 }
	 
}
}
	    
