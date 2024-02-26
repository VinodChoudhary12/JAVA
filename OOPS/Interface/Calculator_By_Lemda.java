import java.util.Scanner;
interface MyInf
{
	int Caluator(int a,int b);
}
class Test
{
	public static void main(String []args)
	{
		int ch;
		Scanner sc = new Scanner(System.in);
		MyInf ob1 =(x,y)->(x+y);
		MyInf ob2 =(x,y)->(x-y);
		MyInf ob3 =(x,y)->(x/y);
		MyInf ob4 =(x,y)->(x*y);
		do
		{
		System.out.println("\tPress 1 For Add Two Numbers");
		System.out.println("\tPress 2 For Subtract Two Numbers");
		System.out.println("\tPress 3 For Divison Two Numbers");
		System.out.println("\tPress 4 For Multiplication Two Numbers");
		System.out.println("\tPress 5 For Exit:");
		System.out.println("\tEnter Your Choice:");
		ch= sc.nextInt();
		switch(ch)
		{
			case 1:
					System.out.println("Enter The First Number:");
					int a=sc.nextInt();
					System.out.println("Enter The First Number:");
					int b=sc.nextInt();
					System.out.println(ob1.Caluator(a,b));
					break;
			case 2:
					System.out.println("Enter The First Number:");
					a=sc.nextInt();
					System.out.println("Enter The First Number:");
					b=sc.nextInt();
					System.out.println(ob2.Caluator(a,b));
					break;
			case 3:
					System.out.println("Enter The First Number:");
					a=sc.nextInt();
					System.out.println("Enter The First Number:");
					b=sc.nextInt();
					System.out.println(ob3.Caluator(a,b));
					break;
			case 4:
					System.out.println("Enter The First Number:");
					a=sc.nextInt();
					System.out.println("Enter The First Number:");
					b=sc.nextInt();
					System.out.println(ob4.Caluator(a,b));
					break;
		}
		}while(ch!=5);
	}
}