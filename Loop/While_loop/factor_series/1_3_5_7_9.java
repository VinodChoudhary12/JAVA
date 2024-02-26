//1 3 5 7 9 11
import java.util.Scanner;
class Test
{
	public static void main(String args[])
{	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number of Lines");
	int l= sc.nextInt();
	int i=1,j=1;
	while(j<=l)
{	
	System.out.print(i+" ");
	i=i+2;
	j++;		
}
}
}
 
