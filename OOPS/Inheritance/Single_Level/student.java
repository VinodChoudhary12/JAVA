import java.util.Scanner;
class Person
{
	String name;
	String gender;
	String hairColur;
	int hieght;
	int wheight;
	public void setName(String Name)
	{
		this.name=name;
	}
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	public void sethaircolur(String hairColur)
	{
		this.hairColur=hairColur;
	}
	public void setHieght(int hieght)
	{
		this.hieght=hieght;
	}
	public void setWheight(int wheight)
	{
		this.wheight=wheight;
	}
	public String getName()
	{
		return this.name;
	}
	public String getGender()
	{
		return this.gender;
	}
	public String gethaircolur()
	{
		return this.hairColur;
	}
	public int getHieght()
	{
		return this.hieght;
	}
	public int getWheight()
	{
		return this.wheight;
	}
	
}
class Student extends Person
{
	private int rollno;
	private int standard;
	private int id;
	
	public void setRollno(int rollno)
	{
		this.rollno=rollno;
	}
	public void setStandard(int standard)
	{
		this.standard=standard;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getRollno()
	{
		return this.rollno;
	}
	public int getStandard()
	{
		return this.standard;
	}
	public int getId()
	{
		return this.id;
	}
}
class Test
{
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			Student ob = new Student();
			System.out.println("Enter The Name of Student:");
			String name = sc.nextLine();
			ob.setName(name);
			sc.next();
			System.out.println("Enter The ID of Student:");
			int ID= sc.nextInt();
			ob.setId(ID);
			// System.out.println("Enter The Standard of Student:");
			// int std= sc.nextInt();
			// ob.setStandard(std);
			// System.out.println("Enter The Roll Number of Student:");
			// int roll= sc.nextInt();
			// ob.setRollno(roll);
			// sc.nextLine();
			// System.out.println("Enter The Colour Of Hair of Student:");
			// String hair = sc.nextLine();
			// ob.sethaircolur(hair);
			// System.out.println("Enter The Gender of Student:");
			// String gender = sc.nextLine();
			// ob.setGender(gender);
			// System.out.println("Enter Hieght:");
			// int h = sc.nextInt();
			// ob.setHieght(h);
			// System.out.println("Enter Whieght:");
			// int w= sc.nextInt();
			// ob.setWheight(w);
			System.out.println("The Name of Student Is: "+ob.getName());
			// System.out.println("The Roll Number  of Student Is: "+ob.getRollno());
			// System.out.println("The Standard of Student Is: "+ob.getStandard());
			 System.out.println("The ID of Student Is: "+ob.getId());
			// System.out.println("The Gender of Student Is: "+ob.getGender());
			// System.out.println("The Colour of Hair of Student Is: "+ob.gethaircolur());
			// System.out.println("The Whieght of Student Is: "+ob.getWheight());
			//System.out.println("Hieght "+ob.getHieght());
		}
}
			
			//System.out.println("");