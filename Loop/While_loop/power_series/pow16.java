//2^1/1+2^2/3+2^3/5+2^4/7+2^5/9

import java.util.Scanner;;
class Test
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int x = sc.nextInt();
		System.out.println("Enter the Power:");
		int y= sc.nextInt();
		int i=1,k=1;
		double pow=1; 
		double sum=0;
	  
		
	while(i<=y)
	{
		if(i==y){
		pow=pow*x;
		k=(i*2-1);
		sum=sum+(pow/k);
		System.out.print(x+"^"+i+"/"+k+"=");}
		
		else{
		pow=pow*x;
		k=(i*2-1);
		sum=sum+(pow/k);
		System.out.print(x+"^"+i+"/"+k+"+");}	i++;
		
	}
		System.out.print(sum);
	}
	}
	
		
		
