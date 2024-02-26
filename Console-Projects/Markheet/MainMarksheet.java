import java.util.Scanner;
import.opration.MarksheetOperations;

public class MainMarksheet
{ 
	public static void main(String args[])
	{
		Main.input();
	}
	public static void choice(MarksheetPojo stu[],MarksheetOperations op,int i,int n,Scanner sc)
	{
		int ch=0;
		do
		{
		    System.out.println("_____________________________________________________________________________________________________ ");
			System.out.println("|\t\tYOUR CHOICE ARE :                                                                   |");                                                                               
			System.out.println("|\t\t---------------                                                                     |");
			System.out.println("|\tPRESS.1 FOR ALL MARKSHEET PRINT   : PRESS.2 FOR PERCENTAGE SEARCH MARKSHEET :                |");
			System.out.println("|----------------------------------------------------------------------------------------------------|");
			System.out.println("|\tPRESS.3 FOR ROLL NUMBER MARKSHEET : PRESS.4 FOR SEARCH BY NAME MARKSHEET    :                |");
			System.out.println("|----------------------------------------------------------------------------------------------------|");
			System.out.println("|\t\t\tPRESS.5 Exit                                                                             |");
			System.out.println("|                                                                                                    |");
			System.out.println("|\tENTER YOUR CHOICE  :                                                                         |");
		    System.out.println("|____________________________________________________________________________________________________|");
			ch=sc.nextInt();
			sc.nextLine();
			switch(ch)
			{
				case 1 :for(i=0;i<n;i++)
						{
								op.display(stu,i,n);
						}
						break;
				case 2 :System.out.println("Please Enter Search Perceantage");
						double m=sc.nextInt();
						for(i=0;i<n;i++)
						{
							if(m<=stu[i].getPercentage())
							{
								op.display(stu,i,n);
							}
						} 
						break;
				case 3 :System.out.println("Enter seaching Roll Number");
						int num =sc.nextInt();
						for(i=0;i<n;i++)
						{
							if(stu[i].getRollno()==num)
							{
								op.display(stu,i,n);
							}
						}
						break;
				case 4 :System.out.println("Please Enter Searching Name");
						String naam=sc.nextLine();
						for(i=0;i<n;i++)
						{
							if(stu[i].getName().equalsIgnoreCase(naam))
							{
								op.display(stu,i,n);
							}
						}
						break;
			}
		}
		while(ch!=5);
	}	
	public static void roll(MarksheetPojo stu[],int i,Scanner sc)
	{
		boolean z;
		do
		{
			System.out.println("Enter the roll number");
			int roll=sc.nextInt();
			stu[i].setRollno(roll);
			sc.nextLine();
			z = false; 	
			for(int j=0;i>0&&j<i; j++)
			if(stu[j].getRollno()==roll)
			{
				System.out.println("roll number already exist please valid roll number\n");
				z=true;
			}
		}
		while(z);
	}	
	public static void input()
	{
    	Scanner sc = new Scanner(System.in);
		MarksheetPojo ob = new MarksheetPojo();
		MarksheetOperations op = new MarksheetOperations();
		int i=0;
		System.out.println("how many sutudent result");
		int n = sc.nextInt();
		MarksheetPojo stu[] = new MarksheetPojo[n];
		for(i=0;i<n;i++)
		{	
	        stu[i]=new MarksheetPojo();
			Main.roll(stu,i,sc);
			System.out.println("Enter your name :");
			stu[i].setName(sc.nextLine());
			System.out.println("Enter your Father's name :");
			stu[i].setFather(sc.nextLine());
			System.out.println("Enter your Mother's name :");
			stu[i].setMother(sc.nextLine());
			System.out.println("Enter your college :");
			stu[i].setCollege(sc.nextLine());
			System.out.println("Enter your branch:");
			stu[i].setBranch(sc.nextLine());
			System.out.println("Enter your course :");
			stu[i].setCourse(sc.nextLine());
			System.out.println("Enter your year :");
			stu[i].setYear(sc.nextInt());
			System.out.println("Enter your Semester :");
			stu[i].setSemester(sc.nextInt());	
		    Main.takeMark(stu,i,sc);
		}
		 Main.choice(stu,op,i,n,sc);
	}	
	public static void takeMark(MarksheetPojo stu[],int i,Scanner sc)
    {	
            int phy=stu[i].getPhy(),chemistry=stu[i].getChemistry(),maths=stu[i].getMaths(),hindi=stu[i].getHindi(),english=stu[i].getEnglish();			
			do
			{
				System.out.println("Enter physics number:   ");
				stu[i].setPhy(sc.nextInt());	
				if(phy<0||phy>100)
				{
					System.out.println("Invalid mark Of physics..!!\nPleas re enter mark..");
				}
			}	
			while(phy<0||phy>100);
			do
			{
				System.out.println("Enter chemistry number:   ");
				stu[i].setChemistry(sc.nextInt());
				if(chemistry<0||chemistry>100)
				{
					System.out.println("Invalid mark Of chemistry..!!\nPleas re enter mark..");
				}
			}
			while(chemistry<0||chemistry>100);
			do
			{
				System.out.println("Enter math number:   ");
				stu[i].setMaths(sc.nextInt());
				if(maths<0||maths>100)
				{
					System.out.println("Invalid mark Of math..!!\nPleas re enter mark..");
				}	
			}
			while(maths<0||maths>100);
			do
			{
				System.out.println("Enter hindi number:   ");
				stu[i].setHindi(sc.nextInt());
				if(hindi<0||hindi>100)
				{
					System.out.println("Invalid mark Of Hindi..!!\nPleas re enter mark..");
				}
			}
			while (hindi<0||hindi>100);

			do
			{
				System.out.println("Enter english number:   ");
				stu[i].setEnglish(sc.nextInt());
				if(english<0||english>100)
				{
					System.out.println("Invalid mark Of English..!!\nPleas re enter mark..");
				}
			}
			while(english<0||english>100);	
	}
  }