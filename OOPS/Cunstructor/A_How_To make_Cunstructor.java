class Test //for cunstructor
{
	private int a,b,c;
	public Test()
	{
		this.a=0;
		this.b=0;
		this.c=0;
		System.out.println("Zero Argument Cunstructor.....");
		//we creat this cunstructor..........
	}
	public Test (int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println("Parameterized  Cunstructor.....");
	}
	public Test(int a,int b)
	{
		this.a=a;
		this.b=b;
		//cunstructor for 2 parameters
	}
	public Test(int a)
	{
		this.a=a;
		//cunstructor for 1 parameters
	}
	public Test(Test k)
	{
		
		this.a=k.a;
		this.b=k.b;
		this.c=k.c;
		System.out.println("COPY...  Cunstructor.....");
	}
	public void display()
	{
		System.out.println("A="+this.a+"B="+this.b+"C="+this.c);
	}
}
	
class TestMain //Client Class
{
	public static void main(String args[])
	{
		Test ob = new Test();//Calling Zero Argumnets Cunstructor.............
		Test ob2 = new Test(10,20,30);//Calling Parameterized Cunstructor...........
		//Test ob2 = new Test(10);	//A=10 b=0 c=0	
		//Test ob2 = new Test(10,20);	//A=10 b=20 c=0
		//Test ob2 = new Test(10.20,30);	//A=10 b=20 c=30  ABC Intialize By this value Sarting value 			
		Test ob3= new Test(ob2);//Calling Copy Cunstructor...........
		
		//Test ob3 = ob2;//Calling paramiterized Cunstructor...........
		ob.display();
		ob2.display();
		ob3.display();
	}
}
		
	