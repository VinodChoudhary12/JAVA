import java.util.Scanner;
class Company
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Age :");
		int age = sc.nextInt();
		System.out.print("Enter the Gender M/F :");
		char gen = sc.next().charAt(0);
		System.out.print("Enter the Marrige Status U/M :");
		char status = sc.next().charAt(0);
		if(status == 'M' || status == 'm')
		{			
			System.out.println("Driver should be Insured.");
		}
		else if(status == 'U' && gen == 'M' && age > 30 || status == 'u' && gen == 'm' && age > 30)
		{			
			System.out.println("Driver should be Insured.");
		}
		else if(status == 'U' && gen == 'F' && age > 25 || status == 'u' && gen == 'f' && age > 25)
		{			
			System.out.println("Driver should be Insured.");
		}
		else
		{			
			System.out.println("Driver should not be Insured.");
		}
	}
}
