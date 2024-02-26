class Person
{
    int age;
    String gender;
    String name;
    int hieght;
    int wheight;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getHieght() {
        return hieght;
    }
    public void setHieght(int hieght) {
        this.hieght = hieght;
    }
    public int getWheight() {
        return wheight;
    }
    public void setWheight(int wheight) {
        this.wheight = wheight;
    }
   
	public void Name()
	{
		System.out.println("The Name Of Person is: "+getName());
	}
    public void Age()
    {
       System.out.println("The Age of "+getName()+" Is "+getAge()); 
    }
    public void Wheight()
    {
        System.out.println("The Wheight of "+getName()+" Is "+getWheight());
    }
    public void Hieght()
    {
        System.out.println("The Hieght of "+getName()+" Is "+getHieght());
    }
    public void Gender()
    {
        System.out.println("The Gender of "+getName()+" Is "+getGender ());
    }
   

}
class Student extends Person
{
    private  int roll;
    private int Studentid;
    String standard;
     public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public int getStudentid() {
        return Studentid;
    }
    public void setStudentid(int studentid) {
        Studentid = studentid;
    }
    public String getStandard() {
        return standard;
    }
    public void setStandard(String standard) {
        this.standard = standard;
    }

    public void StudentName()
    {
        System.out.println("The name Of Student is:"+getName());
    }
    public void StudentId()
    {
        System.out.println("The Student ID of "+getName()+" Is "+getStudentid());
    }
    public void StudentRoll()
    {
        System.out.println("The Roll Number of "+getName()+" Is "+getRoll());
    }
    public void StudentStandard()
    {
        System.out.println("The Standard of "+getName()+" Is "+getStandard());
    }
      

}

class Employee extends Person
{
    private int Emplid;
    private int PFNumber;
    private int ESIC;
    private int salary;

    
     public int getEmplid() 
	{
        return Emplid;
    }
    public void setEmplid(int emplid)
	{
        Emplid = emplid;
    }
    public int getPFNumber() 
	{
        return PFNumber;
    }
    public void setPFNumber(int pFNumber) 
	{
        PFNumber = pFNumber;
    }
    public int getESIC()
	{
        return ESIC;
    }
    public void setESIC(int eSIC) 
	{
        ESIC = eSIC;
    }
    public int getSalary() 
	{
        return salary;
    }
    public void setSalary(int salary) 
	{
        this.salary = salary;
    }
    public void EmpName()
    {
            System.out.println("The Name of Employee Is"+getName());
    }
    public void Emplid()
    {
            System.out.println("The Employee ID of "+getName()+" Is "+getEmplid());
    }
    public void EmpPf()
    {
            System.out.println("The PF Number  of "+getName()+" Is "+getPFNumber());
    }
    public void ESIC()
    {
            System.out.println("The ESIC Number  of "+getName()+" Is "+getESIC());
    }
    public void salary()
    {
            System.out.println("The Salary of "+getName()+" Is "+getSalary());
    }

}
class Test
{
    public static void main(String[] args)
     {
        Student stu = new Student();
		Employee em = new Employee();
		stu.setName("Vinod");
		stu.setStudentid(123);
		stu.setAge(22);
		stu.setRoll(12345);
		stu.setGender("Male");
		stu.setStandard("BSC");
		stu.setHieght(6);
		stu.setWheight(78);
		
		stu.StudentName();
		stu.StudentId();
		stu.StudentRoll();
		stu.Age();
		stu.StudentStandard();
		stu.Gender();
		stu.Hieght();
		stu.Wheight();
		
		
		
     }
}