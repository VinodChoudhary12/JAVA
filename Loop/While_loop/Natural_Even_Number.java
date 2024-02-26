import java.util.Scanner;
class Test
{
	public static void main(String args[])
{
	Scanner sc = new  Scanner(System.in);
	System.out.println("Enter The line");
	int n=sc.nextInt();
	int i=1;
	System.out.println("The first"+ n +"Natural Number is:");
	while(i<=n)
{	
	 int j=2*i;
	System.out.println( j+" ");
	i++;
	
	
}
}
}


