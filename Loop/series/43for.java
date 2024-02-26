//x^1/!2+x^3+!4+x^5/!6=2.9625


import java.util.Scanner;
class Test
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n,y,i=1,j=1;
		double pow=1,fact=1;
		double sum=0;
		System.out.println("Enter The number");
		n = sc.nextInt(); 
		System.out.println("Enter The Power");
		y = sc.nextInt(); 
	 
	   for(i=1;i<=y;)
	   {
	      fact=fact*j;
	      pow=pow*n;
	      if(j%2!=0)
	      {
	         sum=sum+(pow/fact);
	         System.out.print(n+"^"+j+"/!"+(j+1));
	         if(j<n)
	         System.out.print("+");
	       i++;
	      }
	    j++;
	  }
	  System.out.print("="+sum);
	}
}
	         
	         
	    
	   	
		
	
		
