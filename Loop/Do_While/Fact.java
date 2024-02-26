import java.util.Scanner;;
class Test
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=sc.nextInt();
		int i=1,fact=1;
	do
	{
		fact=fact*i;
		i++;
	}
	while(i<=n);
		System.out.println(fact);
	}
	}
	
