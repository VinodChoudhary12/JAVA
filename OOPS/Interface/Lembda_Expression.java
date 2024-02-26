@Function
interface MyLemda
{
	//void display();
	int Square(int n);
}
class Test
{
	public static void main(String args[])
	{
		//MyLemda ob = ()->{System.out.println("Hello Display");};
		MyLemda ob1=(int a)->{return(a*a);};
	
		//ob.display();
		System.out.println(ob1.Square(5));
	}
}