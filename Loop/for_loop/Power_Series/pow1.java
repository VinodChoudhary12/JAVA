//WAP to x^1 + x^2 + x^3 + x^4 + x^5 = 62
import java.util.Scanner;
class Test
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int x,y,i=1;
		int pow=1,sum=0;
		System.out.println("Enter The number");
		x = sc.nextInt();
		System.out.println("Enter The Power");
		y = sc.nextInt();
	for(i=1;i<=y;i++)
{	
		pow*=x;
	if(i==y){
		sum+=pow;
		System.out.print(x+"^"+i+"=");}
	else{
		sum+=pow;
		System.out.print(x+"^"+i+"=");}
}

	System.out.print(sum);
}
}

		
