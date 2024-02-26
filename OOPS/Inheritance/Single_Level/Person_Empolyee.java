import java.util.Scanner;

class Person 
{
    String name;
    String gender;
    String hairColor;
	int age;
    int height;
    int weight;

    public void setData(String name, String gender, String hairColor,int age, int height, int weight)
	{
        this.name = name;
        this.gender = gender;
        this.hairColor = hairColor;
		this.age=age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() 
	{
        return this.name;
    }

    public String getGender() 
	{
        return this.gender;
    }

    public String getHairColor()
	{
        return this.hairColor;
    }
	public int getAge()
	{
		return this.age;
	}

    public int getHeight() 
	{
        return this.height;
    }

    public int getWeight()
	{
        return this.weight;
    }
}

class Employee extends Person
{
	private int id;
	private int salary;
	private int  PFNumber;
	private int ESIC;
	public void setData(String name, String gender, String hairColor,int age, int height, int weight,int id,int salary,int PFNumber,int ESIC)
	{
		setData(name, gender, hairColor,age, height, weight);
		this.id=id;
		this.salary=salary;
		this.PFNumber=PFNumber;
		this.ESIC=ESIC;
	}
	public int getId()
	{
		return this.id;
	}
	public int getSalary()
	{
		return this.salary;
	}
	public int getPFNumber()
	{
		return this.PFNumber;
	}
	public int getESIC()
	{
		return this.ESIC;
	}
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Employee ob = new Employee();
		System.out.println("Enter The Name Of Employee:");
		String name = sc.nextLine();
		System.out.println("Enter The ID Of Employee:");
		int id = sc.nextInt();
		System.out.println("Enter The Age Of Employee:");
		int age = sc.nextInt();
		System.out.println("Enter The Salary Of Employee:");
		int salary= sc.nextInt();
		
		System.out.println("Enter PF Number  Of Employee:");
		int pf = sc.nextInt();
		
		System.out.println("Enter The ESIC Number Of Employee:");
		int esic= sc.nextInt();
		
		System.out.println("Enter The Hieght Of Employee:");
		int h = sc.nextInt();
		
		System.out.println("Enter The Whieght Of Employee:");
		int wh= sc.nextInt();
		sc.nextLine();
		
		//do
		
			System.out.println("Enter The Gender Of Employee Male OR Female:");
			String gen = sc.nextLine();
		//}while(gen==male||gen==female||gen==Male||gen==Female);
			System.out.println("Enter The Colur Of Employee :");
			String hairColor = sc.nextLine();
		ob.setData(name, gen, hairColor,age, h, wh,id,salary,pf,esic);
		System.out.println("The Name of Employee Is "+ob.getName());
		System.out.println("The Age of "+ob.getName()+" Is:"+ob.getAge());
		System.out.println("The Salary of "+ob.getName()+" Is:"+ob.getSalary());
		System.out.println("The Employee ID of "+ob.getName()+" Is:"+ob.getId());
		System.out.println("The Gender of "+ob.getName()+" Is:"+ob.getGender());
		System.out.println("The PF Number of "+ob.getName()+" Is:"+ob.getPFNumber());
		System.out.println("The ESIC Number of "+ob.getName()+" Is:"+ob.getESIC());
		System.out.println("The Hieght of "+ob.getName()+" Is:"+ob.getHeight());
		System.out.println("The Whieght of "+ob.getName()+" Is:"+ob.getWeight());
	}
}
		
	
	
	
	
	
	
// class Test 
// {
    // public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // Person person = new Person();

        // System.out.println("Enter Person Details");
        // System.out.println("Enter Name:");
        // String name = sc.nextLine();
        // System.out.println("Enter Gender:");
        // String gender = sc.nextLine();
        // System.out.println("Enter Hair Color:");
        // String hairColor = sc.nextLine();
		// System.out.println("Enter Height:");
        // int height = sc.nextInt();
        // System.out.println("Enter Age:");
        // int age = sc.nextInt();
        // System.out.println("Enter Weight:");
        // int weight = sc.nextInt();

        // person.setData(name, gender, hairColor, age,height, weight);

        // System.out.println("Person Details:");
        // System.out.println("Name: " + person.getName());
        // System.out.println("Gender: " + person.getGender());
        // System.out.println("Hair Color: " + person.getHairColor());
        // System.out.println("Height: " + person.getHeight());
        // System.out.println("Weight: " + person.getWeight());
		// System.out.println("Weight: " + person.getAge());
    // }
// }