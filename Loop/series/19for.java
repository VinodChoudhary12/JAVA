import java.util.Scanner;
class Test
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n,y,i=1;
		int j=1;
		double pow=1;
		double sum=0;
		System.out.println("Enter The number");
		n = sc.nextInt(); 
		System.out.println("Enter The Power");
		y = sc.nextInt(); 
		
		for(i=1;i<=y; )
		{ 	
			pow=pow*n;	
		  if(j%2==0)
		   {
		      sum=sum+pow;
		      i++;
		      System.out.print(n+"^"+j);
		      if(y<=n)
		        System.out.print("+");
		    }
		 j++;
		 }
		 System.out.print("="+sum);
	}
}
