//WAP to -x^1/1 + x^2/2 - x^3/3 + x^4/4 - x^5/5  = -5.0666666
import java.util.Scanner;
class Test
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int x,y,i=1;
		
		float sum=0,pow=1;
		System.out.println("Enter The Number");
		x=sc.nextInt();
		System.out.println("Enter The Power");
		y=sc.nextInt();
		for(i=1;i<=y;i++)
{
		pow*=x;
		if(i%2!=0){
		sum-=pow/i;
		System.out.print("-"+x+"^"+i+"/"+i);}
		else{
		sum+=pow/i;
		System.out.print("+"+x+"^"+i+"/"+i);}
}
		System.out.print("="+sum);
}
}

