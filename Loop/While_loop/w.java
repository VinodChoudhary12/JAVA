import java.util.Scanner;
class Test
{
	public static void main(String args[])
{
	Scanner sc = new  Scanner(System.in);
	System.out.println("Enter The Number");
	int n=sc.nextInt();
	int i=1;
	int j=1;
	int i1=1;
	int j1=1;
	while(i<=n)
{	
	 j=i*i;
	 i++;	
	 System.out.print(" "+j);	
}
	
	
	while(i1<=n)
{	
	  j1=i1*i1*i1;
	  i1++;	
	  System.out.print( " "+j1);	
}
	

}
}


