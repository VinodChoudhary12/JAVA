 class Student
{
    int rollNumber;
    String Name;
    Address add;
    public Student(int rollNumber, String Name, int HouseNumber,String city ,String state)
    {
        this.rollNumber = rollNumber;
        this.Name = Name;
        add=new Address(HouseNumber,city,state);
    }
    void displayStud()
    {
        System.out.println("Roll :"+this.rollNumber);
        System.out.println("Name:"+this.Name);
        this.add.displayAdd();
    }

 class Address
 {
    int HouseNumber;
    String city,state;
    public Address(int HouseNumber,String city,String state)
    {
        this.HouseNumber=HouseNumber;
        this.state=state;
    }
    public void displayAdd()
    {
        System.out.println("House Number:"+this.HouseNumber);
        System.out.println("State:"+this.state);
    }
 }   
}
class Test
{
    public static void main(String[] args)
     {
        Student ob = new Student(101, "Vinod", 333, "INDORE", "MP");
        ob.displayStud();        
    }
}
