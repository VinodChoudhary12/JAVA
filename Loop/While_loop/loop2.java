import java.util.Scanner;
class Test
{
	public static void main(String args[])
{
	Scanner sc = new  Scanner(System.in);
	System.out.println("Enter Any Number");
	int num=sc.nextInt();
	int i=0;
	int Sum=1;
	while(i<num)
{
	Sum=Sum+i;
	i++;
	System.out.print(" "+Sum);
}
}
}
 
	
