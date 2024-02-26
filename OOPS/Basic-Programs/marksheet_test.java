import java.util.Scanner;
class subject
{
	private int hin,eng,math,chem,phy;
	private String name,Fn,Mn,bran,co,yr,sem;
	private int ro,total;
	double per;
	public void setDetails()
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter name");
			name=sc.nextLine();
			System.out.println("enter roll");
			ro=sc.nextInt();
			sc.nextLine();
			System.out.println("enter Fname");
			Fn=sc.nextLine();
			System.out.println("enter Mname");
			Mn=sc.nextLine();
			System.out.println("enter course");
			co=sc.nextLine();
			System.out.println("enter branch");
			bran=sc.nextLine();
			System.out.println("enter year");
			String yr=sc.nextLine();
			sem=sc.nextLine();
			this.name = name;
			this.ro=ro;
			this.Fn=Fn;
			this.Mn=Mn;
			this.co=co;
			this.bran=bran;
			this.yr=yr;
			this.sem=sem;			
	}
	
	public void setMarks()
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter physics marks");
			phy=sc.nextInt();
			System.out.println("enter chemistry marks");
			chem=sc.nextInt();
			System.out.println("enter maths marks");
			math=sc.nextInt();
			System.out.println("enter english marks");
			eng=sc.nextInt();
			System.out.println("enter hindi marks");
			hin=sc.nextInt();
			this.phy=phy;
			this.chem=chem;
			this.math=math;
			this.eng=eng;
			this.hin=hin;
			this.total=total;
			this.per=per;
	}
	public void totalMarks()
	{
		 this.total=this.phy+this.eng+this.chem+this.math+this.hin;
	}
	public void percantage()
	{
		this.per=(this.total)/5;
	}
	public void output()
	{
		System.out.println("\n\n\t\t\t\t\t  RGPV-BHOPAL\n\n\n");
		System.out.println("\tStudent's Personal Info -->\n");
		System.out.println("\t Student Name  :"    +this.name +    "\t\t\t\t\t\t Course :"+this.co);
		System.out.println("\t Roll Number   :"    +this.ro   +    "\t\t\t\t\t\t Branch :"+this.bran);
		System.out.println("\t Father Name   :Mr." +this,Fn+    "\t\t\t\t\t\t Sem    :"+this.sem);
		System.out.println("\t Mother Name   :Mrs."+this.Mn+    "\t\t\t\t\t\t Year   :"+this.yr);
				   
		System.out.println("\t SubCode     SubName     MaxMarks   MinMarks    ObtMarks\n");
		System.out.println("\t CSE-501     Physics       100         33         "+this.phy);
		System.out.println("\t CSE-502     Chemistry     100         33         "+this.chem);
		System.out.println("\t CSE-503     Maths         100         33         "+this.math);
		System.out.println("\t CSE-504     Hindi         100         33         "+this.hin);
		System.out.println("\t CSE-505     English       100         33         "+this.eng);
					
				   
				System.out.println("\t Precentage  :"+this.percantage());
				System.out.println("\t Grand Total :"+this.totalMarks());
	
	}
	public void condition()
	{
		boolean x;
		if(this.phy<0||this.chem<0||this.math<0||this.eng<0||this.hin<0||this.phy>100||this.chem>100||this.math>100||this.eng>100||this.hin>100)
				{
					System.out.println("Enter valid no.  ");
				}
				else if(this.phy<33&&this.chem<33&&this.math<33&&this.eng<33&&this.hin<33)
				{
					System.out.println("Fail in all subject");
				}
				else if(this.phy<33&&this.chem<33&&this.math<33&&this.eng<33||this.phy<33&&this.chem<33&&this.math<33&&this.hin<33||this.phy<33&&this.chem<33&&this.hin<33&&this.eng<33||this.phy<33&&this.eng<33&&this.hin<33&&this.math<33||this.math<33&&this.eng<33&&this.hin<33&&this.chem<33||this.chem<33&&this.math<33&&this.eng<33&&this.hin<33)
				{
					System.out.println("Fail in 4 subject");
				}
				else if(this.phy<33||this.chem<33||this.math<33&&this.phy<33||this.chem<33||this.eng<33&&this.phy<33||this.che<33||this.hin<33&&this.chem||this.math||this.eng&&this.chem||this.math||this.hin&&this.math||this.eng||this.hin&&this.math||this.hin||this.phy&&this.math||this.eng||this.phy&&this.eng||this.hin||this.phy)
					 x=true;
									
				if(x==true)
				{	if(per>=60)
						System.out.println("\t\t\t\tPassed by First Division");
					else if(per>=45)
						System.out.println("\t\t\t\tPassed by Second Division");
					else if(per>=33)
						System.out.println("\t\t\t\tPassed by Third Division");
				}
				else
				{	System.out.println("......Failed......");}	
	}
}
	

class Test
{
	public static void main(String []args)
	{
		subject ob = new subject();
		ob.setDetails();
		ob.setMarks();
		ob.output();
		ob.condition();
	}
}