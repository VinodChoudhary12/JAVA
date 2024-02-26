//WAP Fectoriyal Serices sum 1!+2!+3!+4!+5! = 153
import java.util.Scanner;
class s1
{
	public static void main(String[]args)
	{
		int fact=1,i=1,n,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
	for(i=1;i<n;i++){
		fact=fact*i;
		sum+=fact;
		System.out.print(i+"!+");}
	if(i==n){
		fact=fact*i;
		sum+=fact;
		System.out.print(i+"!");
		}
	
		System.out.print("="+sum);
	
		
	
		
		
		
		
		
		
		
		
		
}
}
	
	
