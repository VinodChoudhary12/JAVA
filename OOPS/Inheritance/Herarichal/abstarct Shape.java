abstract class Test
{
    int x;

    public Test(int x)
     {
        this.x = x;
        System.out.println("Test Constructo......");
    }
    public abstract void Display();
}
class Test1 extends Test
{
    int y;

    public Test1(int x, int y) 
    {
        super(x);
        this.y = y;
        System.out.println("Test1 Constructo......");
    }
    public void Display()
    {
        System.out.println("X="+this.x);
        System.out.println("Y="+this.y);
    }
}
class Test2 extends Test
{
    int z;
    public Test2(int x, int z) {
        super(x);
        this.z = z;
        System.out.println("Test1 Constructo......");
    }
    public void Display()
    {
        System.out.println("X="+this.x);
        System.out.println("Z="+this.z);
    }  
}
class Main
{
    public static void main(String[] args) 
    {
        Test ref;
        Test1 ob1=new Test1(2, 4);
        Test2 ob2 = new Test2(8, 12);
        ref=ob1;
        ref.Display();
        ref=ob2;
        ref.Display();
    }
}
