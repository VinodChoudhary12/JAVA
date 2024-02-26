class Person
{
	String name;
	String age;
	int weight;
	String height;
	void setData(String name,String age, int weight, String height)
	{
		this.name  = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	public void getPerson()
	{
		System.out.println("Name :"+name+"\nAge :"+age+"\nWeight(in kgs) :"+weight+"\nHeight :"+height);
	}
	
}
class Employee extends Person
{
	int salary;
	public void setData(String name, String age, int weight, String height, int salary)
	{
		this.setData(name, age, weight, height);
		this.salary = salary;
		
	}
	public void getEmployee()
	{
	  System.out.println("Salary :"+salary);
	}
	
}
class Test
{
	public static void main(String args [])
	{
		Employee ob = new Employee();
		ob.setData("Vinod", "22", 50,"175 cms",50000 );
		ob.getPerson();
		ob.getEmployee();
	}
}