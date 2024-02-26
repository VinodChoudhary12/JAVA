//x^2/2+x^4/4+x^6/6=145

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
		
	 do{
	 
	      pow=pow*n;
	      
	      if(j%2==0)
	      {
	        sum =sum+(pow/j);
	        System.out.print(n+"^"+j+"/"+j);
	        if(i<n)
	          System.out.print("+");
	        i++;
	       }
	      j++;
	    }
	    while(i<=y);
	       System.out.print("="+sum);
	    
	}
}   
	       
	        
	  	
