import java.util.Scanner;
class Bill
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the units of last months");
	float fm = nextFloat();
	System.out.println("Enter the units of Current months");
	float cm = nextFloat();
	float unit = (float)(cm-lm);
	float amount = 0.0f;
	if (unit<0 )
	{
		System.out.println("Invaild units");
	}
	else
	{
		if(unit<=100)
		{
		 amount = unit * 5;
		System.out.println("This is the amount"+amount);
		}else
		{
			if(unit>100 && unit <=200)
			{
			 amount =unit*7.5f;
			System.out.println("This is the amount"+amount);
			}else
			{
				if(unit>200 && unit<=300)
				{
				amount = unit*12.5f;
				System.out.println("This is the amount"+amount);
				}else
				{
				 amount =unit*16f;
				System.out.println("This is the amount"+amount);
				}
			}
		}
	}
	}
}
