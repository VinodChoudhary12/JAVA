//WAP Fectoriyal Serices sum 1!-2!+3!-4!+5! = 101
import java.util.Scanner;
public class s3
{
	public static void main(String[]args)
	{
		int fact=1,i=1,n,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		for(i=1;i<=n;i++)
	{
		fact*=i;
	if(i%2==0){
		System.out.print("-"+i+"!+");
		sum-=fact;}
	else {	
		System.out.print(i+"!");
		sum+=fact;}
	}
		System.out.print("="+sum);
}
}
		
