import java.lang.String;
import java.util.Scanner;
class Test
{
	public static void main(String[]args)
	{
	   Scanner sc=new Scanner (System.in);
	       int  i=0;
	       boolean b=false;
	       int a[]=new int [20];
	       System.out.println("How Many Elements Do You Want ");
	       int n=sc.nextInt();
	       for(i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(i=0;i<n;i++)
		System.out.println("a["+i+"]="+a[i]);
		System.out.println("Enter The item You Want to search");
		int item =sc.nextInt();
		for( i=0;i<n;i++)
		{
		  if(a[i]==item)
		  b=true;
		 }
		  if( b==true){
		System.out.println("Found");
		System.out.println(item+" is in a["+i+"]");}
		
		else
		 System.out.println("Item is not found");
	}
}
			  
	       
