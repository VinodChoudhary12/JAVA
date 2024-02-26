import java.util.Scanner;
class ArmPojo
{
	int n,c;
	Scanner sc = new Scanner(System.in);
	public void setN()
	{
		System.out.println("Enter The Number");
		n=sc.nextInt();
		this.n=n;
	}
	public void setC()
	{
		c=this.n;
		this.c=c;
	}
	public int getN()
	{
		return this.n;
	}
	public int getC()
	{
		return this.c;
	}
}
class Opration
{
	public void arm(ArmPojo ref)
	{
		int arm=0;
		while(ref.getN()>0)
		{
			int rem=ref.getN()%10;
			ref.getN()=ref.getN()/10;
			arm=(arm+rem*rem*rem);
		}
	
		if(ref.getC()==arm)
			System.out.println("The Number Is Armstrong:");
		else
			System.out.println("The Number Is Armstrong:");
		
	}
}
class Test
{
	public static void main(String args[])
	{
		ArmPojo ob = new ArmPojo();
		Opration clo = new Opration();
		ob.setN();
		clo.arm(ob);
	}
}
		
	