import java.util.Scanner;
class Test
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int x = sc.nextInt();
		System.out.println("Enter the Power:");
		int y= sc.nextInt();
		int i=1;
		double pow=1; 
		double sum=0;
		double j=0;  
		
		while(i<=y)
		{	
			if(i==y){
				System.out.print(x+"^"+i+"/"+(i+1)+"=");
				pow=pow*x;
				j=(pow/(i+1));
				sum=sum+j;}
				
		 else{
		 	pow=pow*x;
			j=(pow/(i+1));
			sum=sum+j;
		 	System.out.print(x+"^"+i+"/"+(i+1)+"+");}
		 	i++;
		 }
		 	System.out.print(sum);
		 }
		 }
		 
