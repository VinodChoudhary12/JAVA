import java.util.Scanner;
class vote extends Exception
{
	vote()
	{
		
	}
	vote(String msg)
	{
		super(msg); 
	}
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			int age= Integer.parseInt(args[0]);
			// if(args.length<=2)
			// {
				// System.out.println("only one person can Enter his age:");
				// System
				// .exit(0);
			// }
				
			
			if(age>=0&&age<=18)
			{
				throw new vote("You Are under age for Vote:");
				//Throw Object Ko throw krne ke liye use krte hau 
			}
			else if(age<=0)
			{
				throw new vote("Age is Not Negetive:");
			}
			else if(age >100)
			{
				throw new vote("I Think You Will Die");
			}
			
			else
			{
				System.out.println("\ttPress 1 For BJP");
				System.out.println("\tPress 2 For Congress");
				System.out.println("\tPress 3 For Not Vote Any");
				System.out.println("\tChhose Party");
				int ch = sc.nextInt();
				if(ch==1)
				{
					System.out.println("Your vote is Add in EVM Machine For BJP Vote");
					System.out.println("Thank You For Your Valuable Vote:");
				}
				else if(ch==2)
				{
					System.out.println("Your vote is Add in EVM Machine For BJP Vote");
					System.out.println("Thank You For Your Valuable Vote:");
				}
				else
					System.out.println("...........Thank You.................");	
			}
		}
		catch(NumberFormatException ref)
		{
			System.out.println("Please Enter Vailid Age");
			System.out.println("Age Is not Fractional");
		}
		catch(vote ref)
		{
			System.out.println(ref);
		}
	}
}