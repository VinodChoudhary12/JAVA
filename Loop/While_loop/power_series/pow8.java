//  1/x^1 - 2/x^2 + 3/x^3 - 4/x^4 + 5/x^5

import java.util.Scanner;
class Test
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Pumber");
		int x = sc.nextInt();
		System.out.println("Enter The Power");
		int y = sc.nextInt();
		int i=1;
		double pow=1;
		double j=0;
		double sum=0;
	while(i<=y)
	{
		pow=pow*x;
		j=i/pow;
	
		if(i%2==0){
		sum=sum-j;
		System.out.print(" -"+i+"/"+x+"^"+i);
		}
		
		else if(i==1){
		sum=sum+j;
			System.out.print(i+"/"+x+"^"+i);
			}
		
		else{
		sum=sum+j;
			System.out.print(" +"+i+"/"+x+"^"+i);
			//sum=sum+j;
			}
			i++;
}
	System.out.print(" ="+sum);
}
}
