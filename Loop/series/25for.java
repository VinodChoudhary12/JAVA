//2/x^2+4/x^4+6/x^6


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
		i=1;
	while(i<=y)
	 {
	   pow=pow*n;
	   if(j%2==0)
	   {
	     sum=sum+(j/pow);
	     System.out.print(j+"/"+n+"^"+j);
	     if(i<n)
	     System.out.print("+");
	     i++;
	   }
	    j++;
	 }
	 	System.out.print("="+sum);
	}
}
