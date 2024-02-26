//#hybrid inheritance by interface
class Student
{
	int roll;
	String name;
	public Student()
	{
		//Empty or defult cunstructor
	}
	public Student(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
	}
	public void display()
	{
		System.out.println("Roll Number: "+this.roll);
		System.out.println("Name : "+this.name);
	}
}
interface Extra
{
	int total();
}
class Marks extends Student
{
	int p,c,m;
	public Marks()
	{
		
	}
	public Marks(String name,int roll,int p,int c,int m)
	{
		super(roll,name);
		this.p=p;
		this.c=c;
		this.m=m;
	}
	public void display()
	{
		super.display();
		System.out.println("Physics Marks: "+this.p);
		System.out.println("Chemestry Marks: "+this.c);
		System.out.println("Maths Marks: "+this.m);
	}
	
}
class Result extends Marks implements Extra
{
	public Result()
	{
		
	}
	public Result(String name,int roll,int p,int c,int m)
	{
		super(name,roll,p,c,m);
	}
	public int total()
	{
		return this.p+this.m+this.c;
	}
	public void display()
	{
		super.display();
	}
	public double percatnge(int total)
	{
		double per = total()/3.0;
		return per;
	}
}
class Test
{
	public static void main(String []args)
	{
		Result ob = new Result("Vinod",1234,99,88,95);
		ob.display();
	
	int total=ob.total();
		System.out.println("The Total Number of Marks Is :"+total);
		System.out.println("The Percatnge Is :"+ob.percatnge(total));
	}
}