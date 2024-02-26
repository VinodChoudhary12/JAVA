import java.util.Scanner;
class Day
{
         public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Days");
	int day=sc.nextInt();
	int Year=day/365;
	 day=day%365; 
	 System.out.println("Year Are " + Year);
	 System.out.println("Days Are :" + day);
	 day=day/12;
	 System.out.println("Month Are :" + day);
	 day=day/7;
	 System.out.println("week Are :" + day);
	 
	 
	         
}
}

