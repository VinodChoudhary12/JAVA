import java.util.Scanner;
class Test
{
	public static void main(String args[])
{
	Scanner sc = new  Scanner(System.in);
	System.out.println("Enter Any Number");
	int num=sc.nextInt();
	int i=1;
	while(i<=10)
{
	System.out.println("The table is "+num+"*"+i+"="+(num*i));
	i++;	
}
}
}

