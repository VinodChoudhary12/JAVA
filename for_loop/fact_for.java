import java.util.Scanner;
class Test
{
	public static void main(String args[])
{
	Scanner sc = new  Scanner(System.in);
	System.out.println("Enter The Number");
	int n=sc.nextInt();
	int i=1,fact=1;
	for(i=1,fact=1;i<=n;i++)
{
	fact=fact*i;
}
	System.out.println(fact);

 	
 }		
}


