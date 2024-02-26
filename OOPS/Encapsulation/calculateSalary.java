import java.util.Scanner;
class Company
{
	String name;
	int salary;
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public String Name()
	{
		return name;
	}
	public int Salary()
	{
		return salary;
	}
	public void Deatils()
	{
		System.out.println("Salary of "+this.name+"Is "+this.salary);
	}
		
}
class Employee extends Company
{
	private int pfNumber;
	private int esicNumber;
	public void SetEmpl(String name,int salary,int pfNumber,int esicNumber)
	{
		setName(name);
		setSalary(salary);
		this.pfNumber=pfNumber;
		this.esicNumber=esicNumber;
	}
	public void Detl()
	{
		System.out.println("PFNumber of "+this.pfNumber+" And ESIC Number "+this.esicNumber);
	}
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Employee ob = new Employee();
		System.out.println("Enter The First Employee Name");
		String one = sc.nextLine(); 
		System.out.println("Enter The First Employee Salary");
		int ss = sc.nextInt(); 
		System.out.println("Enter The First Employee PFNumber");
		int PF = sc.nextInt(); 
		System.out.println("Enter The First ESIC Number");
		int esic = sc.nextInt(); 
		ob.SetEmpl(one,ss,PF,esic);
		ob.Deatils();
		ob.Detl();
	}
}