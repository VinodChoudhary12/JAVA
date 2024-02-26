import java.util.Scanner;
class Test
{
	public static void main(String args[])
{
	Scanner sc = new  Scanner(System.in);
	System.out.println("Enter The line");
	int n=sc.nextInt();
	int i=1;
	int fact=1;
	int sum=0;
	while(i<=n)
       {
	fact=fact*i;
	System.out.print("!"+i);
	sum=sum+fact;
	i++;
	if(i<=n)
	System.out.print("+");
	}	
	System.out.print("="+fact);
	
}	
}

	
	
	
 
