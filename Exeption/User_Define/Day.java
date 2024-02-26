class Day extends Exception
{
	Day()
	{
		
	}
	Day(String msg)
	{
		super(msg);
	}
}
class Test
{
	public static void main(String args[])
	{
		try
		{
			int day = Integer.parseInt(args[0]);
			if(day<0)
				throw new Day("Days Are Not Negetive:");
			
			else if (day>7)
				throw new Day("Please Enter Number Between 1 To 7");
			
			//if(day<=1&&day<=7)
			
			else{
			switch(day)
			  {
				case 1:
						System.out.println("Monday");
				case 2:
						System.out.println("Tuesday");
				case 3:
						System.out.println("Wednesday");
				case 4:
						System.out.println("Thursday");
				case 5:
						System.out.println("Friday");
				case 6:
						System.out.println("Satuarday");
				case 7:
						System.out.println("Sunday");
			  }
			}
		}
		catch(Day ref)
		{
			System.out.println(ref);
		}
	}
}