//WAP to 1/x^1 - 2/x^2 + 3/x^3 - 4/x^4 + 5/x^5 =  -0.28125
import java.util.Scanner;
class Test
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		 int x,y,i=1;
		
		float sum=0,pow=1;
		 System.out.println("Enter The number");
		 x = sc.nextInt();
		 System.out.println("Enter The Power");
		 y = sc.nextInt();
		for(i=1;i<=y;i++){
		 	pow*=x;
		if(i%2==0){
			sum+=i/pow;
		 	System.out.print("-"+i+"/"+x+"^"+i+"+");
		 	   }
		else{
			sum-=i/pow;
		 	System.out.print(i+"/"+x+"^"+i);
		     }
		     		}
		 	System.out.print("="+sum);
		 			
	}	
}
