import java.util.Scanner;
class Test
{
	public static void main(String args[])
     	{
	   Test ob=new Test();
	   int a[]=new int[10];
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter size of array");
	   int n=sc.nextInt();  
	    System.out.println(" "+ob.input(a,n,sc)); 
	
	
	
	}
	public int input(int a[],int n,Scanner in)
	{
		
		//System.out.println("How many elements do you want to Enter");
		//int n = sc.nextInt();
		if(n==0)
			return 1;
		else{
			a[n-1]=in.nextInt();
	            }			
			return ;
			
	
	
	}
}
